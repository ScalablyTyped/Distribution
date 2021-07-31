package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
trait ASPxClientPopupWindowCancelEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    */
  var closeReason: ASPxClientPopupControlCloseReason
  
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow
}
object ASPxClientPopupWindowCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], closeReason = closeReason.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientPopupWindowCancelEventArgsMutableBuilder[Self <: ASPxClientPopupWindowCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseReason(value: ASPxClientPopupControlCloseReason): Self = StObject.set(x, "closeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: ASPxClientPopupWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
