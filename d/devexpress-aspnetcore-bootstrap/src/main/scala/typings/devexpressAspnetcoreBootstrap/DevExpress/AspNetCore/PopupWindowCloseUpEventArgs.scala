package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindowCloseUpEventArgs
  extends StObject
     with PopupWindowEventArgs {
  
  val closeReason: BootstrapPopupControlCloseReason
}
object PopupWindowCloseUpEventArgs {
  
  inline def apply(closeReason: BootstrapPopupControlCloseReason, sender: Control, window: BootstrapPopupWindow): PopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCloseUpEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupWindowCloseUpEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCloseReason(value: BootstrapPopupControlCloseReason): Self = StObject.set(x, "closeReason", value.asInstanceOf[js.Any])
  }
}
