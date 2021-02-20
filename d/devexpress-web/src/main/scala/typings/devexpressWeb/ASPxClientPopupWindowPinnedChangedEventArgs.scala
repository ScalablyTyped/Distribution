package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.PinnedChanged event.
  */
@js.native
trait ASPxClientPopupWindowPinnedChangedEventArgs extends ASPxClientPopupWindowEventArgs {
  
  /**
    * Gets a value indicating whether the processed popup window has been pinned.
    */
  var pinned: Boolean = js.native
}
object ASPxClientPopupWindowPinnedChangedEventArgs {
  
  @scala.inline
  def apply(pinned: Boolean, window: ASPxClientPopupWindow): ASPxClientPopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowPinnedChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientPopupWindowPinnedChangedEventArgsMutableBuilder[Self <: ASPxClientPopupWindowPinnedChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
  }
}
