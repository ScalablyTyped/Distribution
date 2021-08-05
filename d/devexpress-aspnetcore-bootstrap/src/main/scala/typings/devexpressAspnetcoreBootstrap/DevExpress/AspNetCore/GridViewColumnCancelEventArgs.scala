package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewColumnCancelEventArgs
  extends StObject
     with CancelEventArgs {
  
  val column: BootstrapGridViewColumn
}
object GridViewColumnCancelEventArgs {
  
  inline def apply(cancel: Boolean, column: BootstrapGridViewColumn, sender: Control): GridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnCancelEventArgs]
  }
  
  extension [Self <: GridViewColumnCancelEventArgs](x: Self) {
    
    inline def setColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
