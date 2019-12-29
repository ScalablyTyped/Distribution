package typings.ejDotWebDotAll.ej.Spreadsheet

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
  var model: js.UndefOr[Model] = js.undefined
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
    model: Model = null,
    sheetIdx: Int | Double = null,
    target: HTMLElement = null,
    `type`: String = null
  ): DragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell.asInstanceOf[js.Any])
    if (dragAndDropRange != null) __obj.updateDynamic("dragAndDropRange")(dragAndDropRange.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStartEventArgs]
  }
}

