package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditTemplateCellFocused event.
  */
@js.native
trait ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientCardViewColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}
object ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs {
  
  @scala.inline
  def apply(column: ASPxClientCardViewColumn, handled: Boolean): ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewBatchEditTemplateCellFocusedEventArgsMutableBuilder[Self <: ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
