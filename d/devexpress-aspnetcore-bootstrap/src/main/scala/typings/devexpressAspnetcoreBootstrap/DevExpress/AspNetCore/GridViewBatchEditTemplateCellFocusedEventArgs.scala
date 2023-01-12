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
  
  inline def apply(column: BootstrapGridViewColumn, handled: Boolean, sender: Control): GridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
