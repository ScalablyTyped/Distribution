package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalCallbackErrorEventArgs extends CallbackErrorEventArgs {
  val control: Control
}

object GlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: Control, handled: Boolean, message: String, sender: Control): GlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalCallbackErrorEventArgs]
  }
}

