package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.AttendeeResponseStatus
import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalGuestsComment extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var email: String
  var id: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var organizer: Boolean
  var resource: Boolean
  var responseStatus: AttendeeResponseStatus
  var self: Boolean
}

object Anon_AdditionalGuestsComment {
  @scala.inline
  def apply(
    email: String,
    id: String,
    organizer: Boolean,
    resource: Boolean,
    responseStatus: AttendeeResponseStatus,
    self: Boolean,
    additionalGuests: js.UndefOr[integer] = js.undefined,
    comment: String = null,
    displayName: String = null,
    optional: js.UndefOr[Boolean] = js.undefined
  ): Anon_AdditionalGuestsComment = {
    val __obj = js.Dynamic.literal(email = email, id = id, organizer = organizer, resource = resource, responseStatus = responseStatus, self = self)
    if (!js.isUndefined(additionalGuests)) __obj.updateDynamic("additionalGuests")(additionalGuests)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[Anon_AdditionalGuestsComment]
  }
}

