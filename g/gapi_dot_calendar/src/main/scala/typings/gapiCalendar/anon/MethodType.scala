package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.NotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodType extends StObject {
  
  var method: String
  
  var `type`: NotificationType
}
object MethodType {
  
  inline def apply(method: String, `type`: NotificationType): MethodType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodType]
  }
  
  extension [Self <: MethodType](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
