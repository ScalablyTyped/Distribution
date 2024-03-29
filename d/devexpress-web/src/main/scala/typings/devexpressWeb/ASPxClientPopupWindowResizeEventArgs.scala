package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.Resize event.
  */
trait ASPxClientPopupWindowResizeEventArgs
  extends StObject
     with ASPxClientPopupWindowEventArgs {
  
  /**
    * Returns the value indicating the window state after resizing.
    */
  var resizeState: Double
}
object ASPxClientPopupWindowResizeEventArgs {
  
  inline def apply(resizeState: Double, window: ASPxClientPopupWindow): ASPxClientPopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowResizeEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientPopupWindowResizeEventArgs] (val x: Self) extends AnyVal {
    
    inline def setResizeState(value: Double): Self = StObject.set(x, "resizeState", value.asInstanceOf[js.Any])
  }
}
