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
  
  @scala.inline
  def apply(): AccountSignatureProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSignatureProviders]
  }
  
  @scala.inline
  implicit class AccountSignatureProvidersMutableBuilder[Self <: AccountSignatureProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatureProviders(value: js.Array[AccountSignatureProvider]): Self = StObject.set(x, "signatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProvidersUndefined: Self = StObject.set(x, "signatureProviders", js.undefined)
    
    @scala.inline
    def setSignatureProvidersVarargs(value: AccountSignatureProvider*): Self = StObject.set(x, "signatureProviders", js.Array(value :_*))
  }
}
