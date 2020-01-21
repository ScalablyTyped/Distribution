package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSaveEventArgs extends js.Object {
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the column name.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the column object.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns isForeignKey option value.
    */
  var isForeignKey: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous value of the cell.
    */
  var previousValue: js.UndefOr[String] = js.undefined
  /** Returns the row data object.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Returns the cell value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object CellSaveEventArgs {
  @scala.inline
  def apply(
    cell: js.Any = null,
    columnName: String = null,
    columnObject: js.Any = null,
    isForeignKey: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    previousValue: String = null,
    rowData: js.Any = null,
    `type`: String = null,
    value: String = null
  ): CellSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject.asInstanceOf[js.Any])
    if (!js.isUndefined(isForeignKey)) __obj.updateDynamic("isForeignKey")(isForeignKey.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousValue != null) __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSaveEventArgs]
  }
}

