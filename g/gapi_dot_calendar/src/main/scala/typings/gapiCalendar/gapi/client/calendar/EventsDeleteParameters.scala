package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// calendarId: 'primary' or the calendar from which the event to be deleted
// eventId: the event that need to be deleted from calendar (Event.id from the list/insert response)
@js.native
trait EventsDeleteParameters extends js.Object {
  var calendarId: String = js.native
  var eventId: String = js.native
  var sendNotifications: js.UndefOr[Boolean] = js.native
}

object EventsDeleteParameters {
  @scala.inline
  def apply(calendarId: String, eventId: String): EventsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsDeleteParameters]
  }
  @scala.inline
  implicit class EventsDeleteParametersOps[Self <: EventsDeleteParameters] (val x: Self) extends AnyVal {
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
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendNotifications(value: Boolean): Self = this.set("sendNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotifications: Self = this.set("sendNotifications", js.undefined)
  }
  
}

