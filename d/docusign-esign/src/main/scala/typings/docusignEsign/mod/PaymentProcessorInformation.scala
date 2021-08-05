package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentProcessorInformation extends StObject {
  
  /**
    * The mailing address associated with the payment processor.
    */
  var address: js.UndefOr[/* Contains address information. */ AddressInformation] = js.undefined
  
  /**
    * The id of the billing agreement.
    */
  var billingAgreementId: js.UndefOr[String] = js.undefined
  
  /**
    * The email address associated with the payment processor.
    */
  var email: js.UndefOr[String] = js.undefined
}
object PaymentProcessorInformation {
  
  inline def apply(): PaymentProcessorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentProcessorInformation]
  }
  
  extension [Self <: PaymentProcessorInformation](x: Self) {
    
    inline def setAddress(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBillingAgreementId(value: String): Self = StObject.set(x, "billingAgreementId", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreementIdUndefined: Self = StObject.set(x, "billingAgreementId", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
