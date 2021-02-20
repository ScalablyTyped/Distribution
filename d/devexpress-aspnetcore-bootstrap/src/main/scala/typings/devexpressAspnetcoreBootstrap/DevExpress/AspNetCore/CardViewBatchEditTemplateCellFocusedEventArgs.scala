package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardViewBatchEditTemplateCellFocusedEventArgs extends EventArgs {
  
  val column: BootstrapCardViewColumn = js.native
  
  var handled: Boolean = js.native
}
object CardViewBatchEditTemplateCellFocusedEventArgs {
  
  @scala.inline
  def apply(column: BootstrapCardViewColumn, handled: Boolean, sender: Control): CardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  @scala.inline
  implicit class CardViewBatchEditTemplateCellFocusedEventArgsMutableBuilder[Self <: CardViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: BootstrapCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
