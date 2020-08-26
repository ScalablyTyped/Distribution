package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsGetParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  var calendarId: String = js.native
  var eventId: String = js.native
  var maxAttendees: js.UndefOr[integer] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object EventsGetParameters {
  @scala.inline
  def apply(calendarId: String, eventId: String): EventsGetParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsGetParameters]
  }
  @scala.inline
  implicit class EventsGetParametersOps[Self <: EventsGetParameters] (val x: Self) extends AnyVal {
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
    def setAlwaysIncludeEmail(value: Boolean): Self = this.set("alwaysIncludeEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysIncludeEmail: Self = this.set("alwaysIncludeEmail", js.undefined)
    @scala.inline
    def setMaxAttendees(value: integer): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

