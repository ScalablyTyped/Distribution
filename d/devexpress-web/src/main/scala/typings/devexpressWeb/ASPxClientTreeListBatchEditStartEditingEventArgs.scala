package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditStartEditing event.
  */
trait ASPxClientTreeListBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the tree list column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientTreeListColumn
  /**
    * Gets the node's key value.
    */
  var nodeKey: String
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: js.Any
}

object ASPxClientTreeListBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, focusedColumn: ASPxClientTreeListColumn, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditStartEditingEventArgs]
  }
}

