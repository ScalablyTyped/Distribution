package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsUpdateParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  var calendarId: String
  var eventId: String
  var maxAttendees: js.UndefOr[integer] = js.undefined
  // Event resource
  var resource: EventInput
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  var supportsAttachments: js.UndefOr[Boolean] = js.undefined
}

object EventsUpdateParameters {
  @scala.inline
  def apply(
    calendarId: String,
    eventId: String,
    resource: EventInput,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    maxAttendees: js.UndefOr[integer] = js.undefined,
    sendNotifications: js.UndefOr[Boolean] = js.undefined,
    supportsAttachments: js.UndefOr[Boolean] = js.undefined
  ): EventsUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, eventId = eventId, resource = resource)
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail)
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees)
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications)
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments)
    __obj.asInstanceOf[EventsUpdateParameters]
  }
}

