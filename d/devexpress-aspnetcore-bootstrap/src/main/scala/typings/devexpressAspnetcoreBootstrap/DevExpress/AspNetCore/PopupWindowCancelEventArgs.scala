package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindowCancelEventArgs
  extends StObject
     with CancelEventArgs {
  
  val closeReason: BootstrapPopupControlCloseReason
  
  val window: BootstrapPopupWindow
}
object PopupWindowCancelEventArgs {
  
  inline def apply(
    cancel: Boolean,
    closeReason: BootstrapPopupControlCloseReason,
    sender: Control,
    window: BootstrapPopupWindow
  ): PopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCancelEventArgs]
  }
  
  extension [Self <: PopupWindowCancelEventArgs](x: Self) {
    
    inline def setCloseReason(value: BootstrapPopupControlCloseReason): Self = StObject.set(x, "closeReason", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: BootstrapPopupWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
