package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionElement extends js.Object {
  var actionElement: js.UndefOr[dxElement] = js.native
  var component: js.UndefOr[dxSpeedDialAction] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
}

object ActionElement {
  @scala.inline
  def apply(): ActionElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionElement]
  }
  @scala.inline
  implicit class ActionElementOps[Self <: ActionElement] (val x: Self) extends AnyVal {
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
    def setActionElement(value: dxElement): Self = this.set("actionElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionElement: Self = this.set("actionElement", js.undefined)
    @scala.inline
    def setComponent(value: dxSpeedDialAction): Self = this.set("component", value.asInstanceOf[js.Any])
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
  }
  
}

