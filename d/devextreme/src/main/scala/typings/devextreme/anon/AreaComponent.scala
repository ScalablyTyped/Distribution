package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser
import typings.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaComponent extends js.Object {
  var area: js.UndefOr[String] = js.native
  var component: js.UndefOr[dxPivotGridFieldChooser] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  var field: js.UndefOr[PivotGridDataSourceField] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.native
  var model: js.UndefOr[js.Any] = js.native
}

object AreaComponent {
  @scala.inline
  def apply(): AreaComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaComponent]
  }
  @scala.inline
  implicit class AreaComponentOps[Self <: AreaComponent] (val x: Self) extends AnyVal {
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
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setComponent(value: dxPivotGridFieldChooser): Self = this.set("component", value.asInstanceOf[js.Any])
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
    def setField(value: PivotGridDataSourceField): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setJQueryEvent(value: JQueryEventObject): Self = this.set("jQueryEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJQueryEvent: Self = this.set("jQueryEvent", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

