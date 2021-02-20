package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCredentialsRequest extends StObject {
  
  var authenticatorId: AuthenticatorId = js.native
}
object ClearCredentialsRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId): ClearCredentialsRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearCredentialsRequest]
  }
  
  @scala.inline
  implicit class ClearCredentialsRequestMutableBuilder[Self <: ClearCredentialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
  }
}
