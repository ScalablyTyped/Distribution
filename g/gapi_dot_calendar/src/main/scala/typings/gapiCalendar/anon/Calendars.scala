package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendars extends StObject {
  
  var calendars: js.Array[String]
  
  var errors: js.UndefOr[js.Array[Domain]] = js.undefined
}
object Calendars {
  
  inline def apply(calendars: js.Array[String]): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
  
  extension [Self <: Calendars](x: Self) {
    
    inline def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value*))
    
    inline def setErrors(value: js.Array[Domain]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Domain*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
