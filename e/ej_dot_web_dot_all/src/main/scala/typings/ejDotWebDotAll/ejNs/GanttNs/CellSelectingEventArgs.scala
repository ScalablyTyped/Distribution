package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectingEventArgs extends js.Object {
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

object CellSelectingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: Int | Double = null,
    data: js.Any = null,
    model: js.Any = null,
    rowIndex: Int | Double = null,
    targetCell: js.Any = null,
    targetRow: js.Any = null
  ): CellSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (targetCell != null) __obj.updateDynamic("targetCell")(targetCell)
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    __obj.asInstanceOf[CellSelectingEventArgs]
  }
}

