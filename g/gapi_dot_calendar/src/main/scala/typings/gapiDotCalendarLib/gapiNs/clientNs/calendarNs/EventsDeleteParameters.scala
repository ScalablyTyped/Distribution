package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// calendarId: 'primary' or the calendar from which the event to be deleted
// eventId: the event that need to be deleted from calendar (Event.id from the list/insert response)
trait EventsDeleteParameters extends js.Object {
  var calendarId: java.lang.String
  var eventId: java.lang.String
  var sendNotifications: js.UndefOr[scala.Boolean] = js.undefined
}

object EventsDeleteParameters {
  @scala.inline
  def apply(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    sendNotifications: js.UndefOr[scala.Boolean] = js.undefined
  ): EventsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, eventId = eventId)
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications)
    __obj.asInstanceOf[EventsDeleteParameters]
  }
}

