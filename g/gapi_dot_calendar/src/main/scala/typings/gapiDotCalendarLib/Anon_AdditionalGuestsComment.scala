package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalGuestsComment extends js.Object {
  var additionalGuests: js.UndefOr[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var email: java.lang.String
  var id: java.lang.String
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var organizer: scala.Boolean
  var resource: scala.Boolean
  var responseStatus: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AttendeeResponseStatus
  var self: scala.Boolean
}

object Anon_AdditionalGuestsComment {
  @scala.inline
  def apply(
    email: java.lang.String,
    id: java.lang.String,
    organizer: scala.Boolean,
    resource: scala.Boolean,
    responseStatus: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AttendeeResponseStatus,
    self: scala.Boolean,
    additionalGuests: js.UndefOr[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer] = js.undefined,
    comment: java.lang.String = null,
    displayName: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AdditionalGuestsComment = {
    val __obj = js.Dynamic.literal(email = email, id = id, organizer = organizer, resource = resource, responseStatus = responseStatus, self = self)
    if (!js.isUndefined(additionalGuests)) __obj.updateDynamic("additionalGuests")(additionalGuests)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[Anon_AdditionalGuestsComment]
  }
}

