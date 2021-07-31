package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCredentialRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  var credential: Credential
}
object AddCredentialRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId, credential: Credential): AddCredentialRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCredentialRequest]
  }
  
  @scala.inline
  implicit class AddCredentialRequestMutableBuilder[Self <: AddCredentialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
  }
}
