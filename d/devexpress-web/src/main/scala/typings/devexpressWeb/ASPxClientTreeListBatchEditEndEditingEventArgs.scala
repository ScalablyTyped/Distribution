package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditEndEditing event.
  */
trait ASPxClientTreeListBatchEditEndEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the column to which the edited cell belongs.
    */
  var focusedColumn: ASPxClientTreeListColumn
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: Any
}
object ASPxClientTreeListBatchEditEndEditingEventArgs {
  
  inline def apply(cancel: Boolean, focusedColumn: ASPxClientTreeListColumn, nodeKey: String, nodeValues: Any): ASPxClientTreeListBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditEndEditingEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListBatchEditEndEditingEventArgs](x: Self) {
    
    inline def setFocusedColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    inline def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    inline def setNodeValues(value: Any): Self = StObject.set(x, "nodeValues", value.asInstanceOf[js.Any])
  }
}
