package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationHandler extends StObject {
  
  def cancel(): Unit
}
object NotificationHandler {
  
  @scala.inline
  def apply(cancel: () => Unit): NotificationHandler = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[NotificationHandler]
  }
  
  @scala.inline
  implicit class NotificationHandlerMutableBuilder[Self <: NotificationHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
