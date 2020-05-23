package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditStartEditing event.
  */
trait ASPxClientVerticalGridBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the grid row that owns a cell that is about to be edited.
    */
  var focusedRow: ASPxClientVerticalGridRow
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Any
  /**
    * Gets the visible index of the record whose cells are about to be edited.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, focusedRow: ASPxClientVerticalGridRow, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedRow = focusedRow.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditStartEditingEventArgs]
  }
}

