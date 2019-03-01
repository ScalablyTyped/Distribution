package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalCallbackErrorEventArgs extends CallbackErrorEventArgs {
  val control: Control
}

object GlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: Control, handled: scala.Boolean, message: java.lang.String, sender: Control): GlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[GlobalCallbackErrorEventArgs]
  }
}

