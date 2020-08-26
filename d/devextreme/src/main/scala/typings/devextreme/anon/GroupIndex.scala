package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupIndex extends js.Object {
  var columns: js.UndefOr[js.Array[_]] = js.native
  var component: js.UndefOr[dxDataGrid] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  var groupIndex: js.UndefOr[Double] = js.native
  var handled: js.UndefOr[Boolean] = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
  var isNewRow: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var rowElement: js.UndefOr[dxElement] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
  var rowType: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object GroupIndex {
  @scala.inline
  def apply(): GroupIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupIndex]
  }
  @scala.inline
  implicit class GroupIndexOps[Self <: GroupIndex] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandled: Self = this.set("handled", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setIsNewRow(value: Boolean): Self = this.set("isNewRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNewRow: Self = this.set("isNewRow", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setJQueryEvent(value: JQueryEventObject): Self = this.set("jQueryEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJQueryEvent: Self = this.set("jQueryEvent", js.undefined)
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRowElement(value: dxElement): Self = this.set("rowElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowElement: Self = this.set("rowElement", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setRowType(value: String): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

