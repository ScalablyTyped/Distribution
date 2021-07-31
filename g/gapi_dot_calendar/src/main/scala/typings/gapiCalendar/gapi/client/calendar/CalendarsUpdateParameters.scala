package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarsUpdateParameters extends StObject {
  
  var calendarId: String
  
  // Calendars resource
  // Optional Properties
  var description: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object CalendarsUpdateParameters {
  
  @scala.inline
  def apply(calendarId: String): CalendarsUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsUpdateParameters]
  }
  
  @scala.inline
  implicit class CalendarsUpdateParametersMutableBuilder[Self <: CalendarsUpdateParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
