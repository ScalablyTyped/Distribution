package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditTemplateCellFocused event.
  */
@js.native
trait ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientGridViewColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}
object ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs {
  
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, handled: Boolean): ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewBatchEditTemplateCellFocusedEventArgsMutableBuilder[Self <: ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
