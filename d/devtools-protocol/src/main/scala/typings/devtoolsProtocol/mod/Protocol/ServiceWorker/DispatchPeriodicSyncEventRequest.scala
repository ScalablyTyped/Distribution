package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatchPeriodicSyncEventRequest extends StObject {
  
  var origin: String = js.native
  
  var registrationId: RegistrationID = js.native
  
  var tag: String = js.native
}
object DispatchPeriodicSyncEventRequest {
  
  @scala.inline
  def apply(origin: String, registrationId: RegistrationID, tag: String): DispatchPeriodicSyncEventRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchPeriodicSyncEventRequest]
  }
  
  @scala.inline
  implicit class DispatchPeriodicSyncEventRequestMutableBuilder[Self <: DispatchPeriodicSyncEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
