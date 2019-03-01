package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the cell index of the selected cell.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the cell value.
    */
  var cellValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns current record object (JSON).
    */
  var currentData: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected row data object.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the current selected row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected row data object.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index of the selected row.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RightClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: js.Any = null,
    cellIndex: scala.Int | scala.Double = null,
    cellValue: java.lang.String = null,
    currentData: js.Any = null,
    data: js.Any = null,
    model: js.Any = null,
    row: js.Any = null,
    rowData: js.Any = null,
    rowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): RightClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (currentData != null) __obj.updateDynamic("currentData")(currentData)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RightClickEventArgs]
  }
}

