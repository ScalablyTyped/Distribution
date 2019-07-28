package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowPinnedChangedEventArgs extends PopupWindowEventArgs {
  val pinned: Boolean
}

object PopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: Boolean, sender: Control, window: BootstrapPopupWindow): PopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned, sender = sender, window = window)
  
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
}

