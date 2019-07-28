package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current cell row and column index.
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the drag cells range object.
    */
  var dragAndDropRange: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model] = js.undefined
  /** Returns the cell Overwriting alert option value.
    */
  var preventAlert: js.UndefOr[Boolean] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns the target item.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeDropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentCell: js.Any = null,
    dragAndDropRange: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model = null,
    preventAlert: js.UndefOr[Boolean] = js.undefined,
    sheetIdx: Int | Double = null,
    target: HTMLElement = null,
    `type`: String = null
  ): BeforeDropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (dragAndDropRange != null) __obj.updateDynamic("dragAndDropRange")(dragAndDropRange)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(preventAlert)) __obj.updateDynamic("preventAlert")(preventAlert)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeDropEventArgs]
  }
}

