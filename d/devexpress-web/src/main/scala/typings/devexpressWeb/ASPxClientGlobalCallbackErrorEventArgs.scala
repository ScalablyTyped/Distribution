package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.CallbackError event.
  */
@js.native
trait ASPxClientGlobalCallbackErrorEventArgs extends ASPxClientCallbackErrorEventArgs {
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}

object ASPxClientGlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: ASPxClientControl, handled: Boolean, message: String): ASPxClientGlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalCallbackErrorEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGlobalCallbackErrorEventArgsOps[Self <: ASPxClientGlobalCallbackErrorEventArgs] (val x: Self) extends AnyVal {
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

