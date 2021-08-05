package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindowEventArgs
  extends StObject
     with EventArgs {
  
  val window: BootstrapPopupWindow
}
object PopupWindowEventArgs {
  
  inline def apply(sender: Control, window: BootstrapPopupWindow): PopupWindowEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowEventArgs]
  }
  
  extension [Self <: PopupWindowEventArgs](x: Self) {
    
    inline def setWindow(value: BootstrapPopupWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
