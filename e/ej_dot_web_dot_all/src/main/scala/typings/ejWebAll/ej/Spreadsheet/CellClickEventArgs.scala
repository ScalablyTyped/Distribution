package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the click cell element.
    */
  var cell: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the column index of clicked cell.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the column name of clicked cell.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the column information.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the row index of clicked cell.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Returns the value of the cell.
    */
  var value: js.UndefOr[String] = js.undefined
}

object CellClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: HTMLElement = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnName: String = null,
    columnObject: js.Any = null,
    model: Model = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    target: HTMLElement = null,
    `type`: String = null,
    value: String = null
  ): CellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellClickEventArgs]
  }
}

