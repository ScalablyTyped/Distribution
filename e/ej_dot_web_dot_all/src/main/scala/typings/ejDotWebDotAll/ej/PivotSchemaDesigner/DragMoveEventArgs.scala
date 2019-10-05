package typings.ejDotWebDotAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragMoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the HTML element of the dragged field from PivotSchemaDesigner.
    */
  var dragTarget: js.UndefOr[js.Any] = js.undefined
  /** return the JSON details of the dragged field.
    */
  var draggedElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the PivotSchemaDesigner model
    */
  var model: js.UndefOr[js.Any] = js.undefined
}

object DragMoveEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    dragTarget: js.Any = null,
    draggedElementData: js.Any = null,
    model: js.Any = null
  ): DragMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (dragTarget != null) __obj.updateDynamic("dragTarget")(dragTarget)
    if (draggedElementData != null) __obj.updateDynamic("draggedElementData")(draggedElementData)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[DragMoveEventArgs]
  }
}

