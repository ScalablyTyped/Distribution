package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Busy
import typings.gapiCalendar.anon.Calendars
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusy_ extends js.Object {
  
  def calendars(key: String): Busy = js.native
  
  def groups(key: String): Calendars = js.native
  
  var kind: calendarNumbersignfreeBusy = js.native
  
  var timeMax: datetime = js.native
  
  var timeMin: datetime = js.native
}
object FreeBusy_ {
  
  @scala.inline
  def apply(
    calendars: String => Busy,
    groups: String => Calendars,
    kind: calendarNumbersignfreeBusy,
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy_ = {
    val __obj = js.Dynamic.literal(calendars = js.Any.fromFunction1(calendars), groups = js.Any.fromFunction1(groups), kind = kind.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy_]
  }
  
  @scala.inline
  implicit class FreeBusy_Ops[Self <: FreeBusy_] (val x: Self) extends AnyVal {
    
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
    def setCalendars(value: String => Busy): Self = this.set("calendars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroups(value: String => Calendars): Self = this.set("groups", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKind(value: calendarNumbersignfreeBusy): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMax(value: datetime): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMin(value: datetime): Self = this.set("timeMin", value.asInstanceOf[js.Any])
  }
}
