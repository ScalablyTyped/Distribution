package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordDoubleClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the element of clicked cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the clicked cell.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the data of clicked cell.
    */
  var cellValue: js.UndefOr[js.Any] = js.undefined
  /** Returns the column name of the clicked cell.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the element of the clicked row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the clicked row.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object RecordDoubleClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: js.Any = null,
    cellIndex: js.UndefOr[Double] = js.undefined,
    cellValue: js.Any = null,
    columnName: String = null,
    row: js.Any = null,
    rowIndex: js.UndefOr[Double] = js.undefined
  ): RecordDoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex.get.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDoubleClickEventArgs]
  }
}

