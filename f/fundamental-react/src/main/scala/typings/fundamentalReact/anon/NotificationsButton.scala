package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationsButton extends StObject {
  
  var counterLabel: String
  
  var notificationsButton: String
}
object NotificationsButton {
  
  inline def apply(counterLabel: String, notificationsButton: String): NotificationsButton = {
    val __obj = js.Dynamic.literal(counterLabel = counterLabel.asInstanceOf[js.Any], notificationsButton = notificationsButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationsButton] (val x: Self) extends AnyVal {
    
    inline def setCounterLabel(value: String): Self = StObject.set(x, "counterLabel", value.asInstanceOf[js.Any])
    
    inline def setNotificationsButton(value: String): Self = StObject.set(x, "notificationsButton", value.asInstanceOf[js.Any])
  }
}
