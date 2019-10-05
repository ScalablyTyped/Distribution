package typings.ejDotWebDotAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellEditEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the click cell element.
    */
  var cell: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the columnName of clicked cell.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the column field information.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Spreadsheet.Model] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CellEditEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: HTMLElement = null,
    columnName: String = null,
    columnObject: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Spreadsheet.Model = null,
    target: HTMLElement = null,
    `type`: String = null
  ): CellEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellEditEventArgs]
  }
}

