package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentDataCancel extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  
  var cancel: js.UndefOr[
    Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]
  ] = js.undefined
  
  var component: js.UndefOr[dxScheduler] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object AppointmentDataCancel {
  
  inline def apply(): AppointmentDataCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDataCancel]
  }
  
  extension [Self <: AppointmentDataCancel](x: Self) {
    
    inline def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    inline def setCancel(value: Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
