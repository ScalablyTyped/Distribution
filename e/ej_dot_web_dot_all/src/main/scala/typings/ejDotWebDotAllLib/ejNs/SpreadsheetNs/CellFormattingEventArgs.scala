package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormattingEventArgs extends js.Object {
  /** Returns the cell index.
    */
  var Cell: js.UndefOr[scala.Double] = js.undefined
  /** Returns the applied style format object
    */
  var Format: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index
    */
  var SheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the CSS theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellFormattingEventArgs {
  @scala.inline
  def apply(
    Cell: scala.Int | scala.Double = null,
    Format: js.Any = null,
    SheetIdx: scala.Int | scala.Double = null,
    cssClass: java.lang.String = null,
    model: Model = null,
    target: stdLib.HTMLElement = null,
    `type`: java.lang.String = null
  ): CellFormattingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (SheetIdx != null) __obj.updateDynamic("SheetIdx")(SheetIdx.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellFormattingEventArgs]
  }
}

