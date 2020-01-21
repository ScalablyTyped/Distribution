package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapPopupControlEventMap extends ControlEventMap {
  var afterResizing: PopupWindowEventArgs
  var beforeResizing: PopupWindowEventArgs
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var closeUp: PopupWindowCloseUpEventArgs
  var closing: PopupWindowCancelEventArgs
  var endCallback: EndCallbackEventArgs
  var pinnedChanged: PopupWindowPinnedChangedEventArgs
  var popUp: PopupWindowEventArgs
  var resize: PopupWindowResizeEventArgs
  var shown: PopupWindowEventArgs
}

object BootstrapPopupControlEventMap {
  @scala.inline
  def apply(
    afterResizing: PopupWindowEventArgs,
    beforeResizing: PopupWindowEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    closeUp: PopupWindowCloseUpEventArgs,
    closing: PopupWindowCancelEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    pinnedChanged: PopupWindowPinnedChangedEventArgs,
    popUp: PopupWindowEventArgs,
    resize: PopupWindowResizeEventArgs,
    shown: PopupWindowEventArgs
  ): BootstrapPopupControlEventMap = {
    val __obj = js.Dynamic.literal(afterResizing = afterResizing.asInstanceOf[js.Any], beforeResizing = beforeResizing.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], pinnedChanged = pinnedChanged.asInstanceOf[js.Any], popUp = popUp.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapPopupControlEventMap]
  }
}

