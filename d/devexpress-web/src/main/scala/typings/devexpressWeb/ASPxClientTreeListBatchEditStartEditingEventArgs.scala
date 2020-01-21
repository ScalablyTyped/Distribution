package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditStartEditingEventArgs")
@js.native
class ASPxClientTreeListBatchEditStartEditingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditStartEditingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param focusedColumn An ASPxClientTreeListColumn object representing the focused column.
    * @param nodeValues An object representing a data source’s field values.
    */
  def this(nodeKey: String, focusedColumn: ASPxClientTreeListColumn, nodeValues: js.Any) = this()
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

