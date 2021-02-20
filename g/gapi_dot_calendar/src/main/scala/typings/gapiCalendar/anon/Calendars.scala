package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendars extends StObject {
  
  var calendars: js.Array[String] = js.native
  
  var errors: js.UndefOr[js.Array[Domain]] = js.native
}
object Calendars {
  
  @scala.inline
  def apply(calendars: js.Array[String]): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
  
  @scala.inline
  implicit class CalendarsMutableBuilder[Self <: Calendars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Domain]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Domain*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
