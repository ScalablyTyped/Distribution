package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeRowDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the dragged record details
    */
  var draggedRecords: js.UndefOr[js.Any] = js.native
  /** Returns the drop details
    */
  var dropDetails: js.UndefOr[js.Any] = js.native
  /** Returns the targeted row.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns the targeted row index.
    */
  var targetIndex: js.UndefOr[js.Any] = js.native
}

object BeforeRowDropEventArgs {
  @scala.inline
  def apply(): BeforeRowDropEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeRowDropEventArgs]
  }
  @scala.inline
  implicit class BeforeRowDropEventArgsOps[Self <: BeforeRowDropEventArgs] (val x: Self) extends AnyVal {
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
    def setDraggedRecords(value: js.Any): Self = this.set("draggedRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggedRecords: Self = this.set("draggedRecords", js.undefined)
    @scala.inline
    def setDropDetails(value: js.Any): Self = this.set("dropDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDetails: Self = this.set("dropDetails", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetIndex(value: js.Any): Self = this.set("targetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIndex: Self = this.set("targetIndex", js.undefined)
  }
  
}

