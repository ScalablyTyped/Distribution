package typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /** Domain, or broad category, of the error. */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Specific reason for the error. Some of the possible values are:
    * - "groupTooBig" - The group of users requested is too large for a single query.
    * - "tooManyCalendarsRequested" - The number of calendars requested is too large for a single query.
    * - "notFound" - The requested resource was not found.
    * - "internalError" - The API service has encountered an internal error.  Additional error types may be added in the future, so clients should gracefully
    * handle additional error statuses not included in this list.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object Error {
  @scala.inline
  def apply(domain: String = null, reason: String = null): Error = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Error]
  }
}

