package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindowResizeEventArgs extends PopupWindowEventArgs {
  
  val resizeState: Double = js.native
}
object PopupWindowResizeEventArgs {
  
  @scala.inline
  def apply(resizeState: Double, sender: Control, window: BootstrapPopupWindow): PopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowResizeEventArgs]
  }
  
  @scala.inline
  implicit class PopupWindowResizeEventArgsMutableBuilder[Self <: PopupWindowResizeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResizeState(value: Double): Self = StObject.set(x, "resizeState", value.asInstanceOf[js.Any])
  }
}
