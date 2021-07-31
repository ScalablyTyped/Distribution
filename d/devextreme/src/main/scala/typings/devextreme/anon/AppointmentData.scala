package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentData extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  
  var targetedAppointmentData: js.UndefOr[js.Any] = js.undefined
}
object AppointmentData {
  
  @scala.inline
  def apply(): AppointmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentData]
  }
  
  @scala.inline
  implicit class AppointmentDataMutableBuilder[Self <: AppointmentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    @scala.inline
    def setTargetedAppointmentData(value: js.Any): Self = StObject.set(x, "targetedAppointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedAppointmentDataUndefined: Self = StObject.set(x, "targetedAppointmentData", js.undefined)
  }
}
