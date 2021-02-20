package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSignatureProvider extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var isRequired: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var priority: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderId: js.UndefOr[String] = js.native
  
  /**
    * The name of an Electronic or Standards Based Signature (digital signature) provider for the signer to use. For details,
    * see [the current provider list](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures).
    * You can also retrieve the list by using the [AccountSignatureProviders::List](https://developers.docusign.com/esign-rest-api/reference/Accounts/AccountSignatureProviders/list/)
    * method.
    *
    * Example: `universalsignaturepen_default`
    *
    *
    */
  var signatureProviderName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderOptionsMetadata: js.UndefOr[js.Array[/* Reserved for DocuSign. */ AccountSignatureProviderOption]] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signatureProviderRequiredOptions: js.UndefOr[
    js.Array[
      /* Contains additional information that a specific signature provider requires. */ SignatureProviderRequiredOption
    ]
  ] = js.native
}
object AccountSignatureProvider {
  
  @scala.inline
  def apply(): AccountSignatureProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSignatureProvider]
  }
  
  @scala.inline
  implicit class AccountSignatureProviderMutableBuilder[Self <: AccountSignatureProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequired(value: String): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSignatureProviderDisplayName(value: String): Self = StObject.set(x, "signatureProviderDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderDisplayNameUndefined: Self = StObject.set(x, "signatureProviderDisplayName", js.undefined)
    
    @scala.inline
    def setSignatureProviderId(value: String): Self = StObject.set(x, "signatureProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderIdUndefined: Self = StObject.set(x, "signatureProviderId", js.undefined)
    
    @scala.inline
    def setSignatureProviderName(value: String): Self = StObject.set(x, "signatureProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderNameUndefined: Self = StObject.set(x, "signatureProviderName", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionsMetadata(value: js.Array[/* Reserved for DocuSign. */ AccountSignatureProviderOption]): Self = StObject.set(x, "signatureProviderOptionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderOptionsMetadataUndefined: Self = StObject.set(x, "signatureProviderOptionsMetadata", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionsMetadataVarargs(value: (/* Reserved for DocuSign. */ AccountSignatureProviderOption)*): Self = StObject.set(x, "signatureProviderOptionsMetadata", js.Array(value :_*))
    
    @scala.inline
    def setSignatureProviderRequiredOptions(
      value: js.Array[
          /* Contains additional information that a specific signature provider requires. */ SignatureProviderRequiredOption
        ]
    ): Self = StObject.set(x, "signatureProviderRequiredOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderRequiredOptionsUndefined: Self = StObject.set(x, "signatureProviderRequiredOptions", js.undefined)
    
    @scala.inline
    def setSignatureProviderRequiredOptionsVarargs(
      value: (/* Contains additional information that a specific signature provider requires. */ SignatureProviderRequiredOption)*
    ): Self = StObject.set(x, "signatureProviderRequiredOptions", js.Array(value :_*))
  }
}
