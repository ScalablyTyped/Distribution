package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchSyncEventRequest extends StObject {
  
  var lastChance: Boolean
  
  var origin: String
  
  var registrationId: RegistrationID
  
  var tag: String
}
object DispatchSyncEventRequest {
  
  @scala.inline
  def apply(lastChance: Boolean, origin: String, registrationId: RegistrationID, tag: String): DispatchSyncEventRequest = {
    val __obj = js.Dynamic.literal(lastChance = lastChance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchSyncEventRequest]
  }
  
  @scala.inline
  implicit class DispatchSyncEventRequestMutableBuilder[Self <: DispatchSyncEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastChance(value: Boolean): Self = StObject.set(x, "lastChance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
