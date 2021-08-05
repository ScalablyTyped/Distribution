package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentCount extends StObject {
  
  var appointmentCount: js.UndefOr[Double] = js.undefined
  
  var isCompact: js.UndefOr[Boolean] = js.undefined
}
object AppointmentCount {
  
  inline def apply(): AppointmentCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCount]
  }
  
  extension [Self <: AppointmentCount](x: Self) {
    
    inline def setAppointmentCount(value: Double): Self = StObject.set(x, "appointmentCount", value.asInstanceOf[js.Any])
    
    inline def setAppointmentCountUndefined: Self = StObject.set(x, "appointmentCount", js.undefined)
    
    inline def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
    
    inline def setIsCompactUndefined: Self = StObject.set(x, "isCompact", js.undefined)
  }
}
