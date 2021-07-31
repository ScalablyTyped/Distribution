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
  
  @scala.inline
  def apply(cancel: Boolean, column: BootstrapCardViewColumn, sender: Control): CardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewColumnCancelEventArgs]
  }
  
  @scala.inline
  implicit class CardViewColumnCancelEventArgsMutableBuilder[Self <: CardViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: BootstrapCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
