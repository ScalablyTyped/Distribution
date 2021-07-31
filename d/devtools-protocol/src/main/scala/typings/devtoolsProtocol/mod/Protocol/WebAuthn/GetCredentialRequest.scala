package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  var credentialId: String
}
object GetCredentialRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId, credentialId: String): GetCredentialRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialRequest]
  }
  
  @scala.inline
  implicit class GetCredentialRequestMutableBuilder[Self <: GetCredentialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialId(value: String): Self = StObject.set(x, "credentialId", value.asInstanceOf[js.Any])
  }
}
