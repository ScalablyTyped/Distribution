package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetResponseOverrideBitsRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  /**
    * If isBadUP is set, overrides the UP bit in the flags in the authenticator response to
    * be zero. Defaults to false.
    */
  var isBadUP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If isBadUV is set, overrides the UV bit in the flags in the authenticator response to
    * be zero. Defaults to false.
    */
  var isBadUV: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If isBogusSignature is set, overrides the signature in the authenticator response to be zero.
    * Defaults to false.
    */
  var isBogusSignature: js.UndefOr[Boolean] = js.undefined
}
object SetResponseOverrideBitsRequest {
  
  inline def apply(authenticatorId: AuthenticatorId): SetResponseOverrideBitsRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetResponseOverrideBitsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetResponseOverrideBitsRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    inline def setIsBadUP(value: Boolean): Self = StObject.set(x, "isBadUP", value.asInstanceOf[js.Any])
    
    inline def setIsBadUPUndefined: Self = StObject.set(x, "isBadUP", js.undefined)
    
    inline def setIsBadUV(value: Boolean): Self = StObject.set(x, "isBadUV", value.asInstanceOf[js.Any])
    
    inline def setIsBadUVUndefined: Self = StObject.set(x, "isBadUV", js.undefined)
    
    inline def setIsBogusSignature(value: Boolean): Self = StObject.set(x, "isBogusSignature", value.asInstanceOf[js.Any])
    
    inline def setIsBogusSignatureUndefined: Self = StObject.set(x, "isBogusSignature", js.undefined)
  }
}
