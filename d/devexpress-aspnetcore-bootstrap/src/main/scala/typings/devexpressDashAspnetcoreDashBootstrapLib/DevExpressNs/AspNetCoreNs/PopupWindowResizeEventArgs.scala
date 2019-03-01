package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowResizeEventArgs extends PopupWindowEventArgs {
  val resizeState: scala.Double
}

object PopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: scala.Double, sender: Control, window: BootstrapPopupWindow): PopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resizeState")(resizeState)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[PopupWindowResizeEventArgs]
  }
}

