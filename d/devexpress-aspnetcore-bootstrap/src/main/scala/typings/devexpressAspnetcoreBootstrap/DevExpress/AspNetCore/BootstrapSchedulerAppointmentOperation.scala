package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSchedulerAppointmentOperation extends StObject {
  
  @JSName("apply")
  def apply(): Unit = js.native
  
  def cancel(): Unit = js.native
  
  val instance: js.Any = js.native
}
object BootstrapSchedulerAppointmentOperation {
  
  @scala.inline
  def apply(apply: () => Unit, cancel: () => Unit, instance: js.Any): BootstrapSchedulerAppointmentOperation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), cancel = js.Any.fromFunction0(cancel), instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentOperation]
  }
  
  @scala.inline
  implicit class BootstrapSchedulerAppointmentOperationMutableBuilder[Self <: BootstrapSchedulerAppointmentOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
