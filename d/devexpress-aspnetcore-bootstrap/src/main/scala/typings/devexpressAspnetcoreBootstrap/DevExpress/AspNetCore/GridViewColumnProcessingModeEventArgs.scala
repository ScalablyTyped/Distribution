package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewColumnProcessingModeEventArgs extends ProcessingModeEventArgs {
  
  val column: BootstrapGridViewColumn = js.native
}
object GridViewColumnProcessingModeEventArgs {
  
  @scala.inline
  def apply(column: BootstrapGridViewColumn, processOnServer: Boolean, sender: Control): GridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class GridViewColumnProcessingModeEventArgsMutableBuilder[Self <: GridViewColumnProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
