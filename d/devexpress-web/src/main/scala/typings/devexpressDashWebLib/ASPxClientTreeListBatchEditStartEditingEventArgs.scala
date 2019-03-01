package typings
package devexpressDashWebLib

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
  var nodeKey: java.lang.String
  /**
    * Gets the value of the processed cell.
    * Value: A String value that identifies the node values.
    */
  var nodeValues: js.Object
}

object ASPxClientTreeListBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    focusedColumn: ASPxClientTreeListColumn,
    nodeKey: java.lang.String,
    nodeValues: js.Object
  ): ASPxClientTreeListBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("focusedColumn")(focusedColumn)
    __obj.updateDynamic("nodeKey")(nodeKey)
    __obj.updateDynamic("nodeValues")(nodeValues)
    __obj.asInstanceOf[ASPxClientTreeListBatchEditStartEditingEventArgs]
  }
}

