package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCellFormatEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the selected cells.
    */
  var cells: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** Returns the applied style format object.
    */
  var format: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeCellFormatEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cells: js.Array[_] | js.Any = null,
    format: js.Any = null,
    model: Model = null,
    sheetIdx: Int | Double = null,
    `type`: String = null
  ): BeforeCellFormatEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCellFormatEventArgs]
  }
}

