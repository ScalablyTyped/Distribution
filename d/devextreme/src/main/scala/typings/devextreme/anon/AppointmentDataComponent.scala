package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentDataComponent extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  
  var component: js.UndefOr[dxScheduler] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var error: js.UndefOr[typings.std.Error] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object AppointmentDataComponent {
  
  inline def apply(): AppointmentDataComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDataComponent]
  }
  
  extension [Self <: AppointmentDataComponent](x: Self) {
    
    inline def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    inline def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
