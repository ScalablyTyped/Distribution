package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonResponse extends js.Object {
  /**
    * &#42;&#42;DEPRECATED&#42;&#42; (Please use status instead)
    *
    * [HTTP 1.1 status code]
    * (http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html).
    */
  var httpStatusCode: js.UndefOr[Double] = js.undefined
  /** The person. */
  var person: js.UndefOr[Person] = js.undefined
  /**
    * The original requested resource name. May be different than the resource
    * name on the returned person.
    *
    * The resource name can change when adding or removing fields that link a
    * contact and profile such as a verified email, verified phone number, or a
    * profile URL.
    */
  var requestedResourceName: js.UndefOr[String] = js.undefined
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.undefined
}

object PersonResponse {
  @scala.inline
  def apply(
    httpStatusCode: Int | Double = null,
    person: Person = null,
    requestedResourceName: String = null,
    status: Status = null
  ): PersonResponse = {
    val __obj = js.Dynamic.literal()
    if (httpStatusCode != null) __obj.updateDynamic("httpStatusCode")(httpStatusCode.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person)
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PersonResponse]
  }
}

