package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountChargeRequest extends StObject {
  
  var IP: js.UndefOr[String] = js.undefined
  
  var accountbank: String
  
  var accountnumber: String
  
  var amount: String
  
  var billingzip: js.UndefOr[String] = js.undefined
  
  var bvn: js.UndefOr[String] = js.undefined
  
  var charge_type: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var device_fingerprint: String
  
  var email: String
  
  var firstname: js.UndefOr[String] = js.undefined
  
  var include_integrity_hash: js.UndefOr[Any] = js.undefined
  
  var is_internet_banking: js.UndefOr[Any] = js.undefined
  
  var lastname: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var narration: js.UndefOr[String] = js.undefined
  
  var payment_type: js.UndefOr[String] = js.undefined
  
  var phonenumber: js.UndefOr[String] = js.undefined
  
  var pin: js.UndefOr[String] = js.undefined
  
  var txRef: String
}
object AccountChargeRequest {
  
  inline def apply(
    accountbank: String,
    accountnumber: String,
    amount: String,
    device_fingerprint: String,
    email: String,
    txRef: String
  ): AccountChargeRequest = {
    val __obj = js.Dynamic.literal(accountbank = accountbank.asInstanceOf[js.Any], accountnumber = accountnumber.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], device_fingerprint = device_fingerprint.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountChargeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountChargeRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountbank(value: String): Self = StObject.set(x, "accountbank", value.asInstanceOf[js.Any])
    
    inline def setAccountnumber(value: String): Self = StObject.set(x, "accountnumber", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBillingzip(value: String): Self = StObject.set(x, "billingzip", value.asInstanceOf[js.Any])
    
    inline def setBillingzipUndefined: Self = StObject.set(x, "billingzip", js.undefined)
    
    inline def setBvn(value: String): Self = StObject.set(x, "bvn", value.asInstanceOf[js.Any])
    
    inline def setBvnUndefined: Self = StObject.set(x, "bvn", js.undefined)
    
    inline def setCharge_type(value: String): Self = StObject.set(x, "charge_type", value.asInstanceOf[js.Any])
    
    inline def setCharge_typeUndefined: Self = StObject.set(x, "charge_type", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDevice_fingerprint(value: String): Self = StObject.set(x, "device_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
    
    inline def setInclude_integrity_hash(value: Any): Self = StObject.set(x, "include_integrity_hash", value.asInstanceOf[js.Any])
    
    inline def setInclude_integrity_hashUndefined: Self = StObject.set(x, "include_integrity_hash", js.undefined)
    
    inline def setIs_internet_banking(value: Any): Self = StObject.set(x, "is_internet_banking", value.asInstanceOf[js.Any])
    
    inline def setIs_internet_bankingUndefined: Self = StObject.set(x, "is_internet_banking", js.undefined)
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
    
    inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPayment_typeUndefined: Self = StObject.set(x, "payment_type", js.undefined)
    
    inline def setPhonenumber(value: String): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setPhonenumberUndefined: Self = StObject.set(x, "phonenumber", js.undefined)
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
