package typings.devexpressWeb

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
  implicit class ASPxClientFlashScriptCommandEventArgsOps[Self <: ASPxClientFlashScriptCommandEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgs(value: String): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
  }
}
