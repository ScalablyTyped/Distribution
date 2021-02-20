package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarsDeleteParameters extends StObject {
  
  var calendarId: String = js.native
}
object CalendarsDeleteParameters {
  
  @scala.inline
  def apply(calendarId: String): CalendarsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsDeleteParameters]
  }
  
  @scala.inline
  implicit class CalendarsDeleteParametersMutableBuilder[Self <: CalendarsDeleteParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
  }
}
