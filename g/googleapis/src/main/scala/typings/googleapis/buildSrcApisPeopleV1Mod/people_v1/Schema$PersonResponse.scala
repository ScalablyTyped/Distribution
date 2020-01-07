package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single person
  */
@js.native
trait Schema$PersonResponse extends js.Object {
  /**
    * **DEPRECATED** (Please use status instead)  [HTTP 1.1 status code]
    * (http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html).
    */
  var httpStatusCode: js.UndefOr[Double] = js.native
  /**
    * The person.
    */
  var person: js.UndefOr[Schema$Person] = js.native
  /**
    * The original requested resource name. May be different than the resource
    * name on the returned person.  The resource name can change when adding or
    * removing fields that link a contact and profile such as a verified email,
    * verified phone number, or a profile URL.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  /**
    * The status of the response.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$PersonResponse {
  @scala.inline
  def apply(
    httpStatusCode: Int | Double = null,
    person: Schema$Person = null,
    requestedResourceName: String = null,
    status: Schema$Status = null
  ): Schema$PersonResponse = {
    val __obj = js.Dynamic.literal()
    if (httpStatusCode != null) __obj.updateDynamic("httpStatusCode")(httpStatusCode.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PersonResponse]
  }
}

