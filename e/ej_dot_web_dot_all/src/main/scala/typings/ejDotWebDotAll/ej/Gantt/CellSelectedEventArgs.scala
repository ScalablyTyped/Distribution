package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the cell index on the selection.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selecting record object
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Gantt object Model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected cell index
    */
  var previousCellIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row data
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row index
    */
  var previousRowIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected cell element
    */
  var previousTargetCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row element
    */
  var previousTargetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index on the selection
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selecting cell element
    */
  var targetCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the selecting row element
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: Int | Double = null,
    data: js.Any = null,
    model: js.Any = null,
    previousCellIndex: js.Any = null,
    previousData: js.Any = null,
    previousRowIndex: js.Any = null,
    previousTargetCell: js.Any = null,
    previousTargetRow: js.Any = null,
    rowIndex: Int | Double = null,
    targetCell: js.Any = null,
    targetRow: js.Any = null
  ): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousCellIndex != null) __obj.updateDynamic("previousCellIndex")(previousCellIndex.asInstanceOf[js.Any])
    if (previousData != null) __obj.updateDynamic("previousData")(previousData.asInstanceOf[js.Any])
    if (previousRowIndex != null) __obj.updateDynamic("previousRowIndex")(previousRowIndex.asInstanceOf[js.Any])
    if (previousTargetCell != null) __obj.updateDynamic("previousTargetCell")(previousTargetCell.asInstanceOf[js.Any])
    if (previousTargetRow != null) __obj.updateDynamic("previousTargetRow")(previousTargetRow.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (targetCell != null) __obj.updateDynamic("targetCell")(targetCell.asInstanceOf[js.Any])
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

