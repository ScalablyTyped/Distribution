package typings.ejWebAll.ej.PivotSchemaDesigner

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
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (dragTarget != null) __obj.updateDynamic("dragTarget")(dragTarget.asInstanceOf[js.Any])
    if (draggedElementData != null) __obj.updateDynamic("draggedElementData")(draggedElementData.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragMoveEventArgs]
  }
}

