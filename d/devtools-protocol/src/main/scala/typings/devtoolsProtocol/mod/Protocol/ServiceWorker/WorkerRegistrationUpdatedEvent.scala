package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerRegistrationUpdatedEvent extends StObject {
  
  var registrations: js.Array[ServiceWorkerRegistration]
}
object WorkerRegistrationUpdatedEvent {
  
  inline def apply(registrations: js.Array[ServiceWorkerRegistration]): WorkerRegistrationUpdatedEvent = {
    val __obj = js.Dynamic.literal(registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerRegistrationUpdatedEvent]
  }
  
  extension [Self <: WorkerRegistrationUpdatedEvent](x: Self) {
    
    inline def setRegistrations(value: js.Array[ServiceWorkerRegistration]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsVarargs(value: ServiceWorkerRegistration*): Self = StObject.set(x, "registrations", js.Array(value*))
  }
}
