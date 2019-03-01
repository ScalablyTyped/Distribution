package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditStartEditing event.
  */
trait ASPxClientGridViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the grid column that owns a cell that is about to be edited.
    * Value: An <see cref="ASPxClientGridViewColumn" /> object that is the focused grid column.
    */
  var focusedColumn: ASPxClientGridViewColumn
  /**
    * Gets a hashtable that maintains information about editable cells.
    * Value: A hashtable that stores information about editable cells.
    */
  var rowValues: js.Object
  /**
    * Gets the visible index of the row whose cells are about to be edited.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the row.
    */
  var visibleIndex: scala.Double
}

object ASPxClientGridViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    focusedColumn: ASPxClientGridViewColumn,
    rowValues: js.Object,
    visibleIndex: scala.Double
  ): ASPxClientGridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("focusedColumn")(focusedColumn)
    __obj.updateDynamic("rowValues")(rowValues)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientGridViewBatchEditStartEditingEventArgs]
  }
}

