package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindowPinnedChangedEventArgs extends PopupWindowEventArgs {
  
  val pinned: Boolean = js.native
}
object PopupWindowPinnedChangedEventArgs {
  
  @scala.inline
  def apply(pinned: Boolean, sender: Control, window: BootstrapPopupWindow): PopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
  
  @scala.inline
  implicit class PopupWindowPinnedChangedEventArgsMutableBuilder[Self <: PopupWindowPinnedChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
  }
}
