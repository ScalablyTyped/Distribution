package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(afterResizing = afterResizing, beforeResizing = beforeResizing, beginCallback = beginCallback, callbackError = callbackError, closeUp = closeUp, closing = closing, endCallback = endCallback, init = init, pinnedChanged = pinnedChanged, popUp = popUp, resize = resize, shown = shown)
  
    __obj.asInstanceOf[BootstrapPopupControlEventMap]
  }
}

