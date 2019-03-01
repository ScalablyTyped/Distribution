package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowEventArgs extends EventArgs {
  val window: BootstrapPopupWindow
}

object PopupWindowEventArgs {
  @scala.inline
  def apply(sender: Control, window: BootstrapPopupWindow): PopupWindowEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[PopupWindowEventArgs]
  }
}

