package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapPopupControlEventMap
  extends StObject
     with ControlEventMap {
  
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
  
  inline def apply(
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
  
  extension [Self <: BootstrapPopupControlEventMap](x: Self) {
    
    inline def setAfterResizing(value: PopupWindowEventArgs): Self = StObject.set(x, "afterResizing", value.asInstanceOf[js.Any])
    
    inline def setBeforeResizing(value: PopupWindowEventArgs): Self = StObject.set(x, "beforeResizing", value.asInstanceOf[js.Any])
    
    inline def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    inline def setCloseUp(value: PopupWindowCloseUpEventArgs): Self = StObject.set(x, "closeUp", value.asInstanceOf[js.Any])
    
    inline def setClosing(value: PopupWindowCancelEventArgs): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    inline def setPinnedChanged(value: PopupWindowPinnedChangedEventArgs): Self = StObject.set(x, "pinnedChanged", value.asInstanceOf[js.Any])
    
    inline def setPopUp(value: PopupWindowEventArgs): Self = StObject.set(x, "popUp", value.asInstanceOf[js.Any])
    
    inline def setResize(value: PopupWindowResizeEventArgs): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setShown(value: PopupWindowEventArgs): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
  }
}
