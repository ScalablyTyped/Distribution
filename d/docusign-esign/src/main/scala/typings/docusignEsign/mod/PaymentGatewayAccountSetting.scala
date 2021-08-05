package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentGatewayAccountSetting extends StObject {
  
  var apiFields: js.UndefOr[String] = js.undefined
  
  var authorizationCode: js.UndefOr[String] = js.undefined
  
  var credentialStatus: js.UndefOr[String] = js.undefined
  
  var merchantId: js.UndefOr[String] = js.undefined
}
object PaymentGatewayAccountSetting {
  
  inline def apply(): PaymentGatewayAccountSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentGatewayAccountSetting]
  }
  
  extension [Self <: PaymentGatewayAccountSetting](x: Self) {
    
    inline def setApiFields(value: String): Self = StObject.set(x, "apiFields", value.asInstanceOf[js.Any])
    
    inline def setApiFieldsUndefined: Self = StObject.set(x, "apiFields", js.undefined)
    
    inline def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    inline def setCredentialStatus(value: String): Self = StObject.set(x, "credentialStatus", value.asInstanceOf[js.Any])
    
    inline def setCredentialStatusUndefined: Self = StObject.set(x, "credentialStatus", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
