package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditStartEditing event.
  */
@js.native
trait ASPxClientTreeListBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the tree list column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientTreeListColumn = js.native
  
  /**
    * Gets the node's key value.
    */
  var nodeKey: String = js.native
  
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: js.Any = js.native
}
object ASPxClientTreeListBatchEditStartEditingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, focusedColumn: ASPxClientTreeListColumn, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditStartEditingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListBatchEditStartEditingEventArgsMutableBuilder[Self <: ASPxClientTreeListBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusedColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValues(value: js.Any): Self = StObject.set(x, "nodeValues", value.asInstanceOf[js.Any])
  }
}
