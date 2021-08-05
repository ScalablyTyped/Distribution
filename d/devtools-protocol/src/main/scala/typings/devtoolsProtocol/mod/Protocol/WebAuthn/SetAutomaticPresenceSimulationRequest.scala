package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAutomaticPresenceSimulationRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  var enabled: Boolean
}
object SetAutomaticPresenceSimulationRequest {
  
  inline def apply(authenticatorId: AuthenticatorId, enabled: Boolean): SetAutomaticPresenceSimulationRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAutomaticPresenceSimulationRequest]
  }
  
  extension [Self <: SetAutomaticPresenceSimulationRequest](x: Self) {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
