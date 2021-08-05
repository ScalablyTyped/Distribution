package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewColumnProcessingModeEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val column: BootstrapGridViewColumn
}
object GridViewColumnProcessingModeEventArgs {
  
  inline def apply(column: BootstrapGridViewColumn, processOnServer: Boolean, sender: Control): GridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnProcessingModeEventArgs]
  }
  
  extension [Self <: GridViewColumnProcessingModeEventArgs](x: Self) {
    
    inline def setColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
