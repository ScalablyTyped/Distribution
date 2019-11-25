package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the selected cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selected cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell element.
    */
  var previousRowCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell index value.
    */
  var previousRowCellIndex: js.UndefOr[Double] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected row cell index values.
    */
  var selectedRowCellIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: Int | Double = null,
    currentCell: js.Any = null,
    data: js.Any = null,
    model: js.Any = null,
    previousRowCell: js.Any = null,
    previousRowCellIndex: Int | Double = null,
    selectedData: js.Any = null,
    selectedRowCellIndex: js.Array[_] = null,
    `type`: String = null
  ): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousRowCell != null) __obj.updateDynamic("previousRowCell")(previousRowCell.asInstanceOf[js.Any])
    if (previousRowCellIndex != null) __obj.updateDynamic("previousRowCellIndex")(previousRowCellIndex.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData.asInstanceOf[js.Any])
    if (selectedRowCellIndex != null) __obj.updateDynamic("selectedRowCellIndex")(selectedRowCellIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

