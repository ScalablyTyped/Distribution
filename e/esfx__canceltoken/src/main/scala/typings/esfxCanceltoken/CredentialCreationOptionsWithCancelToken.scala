package typings.esfxCanceltoken

import typings.esfxCanceltoken.mod.CancelToken
import typings.std.PublicKeyCredentialCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.CredentialCreationOptions, 'signal'> */
trait CredentialCreationOptionsWithCancelToken extends StObject {
  
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.undefined
  
  var signal: js.UndefOr[CancelToken] = js.undefined
}
object CredentialCreationOptionsWithCancelToken {
  
  inline def apply(): CredentialCreationOptionsWithCancelToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialCreationOptionsWithCancelToken]
  }
  
  extension [Self <: CredentialCreationOptionsWithCancelToken](x: Self) {
    
    inline def setPublicKey(value: PublicKeyCredentialCreationOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSignal(value: CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
