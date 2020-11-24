package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureProviderRequiredOption extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var requiredSignatureProviderOptionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signerType: js.UndefOr[String] = js.native
}
object SignatureProviderRequiredOption {
  
  @scala.inline
  def apply(): SignatureProviderRequiredOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureProviderRequiredOption]
  }
  
  @scala.inline
  implicit class SignatureProviderRequiredOptionOps[Self <: SignatureProviderRequiredOption] (val x: Self) extends AnyVal {
    
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
    def setRequiredSignatureProviderOptionIdsVarargs(value: String*): Self = this.set("requiredSignatureProviderOptionIds", js.Array(value :_*))
    
    @scala.inline
    def setRequiredSignatureProviderOptionIds(value: js.Array[String]): Self = this.set("requiredSignatureProviderOptionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredSignatureProviderOptionIds: Self = this.set("requiredSignatureProviderOptionIds", js.undefined)
    
    @scala.inline
    def setSignerType(value: String): Self = this.set("signerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerType: Self = this.set("signerType", js.undefined)
  }
}
