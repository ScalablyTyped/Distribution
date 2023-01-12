package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyMpesaRequest extends StObject {
  
  var IP: js.UndefOr[String] = js.undefined
  
  var amount: String
  
  var country: String
  
  var currency: String
  
  var email: String
  
  var firstname: js.UndefOr[String] = js.undefined
  
  var is_mpesa: String
  
  var is_mpesa_lipa: String
  
  var lastname: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[String] = js.undefined
  
  var narration: js.UndefOr[String] = js.undefined
  
  var payment_type: String
  
  var phonenumber: String
  
  var txRef: String
}
object MobileMoneyMpesaRequest {
  
  inline def apply(
    amount: String,
    country: String,
    currency: String,
    email: String,
    is_mpesa: String,
    is_mpesa_lipa: String,
    payment_type: String,
    phonenumber: String,
    txRef: String
  ): MobileMoneyMpesaRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], is_mpesa = is_mpesa.asInstanceOf[js.Any], is_mpesa_lipa = is_mpesa_lipa.asInstanceOf[js.Any], payment_type = payment_type.asInstanceOf[js.Any], phonenumber = phonenumber.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyMpesaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileMoneyMpesaRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
    
    inline def setIs_mpesa(value: String): Self = StObject.set(x, "is_mpesa", value.asInstanceOf[js.Any])
    
    inline def setIs_mpesa_lipa(value: String): Self = StObject.set(x, "is_mpesa_lipa", value.asInstanceOf[js.Any])
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
    
    inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPhonenumber(value: String): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
