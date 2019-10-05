package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsInsertParameters extends js.Object {
  var calendarId: String
  var maxAttendees: js.UndefOr[integer] = js.undefined
  // Event resource
  var resource: EventInput
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  var supportsAttachments: js.UndefOr[Boolean] = js.undefined
}

object EventsInsertParameters {
  @scala.inline
  def apply(
    calendarId: String,
    resource: EventInput,
    maxAttendees: Int | Double = null,
    sendNotifications: js.UndefOr[Boolean] = js.undefined,
    supportsAttachments: js.UndefOr[Boolean] = js.undefined
  ): EventsInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, resource = resource)
    if (maxAttendees != null) __obj.updateDynamic("maxAttendees")(maxAttendees.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications)
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments)
    __obj.asInstanceOf[EventsInsertParameters]
  }
}

