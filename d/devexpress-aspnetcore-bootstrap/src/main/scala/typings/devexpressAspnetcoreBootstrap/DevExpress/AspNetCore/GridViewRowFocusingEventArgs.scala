package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewRowFocusingEventArgs
  extends StObject
     with GridViewRowCancelEventArgs {
  
  val htmlEvent: Any
}
object GridViewRowFocusingEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: Any, sender: Control, visibleIndex: Double): GridViewRowFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewRowFocusingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridViewRowFocusingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
