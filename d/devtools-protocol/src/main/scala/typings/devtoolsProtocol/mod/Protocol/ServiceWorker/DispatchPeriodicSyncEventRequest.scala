package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchPeriodicSyncEventRequest extends StObject {
  
  var origin: String
  
  var registrationId: RegistrationID
  
  var tag: String
}
object DispatchPeriodicSyncEventRequest {
  
  inline def apply(origin: String, registrationId: RegistrationID, tag: String): DispatchPeriodicSyncEventRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchPeriodicSyncEventRequest]
  }
  
  extension [Self <: DispatchPeriodicSyncEventRequest](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
