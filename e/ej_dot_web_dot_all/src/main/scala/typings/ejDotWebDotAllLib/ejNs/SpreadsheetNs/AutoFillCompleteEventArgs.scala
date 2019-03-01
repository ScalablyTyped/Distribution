package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns auto fill begin cell range.
    */
  var dataRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns which direction to drag the auto fill.
    */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** Returns fill cells range.
    */
  var fillRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the auto fill type.
    */
  var fillType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AutoFillCompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    dataRange: js.Array[_] = null,
    direction: java.lang.String = null,
    fillRange: js.Array[_] = null,
    fillType: java.lang.String = null,
    model: Model = null,
    sheetIdx: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): AutoFillCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (fillRange != null) __obj.updateDynamic("fillRange")(fillRange)
    if (fillType != null) __obj.updateDynamic("fillType")(fillType)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AutoFillCompleteEventArgs]
  }
}

