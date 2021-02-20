package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method extends StObject {
  
  var method: ReminderMethod = js.native
  
  var minutes: integer = js.native
}
object Method {
  
  @scala.inline
  def apply(method: ReminderMethod, minutes: integer): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: ReminderMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: integer): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
