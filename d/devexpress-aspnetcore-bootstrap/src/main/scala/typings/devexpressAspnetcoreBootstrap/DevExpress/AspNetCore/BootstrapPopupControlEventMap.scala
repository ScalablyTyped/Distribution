package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapPopupControlEventMap extends ControlEventMap {
  
  var afterResizing: PopupWindowEventArgs = js.native
  
  var beforeResizing: PopupWindowEventArgs = js.native
  
  var beginCallback: BeginCallbackEventArgs = js.native
  
  var callbackError: CallbackErrorEventArgs = js.native
  
  var closeUp: PopupWindowCloseUpEventArgs = js.native
  
  var closing: PopupWindowCancelEventArgs = js.native
  
  var endCallback: EndCallbackEventArgs = js.native
  
  var pinnedChanged: PopupWindowPinnedChangedEventArgs = js.native
  
  var popUp: PopupWindowEventArgs = js.native
  
  var resize: PopupWindowResizeEventArgs = js.native
  
  var shown: PopupWindowEventArgs = js.native
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
  
  @scala.inline
  implicit class BootstrapPopupControlEventMapMutableBuilder[Self <: BootstrapPopupControlEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterResizing(value: PopupWindowEventArgs): Self = StObject.set(x, "afterResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeResizing(value: PopupWindowEventArgs): Self = StObject.set(x, "beforeResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUp(value: PopupWindowCloseUpEventArgs): Self = StObject.set(x, "closeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosing(value: PopupWindowCancelEventArgs): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedChanged(value: PopupWindowPinnedChangedEventArgs): Self = StObject.set(x, "pinnedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopUp(value: PopupWindowEventArgs): Self = StObject.set(x, "popUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: PopupWindowResizeEventArgs): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShown(value: PopupWindowEventArgs): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
  }
}
