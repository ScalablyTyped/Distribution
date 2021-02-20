package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAutomaticPresenceSimulationRequest extends StObject {
  
  var authenticatorId: AuthenticatorId = js.native
  
  var enabled: Boolean = js.native
}
object SetAutomaticPresenceSimulationRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId, enabled: Boolean): SetAutomaticPresenceSimulationRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAutomaticPresenceSimulationRequest]
  }
  
  @scala.inline
  implicit class SetAutomaticPresenceSimulationRequestMutableBuilder[Self <: SetAutomaticPresenceSimulationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
