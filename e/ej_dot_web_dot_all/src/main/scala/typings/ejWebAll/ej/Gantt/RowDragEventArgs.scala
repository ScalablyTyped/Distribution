package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDragEventArgs extends js.Object {
  /** Returns that we can drop over that record or not.
    */
  var canDrop: js.UndefOr[Boolean] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.native
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[Double] = js.native
  /** Returns the drop position value on current target row.
    */
  var dropPosition: js.UndefOr[String] = js.native
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
  /** Duration is rounded off when it is set true.
    */
  var roundOffDuration: js.UndefOr[Boolean] = js.native
  /** Returns the row on which we are dragging.
    */
  var targetRow: js.UndefOr[js.Any] = js.native
  /** Returns the row index on which we are dragging.
    */
  var targetRowIndex: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RowDragEventArgs {
  @scala.inline
  def apply(): RowDragEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDragEventArgs]
  }
  @scala.inline
  implicit class RowDragEventArgsOps[Self <: RowDragEventArgs] (val x: Self) extends AnyVal {
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
    def setCanDrop(value: Boolean): Self = this.set("canDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDraggedRow(value: js.Any): Self = this.set("draggedRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggedRow: Self = this.set("draggedRow", js.undefined)
    @scala.inline
    def setDraggedRowIndex(value: Double): Self = this.set("draggedRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggedRowIndex: Self = this.set("draggedRowIndex", js.undefined)
    @scala.inline
    def setDropPosition(value: String): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropPosition: Self = this.set("dropPosition", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setRoundOffDuration(value: Boolean): Self = this.set("roundOffDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundOffDuration: Self = this.set("roundOffDuration", js.undefined)
    @scala.inline
    def setTargetRow(value: js.Any): Self = this.set("targetRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetRow: Self = this.set("targetRow", js.undefined)
    @scala.inline
    def setTargetRowIndex(value: Double): Self = this.set("targetRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetRowIndex: Self = this.set("targetRowIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

