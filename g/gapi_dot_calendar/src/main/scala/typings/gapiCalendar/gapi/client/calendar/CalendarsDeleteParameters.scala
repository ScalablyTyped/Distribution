package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsDeleteParameters extends js.Object {
  var calendarId: String = js.native
}

object CalendarsDeleteParameters {
  @scala.inline
  def apply(calendarId: String): CalendarsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsDeleteParameters]
  }
  @scala.inline
  implicit class CalendarsDeleteParametersOps[Self <: CalendarsDeleteParameters] (val x: Self) extends AnyVal {
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
  }
  
}

