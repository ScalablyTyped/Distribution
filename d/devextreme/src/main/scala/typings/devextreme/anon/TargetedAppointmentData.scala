package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedAppointmentData extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  
  var appointmentElement: js.UndefOr[dxElement] = js.undefined
  
  var component: js.UndefOr[dxScheduler] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var targetedAppointmentData: js.UndefOr[js.Any] = js.undefined
}
object TargetedAppointmentData {
  
  inline def apply(): TargetedAppointmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedAppointmentData]
  }
  
  extension [Self <: TargetedAppointmentData](x: Self) {
    
    inline def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    inline def setAppointmentElement(value: dxElement): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    
    inline def setAppointmentElementUndefined: Self = StObject.set(x, "appointmentElement", js.undefined)
    
    inline def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTargetedAppointmentData(value: js.Any): Self = StObject.set(x, "targetedAppointmentData", value.asInstanceOf[js.Any])
    
    inline def setTargetedAppointmentDataUndefined: Self = StObject.set(x, "targetedAppointmentData", js.undefined)
  }
}
