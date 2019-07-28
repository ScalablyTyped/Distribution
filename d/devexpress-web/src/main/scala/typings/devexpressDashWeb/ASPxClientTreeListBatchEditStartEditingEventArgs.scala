package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditStartEditing event.
  */
trait ASPxClientTreeListBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the tree list column that owns a cell that is about to be edited.
    * Value: An <see cref="ASPxClientTreeListColumn" /> object that is the focused tree list column.
    */
  var focusedColumn: ASPxClientTreeListColumn
  /**
    * Gets the node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: String
  /**
    * Gets the value of the processed cell.
    * Value: A String value that identifies the node values.
    */
  var nodeValues: js.Object
}

object ASPxClientTreeListBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, focusedColumn: ASPxClientTreeListColumn, nodeKey: String, nodeValues: js.Object): ASPxClientTreeListBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, focusedColumn = focusedColumn, nodeKey = nodeKey, nodeValues = nodeValues)
  
    __obj.asInstanceOf[ASPxClientTreeListBatchEditStartEditingEventArgs]
  }
}

