package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewColumnCancelEventArgs extends CancelEventArgs {
  
  val column: BootstrapGridViewColumn = js.native
}
object GridViewColumnCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, column: BootstrapGridViewColumn, sender: Control): GridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnCancelEventArgs]
  }
  
  @scala.inline
  implicit class GridViewColumnCancelEventArgsMutableBuilder[Self <: GridViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
