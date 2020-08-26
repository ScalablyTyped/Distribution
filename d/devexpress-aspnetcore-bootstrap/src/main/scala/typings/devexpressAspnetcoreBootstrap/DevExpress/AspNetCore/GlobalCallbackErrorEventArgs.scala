package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalCallbackErrorEventArgs extends CallbackErrorEventArgs {
  val control: Control = js.native
}

object GlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: Control, handled: Boolean, message: String, sender: Control): GlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalCallbackErrorEventArgs]
  }
  @scala.inline
  implicit class GlobalCallbackErrorEventArgsOps[Self <: GlobalCallbackErrorEventArgs] (val x: Self) extends AnyVal {
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
    def setControl(value: Control): Self = this.set("control", value.asInstanceOf[js.Any])
  }
  
}

