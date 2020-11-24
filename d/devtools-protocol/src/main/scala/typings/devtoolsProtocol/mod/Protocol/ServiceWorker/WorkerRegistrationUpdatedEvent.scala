package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerRegistrationUpdatedEvent extends js.Object {
  
  var registrations: js.Array[ServiceWorkerRegistration] = js.native
}
object WorkerRegistrationUpdatedEvent {
  
  @scala.inline
  def apply(registrations: js.Array[ServiceWorkerRegistration]): WorkerRegistrationUpdatedEvent = {
    val __obj = js.Dynamic.literal(registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerRegistrationUpdatedEvent]
  }
  
  @scala.inline
  implicit class WorkerRegistrationUpdatedEventOps[Self <: WorkerRegistrationUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegistrationsVarargs(value: ServiceWorkerRegistration*): Self = this.set("registrations", js.Array(value :_*))
    
    @scala.inline
    def setRegistrations(value: js.Array[ServiceWorkerRegistration]): Self = this.set("registrations", value.asInstanceOf[js.Any])
  }
}
