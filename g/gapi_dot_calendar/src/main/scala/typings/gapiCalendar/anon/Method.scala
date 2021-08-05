package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var method: ReminderMethod
  
  var minutes: integer
}
object Method {
  
  inline def apply(method: ReminderMethod, minutes: integer): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setMethod(value: ReminderMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: integer): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
