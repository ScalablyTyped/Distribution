package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSignatureProviderOption extends js.Object {
  
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
  implicit class AccountSignatureProviderOptionOps[Self <: AccountSignatureProviderOption] (val x: Self) extends AnyVal {
    
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
    def setSignatureProviderOptionDisplayName(value: String): Self = this.set("signatureProviderOptionDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderOptionDisplayName: Self = this.set("signatureProviderOptionDisplayName", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionId(value: String): Self = this.set("signatureProviderOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderOptionId: Self = this.set("signatureProviderOptionId", js.undefined)
    
    @scala.inline
    def setSignatureProviderOptionName(value: String): Self = this.set("signatureProviderOptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderOptionName: Self = this.set("signatureProviderOptionName", js.undefined)
  }
}
