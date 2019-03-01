package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowPinnedChangedEventArgs extends PopupWindowEventArgs {
  val pinned: scala.Boolean
}

object PopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: scala.Boolean, sender: Control, window: BootstrapPopupWindow): PopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pinned")(pinned)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
}

