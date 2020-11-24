package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSignatureProviders extends js.Object {
  
  /**
    * Names of electronic or digital signature providers that can be used.
    */
  var signatureProviders: js.UndefOr[js.Array[AccountSignatureProvider]] = js.native
}
object AccountSignatureProviders {
  
  @scala.inline
  def apply(): AccountSignatureProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSignatureProviders]
  }
  
  @scala.inline
  implicit class AccountSignatureProvidersOps[Self <: AccountSignatureProviders] (val x: Self) extends AnyVal {
    
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
    def setSignatureProvidersVarargs(value: AccountSignatureProvider*): Self = this.set("signatureProviders", js.Array(value :_*))
    
    @scala.inline
    def setSignatureProviders(value: js.Array[AccountSignatureProvider]): Self = this.set("signatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviders: Self = this.set("signatureProviders", js.undefined)
  }
}
