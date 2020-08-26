package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevRowIndex extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.native
  var component: js.UndefOr[dxTreeList] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var newRowIndex: js.UndefOr[Double] = js.native
  var prevRowIndex: js.UndefOr[Double] = js.native
  var rowElement: js.UndefOr[dxElement] = js.native
  var rows: js.UndefOr[js.Array[dxTreeListRowObject]] = js.native
}

object PrevRowIndex {
  @scala.inline
  def apply(): PrevRowIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrevRowIndex]
  }
  @scala.inline
  implicit class PrevRowIndexOps[Self <: PrevRowIndex] (val x: Self) extends AnyVal {
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
    def setComponent(value: dxTreeList): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNewRowIndex(value: Double): Self = this.set("newRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewRowIndex: Self = this.set("newRowIndex", js.undefined)
    @scala.inline
    def setPrevRowIndex(value: Double): Self = this.set("prevRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevRowIndex: Self = this.set("prevRowIndex", js.undefined)
    @scala.inline
    def setRowElement(value: dxElement): Self = this.set("rowElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowElement: Self = this.set("rowElement", js.undefined)
    @scala.inline
    def setRowsVarargs(value: dxTreeListRowObject*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[dxTreeListRowObject]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

