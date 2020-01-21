package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditStartEditingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditStartEditingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditStartEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the record. This value is assigned to the ASPxClientVerticalGridBatchEditRecordValidatingEventArgs.visibleIndex property.
    * @param focusedRow An ASPxClientVerticalGridRow object that is the focused grid row. This value is assigned to the ASPxClientVerticalGridBatchEditStartEditingEventArgs.focusedRow property.
    * @param recordValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientVerticalGridBatchEditStartEditingEventArgs.recordValues property.
    */
  def this(visibleIndex: Double, focusedRow: ASPxClientVerticalGridRow, recordValues: js.Any) = this()
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

