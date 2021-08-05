package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Busy
import typings.gapiCalendar.anon.Calendars
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusy_ extends StObject {
  
  def calendars(key: String): Busy
  
  def groups(key: String): Calendars
  
  var kind: calendarNumbersignfreeBusy
  
  var timeMax: datetime
  
  var timeMin: datetime
}
object FreeBusy_ {
  
  inline def apply(calendars: String => Busy, groups: String => Calendars, timeMax: datetime, timeMin: datetime): FreeBusy_ = {
    val __obj = js.Dynamic.literal(calendars = js.Any.fromFunction1(calendars), groups = js.Any.fromFunction1(groups), kind = "calendar#freeBusy", timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy_]
  }
  
  extension [Self <: FreeBusy_](x: Self) {
    
    inline def setCalendars(value: String => Busy): Self = StObject.set(x, "calendars", js.Any.fromFunction1(value))
    
    inline def setGroups(value: String => Calendars): Self = StObject.set(x, "groups", js.Any.fromFunction1(value))
    
    inline def setKind(value: calendarNumbersignfreeBusy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTimeMax(value: datetime): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMin(value: datetime): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
  }
}
