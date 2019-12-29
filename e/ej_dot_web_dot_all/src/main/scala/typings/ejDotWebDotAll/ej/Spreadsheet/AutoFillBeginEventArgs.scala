package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns auto fill begin cell range.
    */
  var dataRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns which direction drag the auto fill.
    */
  var direction: js.UndefOr[String] = js.undefined
  /** Returns fill cells range.
    */
  var fillRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the auto fill type.
    */
  var fillType: js.UndefOr[String] = js.undefined
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

object AutoFillBeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    dataRange: js.Array[_] = null,
    direction: String = null,
    fillRange: js.Array[_] = null,
    fillType: String = null,
    model: Model = null,
    sheetIdx: Int | Double = null,
    `type`: String = null
  ): AutoFillBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fillRange != null) __obj.updateDynamic("fillRange")(fillRange.asInstanceOf[js.Any])
    if (fillType != null) __obj.updateDynamic("fillType")(fillType.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillBeginEventArgs]
  }
}

