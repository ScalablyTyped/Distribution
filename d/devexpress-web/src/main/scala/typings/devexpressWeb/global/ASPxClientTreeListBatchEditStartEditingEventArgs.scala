package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditStartEditingEventArgs")
@js.native
class ASPxClientTreeListBatchEditStartEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditStartEditingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param focusedColumn An ASPxClientTreeListColumn object representing the focused column.
    * @param nodeValues An object representing a data source’s field values.
    */
  def this(nodeKey: String, focusedColumn: typings.devexpressWeb.ASPxClientTreeListColumn, nodeValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the tree list column that owns a cell that is about to be edited.
    */
  /* CompleteClass */
  override var focusedColumn: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
  /**
    * Gets the node's key value.
    */
  /* CompleteClass */
  override var nodeKey: String = js.native
  /**
    * Gets the value of the processed cell.
    */
  /* CompleteClass */
  override var nodeValues: js.Any = js.native
}

