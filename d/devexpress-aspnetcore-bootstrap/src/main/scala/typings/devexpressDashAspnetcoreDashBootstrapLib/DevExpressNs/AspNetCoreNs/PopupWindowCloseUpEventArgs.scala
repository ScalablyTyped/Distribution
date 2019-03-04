package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowCloseUpEventArgs extends PopupWindowEventArgs {
  val closeReason: BootstrapPopupControlCloseReason
}

object PopupWindowCloseUpEventArgs {
  @scala.inline
  def apply(closeReason: BootstrapPopupControlCloseReason, sender: Control, window: BootstrapPopupWindow): PopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason, sender = sender, window = window)
  
    __obj.asInstanceOf[PopupWindowCloseUpEventArgs]
  }
}

