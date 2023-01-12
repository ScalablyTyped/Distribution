package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileOptionsChargeUssdRequest extends StObject {
  
  var IP: js.UndefOr[String] = js.undefined
  
  var amount: String
  
  var country: String
  
  var currency: String
  
  var device_fingerprint: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var firstname: js.UndefOr[String] = js.undefined
  
  var is_ussd: String
  
  var lastname: js.UndefOr[String] = js.undefined
  
  var orderRef: String
  
  var payment_type: js.UndefOr[String] = js.undefined
  
  var phonenumber: js.UndefOr[String] = js.undefined
  
  var txRef: String
}
object MobileOptionsChargeUssdRequest {
  
  inline def apply(
    amount: String,
    country: String,
    currency: String,
    email: String,
    is_ussd: String,
    orderRef: String,
    txRef: String
  ): MobileOptionsChargeUssdRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], is_ussd = is_ussd.asInstanceOf[js.Any], orderRef = orderRef.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileOptionsChargeUssdRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileOptionsChargeUssdRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprint(value: String): Self = StObject.set(x, "device_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprintUndefined: Self = StObject.set(x, "device_fingerprint", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
    
    inline def setIs_ussd(value: String): Self = StObject.set(x, "is_ussd", value.asInstanceOf[js.Any])
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
    
    inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
    
    inline def setOrderRef(value: String): Self = StObject.set(x, "orderRef", value.asInstanceOf[js.Any])
    
    inline def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPayment_typeUndefined: Self = StObject.set(x, "payment_type", js.undefined)
    
    inline def setPhonenumber(value: String): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setPhonenumberUndefined: Self = StObject.set(x, "phonenumber", js.undefined)
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
