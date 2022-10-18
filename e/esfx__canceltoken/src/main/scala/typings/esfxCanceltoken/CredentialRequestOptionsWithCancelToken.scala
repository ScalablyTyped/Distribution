package typings.esfxCanceltoken

import typings.esfxCanceltoken.mod.CancelToken
import typings.std.CredentialMediationRequirement
import typings.std.PublicKeyCredentialRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.CredentialRequestOptions, 'signal'> */
trait CredentialRequestOptionsWithCancelToken extends StObject {
  
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.undefined
  
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  
  var signal: js.UndefOr[CancelToken] = js.undefined
}
object CredentialRequestOptionsWithCancelToken {
  
  inline def apply(): CredentialRequestOptionsWithCancelToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptionsWithCancelToken]
  }
  
  extension [Self <: CredentialRequestOptionsWithCancelToken](x: Self) {
    
    inline def setMediation(value: CredentialMediationRequirement): Self = StObject.set(x, "mediation", value.asInstanceOf[js.Any])
    
    inline def setMediationUndefined: Self = StObject.set(x, "mediation", js.undefined)
    
    inline def setPublicKey(value: PublicKeyCredentialRequestOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSignal(value: CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
