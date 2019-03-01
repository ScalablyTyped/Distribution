package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the click cell element.
    */
  var cell: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the column index of clicked cell.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the column name of clicked cell.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the column information.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the row index of clicked cell.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the value of the cell.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CellClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: stdLib.HTMLElement = null,
    columnIndex: scala.Int | scala.Double = null,
    columnName: java.lang.String = null,
    columnObject: js.Any = null,
    model: Model = null,
    rowIndex: scala.Int | scala.Double = null,
    target: stdLib.HTMLElement = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): CellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellClickEventArgs]
  }
}

