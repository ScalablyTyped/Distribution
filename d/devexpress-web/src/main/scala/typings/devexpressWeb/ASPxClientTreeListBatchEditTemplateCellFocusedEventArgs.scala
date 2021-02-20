package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
@js.native
trait ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientTreeListColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}
object ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, handled: Boolean): ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListBatchEditTemplateCellFocusedEventArgsMutableBuilder[Self <: ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
