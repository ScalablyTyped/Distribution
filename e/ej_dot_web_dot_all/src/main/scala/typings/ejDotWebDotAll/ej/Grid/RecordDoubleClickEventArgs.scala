package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordDoubleClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current selected cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the corresponding cell value.
    */
  var cellValue: js.UndefOr[String] = js.undefined
  /** Returns the Header text of the column corresponding to the selected cell.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the jQuery object of the current selected row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index of the selected row.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RecordDoubleClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: js.Any = null,
    cellIndex: Int | Double = null,
    cellValue: String = null,
    columnName: String = null,
    data: js.Any = null,
    model: js.Any = null,
    row: js.Any = null,
    rowData: js.Any = null,
    rowIndex: Int | Double = null,
    `type`: String = null
  ): RecordDoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecordDoubleClickEventArgs]
  }
}

