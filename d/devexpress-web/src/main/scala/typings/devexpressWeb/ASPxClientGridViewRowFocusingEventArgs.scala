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
  var htmlEvent: Any
}
object ASPxClientGridViewRowFocusingEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: Any, visibleIndex: Double): ASPxClientGridViewRowFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowFocusingEventArgs]
  }
  
  extension [Self <: ASPxClientGridViewRowFocusingEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
