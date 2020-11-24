package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentGatewayAccountSetting extends js.Object {
  
  var apiFields: js.UndefOr[String] = js.native
  
  var authorizationCode: js.UndefOr[String] = js.native
  
  var credentialStatus: js.UndefOr[String] = js.native
  
  var merchantId: js.UndefOr[String] = js.native
}
object PaymentGatewayAccountSetting {
  
  @scala.inline
  def apply(): PaymentGatewayAccountSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentGatewayAccountSetting]
  }
  
  @scala.inline
  implicit class PaymentGatewayAccountSettingOps[Self <: PaymentGatewayAccountSetting] (val x: Self) extends AnyVal {
    
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
    def setApiFields(value: String): Self = this.set("apiFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiFields: Self = this.set("apiFields", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = this.set("authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationCode: Self = this.set("authorizationCode", js.undefined)
    
    @scala.inline
    def setCredentialStatus(value: String): Self = this.set("credentialStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialStatus: Self = this.set("credentialStatus", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
  }
}
