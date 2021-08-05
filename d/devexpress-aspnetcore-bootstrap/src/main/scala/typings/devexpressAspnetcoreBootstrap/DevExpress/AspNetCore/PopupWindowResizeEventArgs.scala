package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindowResizeEventArgs
  extends StObject
     with PopupWindowEventArgs {
  
  val resizeState: Double
}
object PopupWindowResizeEventArgs {
  
  inline def apply(resizeState: Double, sender: Control, window: BootstrapPopupWindow): PopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowResizeEventArgs]
  }
  
  extension [Self <: PopupWindowResizeEventArgs](x: Self) {
    
    inline def setResizeState(value: Double): Self = StObject.set(x, "resizeState", value.asInstanceOf[js.Any])
  }
}
