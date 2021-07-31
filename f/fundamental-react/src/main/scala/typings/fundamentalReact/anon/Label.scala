package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var callback: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var noNotificationsBody: js.UndefOr[ReactNode] = js.undefined
  
  var notificationCount: Double
  
  var notificationsBody: js.UndefOr[ReactNode] = js.undefined
}
object Label {
  
  @scala.inline
  def apply(notificationCount: Double): Label = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNoNotificationsBody(value: ReactNode): Self = StObject.set(x, "noNotificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNotificationsBodyUndefined: Self = StObject.set(x, "noNotificationsBody", js.undefined)
    
    @scala.inline
    def setNotificationCount(value: Double): Self = StObject.set(x, "notificationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBody(value: ReactNode): Self = StObject.set(x, "notificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBodyUndefined: Self = StObject.set(x, "notificationsBody", js.undefined)
  }
}
