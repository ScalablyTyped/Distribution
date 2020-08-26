package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@js.native
trait ASPxClientGlobalBeginCallbackEventArgs extends ASPxClientBeginCallbackEventArgs {
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}

object ASPxClientGlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: ASPxClientControl): ASPxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalBeginCallbackEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGlobalBeginCallbackEventArgsOps[Self <: ASPxClientGlobalBeginCallbackEventArgs] (val x: Self) extends AnyVal {
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

