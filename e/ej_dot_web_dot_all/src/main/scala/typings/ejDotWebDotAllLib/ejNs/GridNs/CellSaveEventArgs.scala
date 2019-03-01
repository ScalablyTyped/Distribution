package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSaveEventArgs extends js.Object {
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the column name.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the column object.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns isForeignKey option value.
    */
  var isForeignKey: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous value of the cell.
    */
  var previousValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the row data object.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cell value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CellSaveEventArgs {
  @scala.inline
  def apply(
    cell: js.Any = null,
    columnName: java.lang.String = null,
    columnObject: js.Any = null,
    isForeignKey: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    previousValue: java.lang.String = null,
    rowData: js.Any = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): CellSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject)
    if (!js.isUndefined(isForeignKey)) __obj.updateDynamic("isForeignKey")(isForeignKey)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousValue != null) __obj.updateDynamic("previousValue")(previousValue)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellSaveEventArgs]
  }
}

