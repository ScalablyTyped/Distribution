package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Busy
import typings.gapiCalendar.anon.Calendars
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusy_ extends StObject {
  
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
  implicit class FreeBusy_MutableBuilder[Self <: FreeBusy_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: String => Busy): Self = StObject.set(x, "calendars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroups(value: String => Calendars): Self = StObject.set(x, "groups", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKind(value: calendarNumbersignfreeBusy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMax(value: datetime): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMin(value: datetime): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
  }
}
