package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// calendarId: 'primary' or the calendar from which the event to be deleted
// eventId: the event that need to be deleted from calendar (Event.id from the list/insert response)
trait EventsDeleteParameters extends js.Object {
  var calendarId: String
  var eventId: String
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
}

object EventsDeleteParameters {
  @scala.inline
  def apply(calendarId: String, eventId: String, sendNotifications: js.UndefOr[Boolean] = js.undefined): EventsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsDeleteParameters]
  }
}

