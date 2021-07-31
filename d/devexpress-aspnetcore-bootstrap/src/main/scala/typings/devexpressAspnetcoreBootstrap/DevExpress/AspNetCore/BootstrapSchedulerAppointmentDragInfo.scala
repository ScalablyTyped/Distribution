package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerAppointmentDragInfo extends StObject {
  
  val appointmentId: String
  
  val instance: js.Any
  
  val newInterval: BootstrapTimeInterval | Null
  
  val oldInterval: BootstrapTimeInterval | Null
}
object BootstrapSchedulerAppointmentDragInfo {
  
  @scala.inline
  def apply(appointmentId: String, instance: js.Any): BootstrapSchedulerAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], newInterval = null, oldInterval = null)
    __obj.asInstanceOf[BootstrapSchedulerAppointmentDragInfo]
  }
  
  @scala.inline
  implicit class BootstrapSchedulerAppointmentDragInfoMutableBuilder[Self <: BootstrapSchedulerAppointmentDragInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIntervalNull: Self = StObject.set(x, "newInterval", null)
    
    @scala.inline
    def setOldInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIntervalNull: Self = StObject.set(x, "oldInterval", null)
  }
}
