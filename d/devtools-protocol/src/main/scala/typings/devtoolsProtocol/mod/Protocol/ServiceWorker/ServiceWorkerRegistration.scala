package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistration extends StObject {
  
  var isDeleted: Boolean
  
  var registrationId: RegistrationID
  
  var scopeURL: String
}
object ServiceWorkerRegistration {
  
  @scala.inline
  def apply(isDeleted: Boolean, registrationId: RegistrationID, scopeURL: String): ServiceWorkerRegistration = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistration]
  }
  
  @scala.inline
  implicit class ServiceWorkerRegistrationMutableBuilder[Self <: ServiceWorkerRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
