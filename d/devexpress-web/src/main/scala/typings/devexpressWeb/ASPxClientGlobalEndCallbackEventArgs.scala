package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.EndCallback event.
  */
@js.native
trait ASPxClientGlobalEndCallbackEventArgs extends ASPxClientEndCallbackEventArgs {
  
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}
object ASPxClientGlobalEndCallbackEventArgs {
  
  @scala.inline
  def apply(command: String, control: ASPxClientControl): ASPxClientGlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalEndCallbackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGlobalEndCallbackEventArgsOps[Self <: ASPxClientGlobalEndCallbackEventArgs] (val x: Self) extends AnyVal {
    
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
    def setControl(value: ASPxClientControl): Self = this.set("control", value.asInstanceOf[js.Any])
  }
}
