package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewColumnCancelEventArgs
  extends StObject
     with CancelEventArgs {
  
  val column: BootstrapCardViewColumn
}
object CardViewColumnCancelEventArgs {
  
  inline def apply(cancel: Boolean, column: BootstrapCardViewColumn, sender: Control): CardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewColumnCancelEventArgs]
  }
  
  extension [Self <: CardViewColumnCancelEventArgs](x: Self) {
    
    inline def setColumn(value: BootstrapCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
