package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStartEventArgs extends js.Object {
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

object DragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentCell: js.Any = null,
    dragAndDropRange: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model = null,
    sheetIdx: Int | Double = null,
    target: HTMLElement = null,
    `type`: String = null
  ): DragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (dragAndDropRange != null) __obj.updateDynamic("dragAndDropRange")(dragAndDropRange)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragStartEventArgs]
  }
}

