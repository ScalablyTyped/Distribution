package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarsInsertParameters extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  // Calendars resource
  // Required Properties
  var summary: String
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object CalendarsInsertParameters {
  
  @scala.inline
  def apply(summary: String): CalendarsInsertParameters = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsInsertParameters]
  }
  
  @scala.inline
  implicit class CalendarsInsertParametersMutableBuilder[Self <: CalendarsInsertParameters] (val x: Self) extends AnyVal {
    
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
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
