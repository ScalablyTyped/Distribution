package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
trait ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientTreeListColumn
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}
object ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  
  inline def apply(column: ASPxClientTreeListColumn, handled: Boolean): ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs](x: Self) {
    
    inline def setColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
