package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
trait ASPxClientPopupWindowCloseUpEventArgs
  extends StObject
     with ASPxClientPopupWindowEventArgs {
  
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  var closeReason: ASPxClientPopupControlCloseReason
}
object ASPxClientPopupWindowCloseUpEventArgs {
  
  inline def apply(closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowCloseUpEventArgs]
  }
  
  extension [Self <: ASPxClientPopupWindowCloseUpEventArgs](x: Self) {
    
    inline def setCloseReason(value: ASPxClientPopupControlCloseReason): Self = StObject.set(x, "closeReason", value.asInstanceOf[js.Any])
  }
}
