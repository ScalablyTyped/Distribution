package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
  var notifications: js.Array[MethodType]
}
object Notifications {
  
  inline def apply(notifications: js.Array[MethodType]): Notifications = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
  
  extension [Self <: Notifications](x: Self) {
    
    inline def setNotifications(value: js.Array[MethodType]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsVarargs(value: MethodType*): Self = StObject.set(x, "notifications", js.Array(value*))
  }
}
