package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSignatureProviders extends StObject {
  
  /**
    * Names of electronic or digital signature providers that can be used.
    */
  var signatureProviders: js.UndefOr[js.Array[AccountSignatureProvider]] = js.undefined
}
object AccountSignatureProviders {
  
  inline def apply(): AccountSignatureProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSignatureProviders]
  }
  
  extension [Self <: AccountSignatureProviders](x: Self) {
    
    inline def setSignatureProviders(value: js.Array[AccountSignatureProvider]): Self = StObject.set(x, "signatureProviders", value.asInstanceOf[js.Any])
    
    inline def setSignatureProvidersUndefined: Self = StObject.set(x, "signatureProviders", js.undefined)
    
    inline def setSignatureProvidersVarargs(value: AccountSignatureProvider*): Self = StObject.set(x, "signatureProviders", js.Array(value :_*))
  }
}
