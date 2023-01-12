package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveCredentialRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  var credentialId: String
}
object RemoveCredentialRequest {
  
  inline def apply(authenticatorId: AuthenticatorId, credentialId: String): RemoveCredentialRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCredentialRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveCredentialRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    inline def setCredentialId(value: String): Self = StObject.set(x, "credentialId", value.asInstanceOf[js.Any])
  }
}
