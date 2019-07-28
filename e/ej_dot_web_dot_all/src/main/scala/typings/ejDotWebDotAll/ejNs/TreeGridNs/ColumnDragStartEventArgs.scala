package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDragStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column data which is dragged
    */
  var draggedColumn: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the column being dragged
    */
  var draggedColumnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnDragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedColumn: js.Any = null,
    draggedColumnIndex: Int | Double = null,
    model: js.Any = null,
    `type`: String = null
  ): ColumnDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (draggedColumn != null) __obj.updateDynamic("draggedColumn")(draggedColumn)
    if (draggedColumnIndex != null) __obj.updateDynamic("draggedColumnIndex")(draggedColumnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnDragStartEventArgs]
  }
}

