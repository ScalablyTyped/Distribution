package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentData extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  
  var targetedAppointmentData: js.UndefOr[js.Any] = js.undefined
}
object AppointmentData {
  
  inline def apply(): AppointmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentData]
  }
  
  extension [Self <: AppointmentData](x: Self) {
    
    inline def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    inline def setTargetedAppointmentData(value: js.Any): Self = StObject.set(x, "targetedAppointmentData", value.asInstanceOf[js.Any])
    
    inline def setTargetedAppointmentDataUndefined: Self = StObject.set(x, "targetedAppointmentData", js.undefined)
  }
}
