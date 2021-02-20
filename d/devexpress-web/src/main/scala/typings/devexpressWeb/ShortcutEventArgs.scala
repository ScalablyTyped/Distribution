package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client-side ASPxClientScheduler.Shortcut event.
  */
@js.native
trait ShortcutEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of a command associated with the keyboard shortcut.
    */
  var commandName: String = js.native
  
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets an object containing information about a keyboard shortcut event.
    */
  var htmlEvent: js.Any = js.native
}
object ShortcutEventArgs {
  
  @scala.inline
  def apply(commandName: String, handled: Boolean, htmlEvent: js.Any): ShortcutEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutEventArgs]
  }
  
  @scala.inline
  implicit class ShortcutEventArgsMutableBuilder[Self <: ShortcutEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
