package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowCloseUpEventArgs extends PopupWindowEventArgs {
  val closeReason: BootstrapPopupControlCloseReason
}

object PopupWindowCloseUpEventArgs {
  @scala.inline
  def apply(closeReason: BootstrapPopupControlCloseReason, sender: Control, window: BootstrapPopupWindow): PopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCloseUpEventArgs]
  }
}

