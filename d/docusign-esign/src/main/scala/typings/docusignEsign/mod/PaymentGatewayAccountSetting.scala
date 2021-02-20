package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentGatewayAccountSetting extends StObject {
  
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
  implicit class PaymentGatewayAccountSettingMutableBuilder[Self <: PaymentGatewayAccountSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiFields(value: String): Self = StObject.set(x, "apiFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFieldsUndefined: Self = StObject.set(x, "apiFields", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    @scala.inline
    def setCredentialStatus(value: String): Self = StObject.set(x, "credentialStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialStatusUndefined: Self = StObject.set(x, "credentialStatus", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
