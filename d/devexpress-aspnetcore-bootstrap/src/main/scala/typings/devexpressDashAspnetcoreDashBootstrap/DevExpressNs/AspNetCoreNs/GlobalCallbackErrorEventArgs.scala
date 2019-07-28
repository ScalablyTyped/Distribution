package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalCallbackErrorEventArgs extends CallbackErrorEventArgs {
  val control: Control
}

object GlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: Control, handled: Boolean, message: String, sender: Control): GlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control, handled = handled, message = message, sender = sender)
  
    __obj.asInstanceOf[GlobalCallbackErrorEventArgs]
  }
}

