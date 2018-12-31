package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

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
  var httpStatusCode: js.UndefOr[scala.Double] = js.undefined
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
  var requestedResourceName: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.undefined
}

