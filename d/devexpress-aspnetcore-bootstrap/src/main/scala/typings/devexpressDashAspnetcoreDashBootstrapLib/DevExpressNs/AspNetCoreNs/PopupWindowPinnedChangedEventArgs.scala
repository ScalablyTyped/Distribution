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
    val __obj = js.Dynamic.literal(pinned = pinned, sender = sender, window = window)
  
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
}

