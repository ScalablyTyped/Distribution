package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditStartEditing event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the grid row that owns a cell that is about to be edited.
    */
  var focusedRow: ASPxClientVerticalGridRow = js.native
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the visible index of the record whose cells are about to be edited.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientVerticalGridBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, focusedRow: ASPxClientVerticalGridRow, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedRow = focusedRow.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditStartEditingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditStartEditingEventArgsOps[Self <: ASPxClientVerticalGridBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFocusedRow(value: ASPxClientVerticalGridRow): Self = this.set("focusedRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordValues(value: js.Any): Self = this.set("recordValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

