package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
trait ASPxClientGridViewRowFocusingEventArgs
  extends StObject
     with ASPxClientGridViewRowCancelEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  var htmlEvent: js.Any
}
object ASPxClientGridViewRowFocusingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientGridViewRowFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowFocusingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewRowFocusingEventArgsMutableBuilder[Self <: ASPxClientGridViewRowFocusingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
