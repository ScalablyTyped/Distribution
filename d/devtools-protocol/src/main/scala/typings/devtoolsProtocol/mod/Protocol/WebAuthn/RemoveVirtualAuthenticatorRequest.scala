package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveVirtualAuthenticatorRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
}
object RemoveVirtualAuthenticatorRequest {
  
  inline def apply(authenticatorId: AuthenticatorId): RemoveVirtualAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveVirtualAuthenticatorRequest]
  }
  
  extension [Self <: RemoveVirtualAuthenticatorRequest](x: Self) {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
  }
}
