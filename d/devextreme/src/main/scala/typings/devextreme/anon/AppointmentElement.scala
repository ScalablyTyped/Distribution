package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentElement extends js.Object {
  
  var appointmentData: js.UndefOr[js.Any] = js.native
  
  var appointmentElement: js.UndefOr[dxElement] = js.native
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[dxScheduler] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var targetedAppointmentData: js.UndefOr[js.Any] = js.native
}
object AppointmentElement {
  
  @scala.inline
  def apply(): AppointmentElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentElement]
  }
  
  @scala.inline
  implicit class AppointmentElementOps[Self <: AppointmentElement] (val x: Self) extends AnyVal {
    
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
    def setAppointmentData(value: js.Any): Self = this.set("appointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentData: Self = this.set("appointmentData", js.undefined)
    
    @scala.inline
    def setAppointmentElement(value: dxElement): Self = this.set("appointmentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentElement: Self = this.set("appointmentElement", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxScheduler): Self = this.set("component", value.asInstanceOf[js.Any])
    
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
    def setTargetedAppointmentData(value: js.Any): Self = this.set("targetedAppointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedAppointmentData: Self = this.set("targetedAppointmentData", js.undefined)
  }
}
