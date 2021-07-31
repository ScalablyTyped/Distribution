package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditTemplateCellFocusedEventArgs
  extends StObject
     with EventArgs {
  
  val column: BootstrapGridViewColumn
  
  var handled: Boolean
}
object GridViewBatchEditTemplateCellFocusedEventArgs {
  
  @scala.inline
  def apply(column: BootstrapGridViewColumn, handled: Boolean, sender: Control): GridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  @scala.inline
  implicit class GridViewBatchEditTemplateCellFocusedEventArgsMutableBuilder[Self <: GridViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
