package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditStartEditing event.
  */
trait ASPxClientVerticalGridBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the grid row that owns a cell that is about to be edited.
    * Value: An <see cref="ASPxClientVerticalGridRow" /> object that is the focused grid row.
    */
  var focusedRow: ASPxClientVerticalGridRow
  /**
    * Gets a hashtable that maintains information about editable cells.
    * Value: A hashtable that stores information about editable cells.
    */
  var recordValues: js.Object
  /**
    * Gets the visible index of the record whose cells are about to be edited.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the record.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    focusedRow: ASPxClientVerticalGridRow,
    recordValues: js.Object,
    visibleIndex: Double
  ): ASPxClientVerticalGridBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, focusedRow = focusedRow, recordValues = recordValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditStartEditingEventArgs]
  }
}

