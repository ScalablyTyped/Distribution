package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  /** Domain, or broad category, of the error. */
  var domain: js.UndefOr[String] = js.native
  /**
    * Specific reason for the error. Some of the possible values are:
    * - "groupTooBig" - The group of users requested is too large for a single query.
    * - "tooManyCalendarsRequested" - The number of calendars requested is too large for a single query.
    * - "notFound" - The requested resource was not found.
    * - "internalError" - The API service has encountered an internal error.  Additional error types may be added in the future, so clients should gracefully
    * handle additional error statuses not included in this list.
    */
  var reason: js.UndefOr[String] = js.native
}

object Error {
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

