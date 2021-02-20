package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSignatureProviderOption extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionId: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionName: js.UndefOr[String] = js.native
}
object AccountSignatureProviderOption {
  
  @scala.inline
  def apply(): AccountSignatureProviderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSignatureProviderOption]
  }
  
  @scala.inline
  implicit class AccountSignatureProviderOptionMutableBuilder[Self <: AccountSignatureProviderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatureProviderOptionDisplayName(value: String): Self = StObject.set(x, "signatureProviderOptionDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderOptionDisplayNameUndefined: Self = StObject.set(x, "signatureProviderOptionDisplayName", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionId(value: String): Self = StObject.set(x, "signatureProviderOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderOptionIdUndefined: Self = StObject.set(x, "signatureProviderOptionId", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionName(value: String): Self = StObject.set(x, "signatureProviderOptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderOptionNameUndefined: Self = StObject.set(x, "signatureProviderOptionName", js.undefined)
  }
}
