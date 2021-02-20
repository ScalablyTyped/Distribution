package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliverPushMessageRequest extends StObject {
  
  var data: String = js.native
  
  var origin: String = js.native
  
  var registrationId: RegistrationID = js.native
}
object DeliverPushMessageRequest {
  
  @scala.inline
  def apply(data: String, origin: String, registrationId: RegistrationID): DeliverPushMessageRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliverPushMessageRequest]
  }
  
  @scala.inline
  implicit class DeliverPushMessageRequestMutableBuilder[Self <: DeliverPushMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
  }
}
