package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSignatureProvider extends js.Object {
  
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
  implicit class AccountSignatureProviderOps[Self <: AccountSignatureProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsRequired(value: String): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSignatureProviderDisplayName(value: String): Self = this.set("signatureProviderDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderDisplayName: Self = this.set("signatureProviderDisplayName", js.undefined)
    
    @scala.inline
    def setSignatureProviderId(value: String): Self = this.set("signatureProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderId: Self = this.set("signatureProviderId", js.undefined)
    
    @scala.inline
    def setSignatureProviderName(value: String): Self = this.set("signatureProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderName: Self = this.set("signatureProviderName", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionsMetadataVarargs(value: (/* Reserved for DocuSign. */ AccountSignatureProviderOption)*): Self = this.set("signatureProviderOptionsMetadata", js.Array(value :_*))
    
    @scala.inline
    def setSignatureProviderOptionsMetadata(value: js.Array[/* Reserved for DocuSign. */ AccountSignatureProviderOption]): Self = this.set("signatureProviderOptionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderOptionsMetadata: Self = this.set("signatureProviderOptionsMetadata", js.undefined)
    
    @scala.inline
    def setSignatureProviderRequiredOptionsVarargs(
      value: (/* Contains additional information that a specific signature provider requires. */ SignatureProviderRequiredOption)*
    ): Self = this.set("signatureProviderRequiredOptions", js.Array(value :_*))
    
    @scala.inline
    def setSignatureProviderRequiredOptions(
      value: js.Array[
          /* Contains additional information that a specific signature provider requires. */ SignatureProviderRequiredOption
        ]
    ): Self = this.set("signatureProviderRequiredOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderRequiredOptions: Self = this.set("signatureProviderRequiredOptions", js.undefined)
  }
}
