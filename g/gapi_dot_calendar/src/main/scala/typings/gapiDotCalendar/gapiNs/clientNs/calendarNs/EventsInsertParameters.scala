package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

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
    maxAttendees: js.UndefOr[integer] = js.undefined,
    sendNotifications: js.UndefOr[Boolean] = js.undefined,
    supportsAttachments: js.UndefOr[Boolean] = js.undefined
  ): EventsInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, resource = resource)
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees)
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications)
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments)
    __obj.asInstanceOf[EventsInsertParameters]
  }
}

