package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutEventArgs
  extends StObject
     with EventArgs {
  
  val commandName: String
  
  val handled: Boolean
  
  val htmlEvent: js.Object
}
object ShortcutEventArgs {
  
  @scala.inline
  def apply(commandName: String, handled: Boolean, htmlEvent: js.Object, sender: Control): ShortcutEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutEventArgs]
  }
  
  @scala.inline
  implicit class ShortcutEventArgsMutableBuilder[Self <: ShortcutEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Object): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
