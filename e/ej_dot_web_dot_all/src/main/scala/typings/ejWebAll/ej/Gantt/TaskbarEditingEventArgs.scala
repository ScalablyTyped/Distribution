package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskbarEditingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the field values of record being edited.
    */
  var editingFields: js.UndefOr[js.Any] = js.native
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns duration value will be round-off or not.
    */
  var roundOffDuration: js.UndefOr[Boolean] = js.native
  /** Returns the row object being edited.
    */
  var rowData: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object TaskbarEditingEventArgs {
  @scala.inline
  def apply(): TaskbarEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskbarEditingEventArgs]
  }
  @scala.inline
  implicit class TaskbarEditingEventArgsOps[Self <: TaskbarEditingEventArgs] (val x: Self) extends AnyVal {
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
    def setEditingFields(value: js.Any): Self = this.set("editingFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditingFields: Self = this.set("editingFields", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRoundOffDuration(value: Boolean): Self = this.set("roundOffDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundOffDuration: Self = this.set("roundOffDuration", js.undefined)
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

