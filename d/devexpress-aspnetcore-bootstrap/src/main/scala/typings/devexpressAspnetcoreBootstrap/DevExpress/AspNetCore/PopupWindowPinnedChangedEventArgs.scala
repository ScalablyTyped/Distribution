package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindowPinnedChangedEventArgs
  extends StObject
     with PopupWindowEventArgs {
  
  val pinned: Boolean
}
object PopupWindowPinnedChangedEventArgs {
  
  inline def apply(pinned: Boolean, sender: Control, window: BootstrapPopupWindow): PopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
  
  extension [Self <: PopupWindowPinnedChangedEventArgs](x: Self) {
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
  }
}
