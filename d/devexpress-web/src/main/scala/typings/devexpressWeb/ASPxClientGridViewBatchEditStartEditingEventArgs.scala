package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditStartEditing event.
  */
trait ASPxClientGridViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the grid column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientGridViewColumn
  /**
    * Gets the row's key.
    */
  var key: js.Any
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var rowValues: js.Any
  /**
    * Gets the visible index of the row whose cells are about to be edited.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    focusedColumn: ASPxClientGridViewColumn,
    key: js.Any,
    rowValues: js.Any,
    visibleIndex: Double
  ): ASPxClientGridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditStartEditingEventArgs]
  }
}

