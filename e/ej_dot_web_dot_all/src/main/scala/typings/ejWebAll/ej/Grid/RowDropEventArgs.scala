package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the JSON data of dragged rows.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns draggable element type.
    */
  var draggableType: js.UndefOr[String] = js.native
  /** Returns the JSON data of dragged rows.
    */
  var droppedRecords: js.UndefOr[js.Any] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the draggable row object.
    */
  var rows: js.UndefOr[js.Any] = js.native
  /** Returns the current mouse position cell element.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RowDropEventArgs {
  @scala.inline
  def apply(): RowDropEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDropEventArgs]
  }
  @scala.inline
  implicit class RowDropEventArgsOps[Self <: RowDropEventArgs] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDraggableType(value: String): Self = this.set("draggableType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableType: Self = this.set("draggableType", js.undefined)
    @scala.inline
    def setDroppedRecords(value: js.Any): Self = this.set("droppedRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDroppedRecords: Self = this.set("droppedRecords", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRows(value: js.Any): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

