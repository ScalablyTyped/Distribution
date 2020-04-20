package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowResizeEventArgs extends PopupWindowEventArgs {
  val resizeState: Double
}

object PopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: Double, sender: Control, window: BootstrapPopupWindow): PopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowResizeEventArgs]
  }
}

