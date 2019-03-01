package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsUpdateParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[scala.Boolean] = js.undefined
  var calendarId: java.lang.String
  var eventId: java.lang.String
  var maxAttendees: js.UndefOr[integer] = js.undefined
  // Event resource
  var resource: EventInput
  var sendNotifications: js.UndefOr[scala.Boolean] = js.undefined
  var supportsAttachments: js.UndefOr[scala.Boolean] = js.undefined
}

object EventsUpdateParameters {
  @scala.inline
  def apply(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    resource: EventInput,
    alwaysIncludeEmail: js.UndefOr[scala.Boolean] = js.undefined,
    maxAttendees: js.UndefOr[integer] = js.undefined,
    sendNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    supportsAttachments: js.UndefOr[scala.Boolean] = js.undefined
  ): EventsUpdateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calendarId")(calendarId)
    __obj.updateDynamic("eventId")(eventId)
    __obj.updateDynamic("resource")(resource)
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail)
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees)
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications)
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments)
    __obj.asInstanceOf[EventsUpdateParameters]
  }
}

