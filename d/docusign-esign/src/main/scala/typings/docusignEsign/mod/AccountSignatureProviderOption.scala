package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSignatureProviderOption extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionId: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionName: js.UndefOr[String] = js.undefined
}
object AccountSignatureProviderOption {
  
  inline def apply(): AccountSignatureProviderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSignatureProviderOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSignatureProviderOption] (val x: Self) extends AnyVal {
    
    inline def setSignatureProviderOptionDisplayName(value: String): Self = StObject.set(x, "signatureProviderOptionDisplayName", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderOptionDisplayNameUndefined: Self = StObject.set(x, "signatureProviderOptionDisplayName", js.undefined)
    
    inline def setSignatureProviderOptionId(value: String): Self = StObject.set(x, "signatureProviderOptionId", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderOptionIdUndefined: Self = StObject.set(x, "signatureProviderOptionId", js.undefined)
    
    inline def setSignatureProviderOptionName(value: String): Self = StObject.set(x, "signatureProviderOptionName", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderOptionNameUndefined: Self = StObject.set(x, "signatureProviderOptionName", js.undefined)
  }
}
