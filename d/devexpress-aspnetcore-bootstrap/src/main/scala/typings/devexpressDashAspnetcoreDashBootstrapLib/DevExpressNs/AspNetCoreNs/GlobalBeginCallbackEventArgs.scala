package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalBeginCallbackEventArgs extends BeginCallbackEventArgs {
  val control: Control
}

object GlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: java.lang.String, control: Control, sender: Control): GlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[GlobalBeginCallbackEventArgs]
  }
}

