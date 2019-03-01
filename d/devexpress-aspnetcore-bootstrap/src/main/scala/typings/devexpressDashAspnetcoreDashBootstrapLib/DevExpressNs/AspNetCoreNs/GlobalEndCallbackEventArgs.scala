package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalEndCallbackEventArgs extends EventArgs {
  val control: Control
}

object GlobalEndCallbackEventArgs {
  @scala.inline
  def apply(control: Control, sender: Control): GlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[GlobalEndCallbackEventArgs]
  }
}

