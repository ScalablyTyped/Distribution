package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxLookup
import typings.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousValueValue extends js.Object {
  var component: js.UndefOr[dxLookup] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var previousValue: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object PreviousValueValue {
  @scala.inline
  def apply(): PreviousValueValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousValueValue]
  }
  @scala.inline
  implicit class PreviousValueValueOps[Self <: PreviousValueValue] (val x: Self) extends AnyVal {
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
    def setComponent(value: dxLookup): Self = this.set("component", value.asInstanceOf[js.Any])
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
    def setJQueryEvent(value: JQueryEventObject): Self = this.set("jQueryEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJQueryEvent: Self = this.set("jQueryEvent", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreviousValue(value: js.Any): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousValue: Self = this.set("previousValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

