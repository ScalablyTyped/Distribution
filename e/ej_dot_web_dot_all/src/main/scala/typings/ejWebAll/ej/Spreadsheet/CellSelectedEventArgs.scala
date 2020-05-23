package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the selected range.
    */
  var selectedRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the active sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    selectedRange: js.Array[_] = null,
    sheetIdx: js.UndefOr[Double] = js.undefined,
    target: HTMLElement = null,
    `type`: String = null
  ): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (selectedRange != null) __obj.updateDynamic("selectedRange")(selectedRange.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetIdx)) __obj.updateDynamic("sheetIdx")(sheetIdx.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

