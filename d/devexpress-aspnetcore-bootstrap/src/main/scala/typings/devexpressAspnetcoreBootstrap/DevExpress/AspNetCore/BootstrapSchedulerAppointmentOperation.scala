package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerAppointmentOperation extends StObject {
  
  @JSName("apply")
  def apply(): Unit
  
  def cancel(): Unit
  
  /* protected */ val instance: js.Any
}
object BootstrapSchedulerAppointmentOperation {
  
  inline def apply(apply: () => Unit, cancel: () => Unit, instance: js.Any): BootstrapSchedulerAppointmentOperation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), cancel = js.Any.fromFunction0(cancel), instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentOperation]
  }
  
  extension [Self <: BootstrapSchedulerAppointmentOperation](x: Self) {
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
