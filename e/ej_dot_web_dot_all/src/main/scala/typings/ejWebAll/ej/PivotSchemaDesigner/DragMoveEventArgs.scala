package typings.ejWebAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragMoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the HTML element of the dragged field from PivotSchemaDesigner.
    */
  var dragTarget: js.UndefOr[js.Any] = js.native
  /** return the JSON details of the dragged field.
    */
  var draggedElementData: js.UndefOr[js.Any] = js.native
  /** returns the PivotSchemaDesigner model
    */
  var model: js.UndefOr[js.Any] = js.native
}

object DragMoveEventArgs {
  @scala.inline
  def apply(): DragMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragMoveEventArgs]
  }
  @scala.inline
  implicit class DragMoveEventArgsOps[Self <: DragMoveEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDragTarget(value: js.Any): Self = this.set("dragTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragTarget: Self = this.set("dragTarget", js.undefined)
    @scala.inline
    def setDraggedElementData(value: js.Any): Self = this.set("draggedElementData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggedElementData: Self = this.set("draggedElementData", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

