package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowPinnedChangedEventArgs extends PopupWindowEventArgs {
  val pinned: Boolean
}

object PopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: Boolean, sender: Control, window: BootstrapPopupWindow): PopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
}

