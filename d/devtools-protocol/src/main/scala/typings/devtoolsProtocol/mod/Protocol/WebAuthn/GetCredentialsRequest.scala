package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
}
object GetCredentialsRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId): GetCredentialsRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsRequest]
  }
  
  @scala.inline
  implicit class GetCredentialsRequestMutableBuilder[Self <: GetCredentialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
  }
}
