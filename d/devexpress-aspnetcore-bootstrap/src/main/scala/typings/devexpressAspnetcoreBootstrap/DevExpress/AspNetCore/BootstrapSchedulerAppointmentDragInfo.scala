package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerAppointmentDragInfo extends StObject {
  
  val appointmentId: String
  
  /* protected */ val instance: Any
  
  val newInterval: BootstrapTimeInterval | Null
  
  val oldInterval: BootstrapTimeInterval | Null
}
object BootstrapSchedulerAppointmentDragInfo {
  
  inline def apply(appointmentId: String, instance: Any): BootstrapSchedulerAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], newInterval = null, oldInterval = null)
    __obj.asInstanceOf[BootstrapSchedulerAppointmentDragInfo]
  }
  
  extension [Self <: BootstrapSchedulerAppointmentDragInfo](x: Self) {
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setNewInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    inline def setNewIntervalNull: Self = StObject.set(x, "newInterval", null)
    
    inline def setOldInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
    
    inline def setOldIntervalNull: Self = StObject.set(x, "oldInterval", null)
  }
}
