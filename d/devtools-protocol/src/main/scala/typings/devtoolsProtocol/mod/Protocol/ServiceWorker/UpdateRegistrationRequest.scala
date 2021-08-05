package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegistrationRequest extends StObject {
  
  var scopeURL: String
}
object UpdateRegistrationRequest {
  
  inline def apply(scopeURL: String): UpdateRegistrationRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistrationRequest]
  }
  
  extension [Self <: UpdateRegistrationRequest](x: Self) {
    
    inline def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
