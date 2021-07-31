package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewRowClickEventArgs
  extends StObject
     with GridViewRowCancelEventArgs {
  
  val htmlEvent: js.Any
}
object GridViewRowClickEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: Double): GridViewRowClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewRowClickEventArgs]
  }
  
  @scala.inline
  implicit class GridViewRowClickEventArgsMutableBuilder[Self <: GridViewRowClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
