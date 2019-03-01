package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterResizing")(afterResizing)
    __obj.updateDynamic("beforeResizing")(beforeResizing)
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("closeUp")(closeUp)
    __obj.updateDynamic("closing")(closing)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("pinnedChanged")(pinnedChanged)
    __obj.updateDynamic("popUp")(popUp)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("shown")(shown)
    __obj.asInstanceOf[BootstrapPopupControlEventMap]
  }
}

