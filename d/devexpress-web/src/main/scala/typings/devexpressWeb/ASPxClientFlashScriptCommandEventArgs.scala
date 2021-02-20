package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientObjectContainer.FlashScriptCommand client event.
  */
@js.native
trait ASPxClientFlashScriptCommandEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets arguments passed via the FSCommand action of the flash object.
    */
  var args: String = js.native
  
  /**
    * Gets a command passed via the FSCommand action of the flash object.
    */
  var command: String = js.native
}
object ASPxClientFlashScriptCommandEventArgs {
  
  @scala.inline
  def apply(args: String, command: String): ASPxClientFlashScriptCommandEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFlashScriptCommandEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFlashScriptCommandEventArgsMutableBuilder[Self <: ASPxClientFlashScriptCommandEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
