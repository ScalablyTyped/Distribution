package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarsDeleteParameters extends StObject {
  
  var calendarId: String
}
object CalendarsDeleteParameters {
  
  inline def apply(calendarId: String): CalendarsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsDeleteParameters]
  }
  
  extension [Self <: CalendarsDeleteParameters](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
  }
}
