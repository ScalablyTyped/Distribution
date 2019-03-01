package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the selected range.
    */
  var selectedRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the active sheet index.
    */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    selectedRange: js.Array[_] = null,
    sheetIdx: scala.Int | scala.Double = null,
    target: stdLib.HTMLElement = null,
    `type`: java.lang.String = null
  ): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (selectedRange != null) __obj.updateDynamic("selectedRange")(selectedRange)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

