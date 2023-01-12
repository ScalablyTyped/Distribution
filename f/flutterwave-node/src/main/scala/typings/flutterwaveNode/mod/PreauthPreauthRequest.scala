package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreauthPreauthRequest extends StObject {
  
  var IP: String
  
  var amount: String | Double
  
  var billingzip: js.UndefOr[String | Double] = js.undefined
  
  var bvn: js.UndefOr[String | Double] = js.undefined
  
  var cardno: String | Double
  
  var charge_type: String
  
  var country: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var cvv: String | Double
  
  var device_fingerprint: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var expirymonth: String | Double
  
  var expiryyear: String | Double
  
  var firstname: js.UndefOr[String] = js.undefined
  
  var include_integrity_hash: js.UndefOr[String] = js.undefined
  
  var lastname: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var narration: js.UndefOr[String] = js.undefined
  
  var phonenumber: js.UndefOr[String | Double] = js.undefined
  
  var pin: js.UndefOr[String | Double] = js.undefined
  
  var recurring_stop: js.UndefOr[String] = js.undefined
  
  var settlement_token: js.UndefOr[String] = js.undefined
  
  var suggested_auth: js.UndefOr[String] = js.undefined
  
  var txRef: String
}
object PreauthPreauthRequest {
  
  inline def apply(
    IP: String,
    amount: String | Double,
    cardno: String | Double,
    charge_type: String,
    cvv: String | Double,
    email: String,
    expirymonth: String | Double,
    expiryyear: String | Double,
    txRef: String
  ): PreauthPreauthRequest = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], cardno = cardno.asInstanceOf[js.Any], charge_type = charge_type.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], expirymonth = expirymonth.asInstanceOf[js.Any], expiryyear = expiryyear.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreauthPreauthRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreauthPreauthRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBillingzip(value: String | Double): Self = StObject.set(x, "billingzip", value.asInstanceOf[js.Any])
    
    inline def setBillingzipUndefined: Self = StObject.set(x, "billingzip", js.undefined)
    
    inline def setBvn(value: String | Double): Self = StObject.set(x, "bvn", value.asInstanceOf[js.Any])
    
    inline def setBvnUndefined: Self = StObject.set(x, "bvn", js.undefined)
    
    inline def setCardno(value: String | Double): Self = StObject.set(x, "cardno", value.asInstanceOf[js.Any])
    
    inline def setCharge_type(value: String): Self = StObject.set(x, "charge_type", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setCvv(value: String | Double): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprint(value: String): Self = StObject.set(x, "device_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprintUndefined: Self = StObject.set(x, "device_fingerprint", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setExpirymonth(value: String | Double): Self = StObject.set(x, "expirymonth", value.asInstanceOf[js.Any])
    
    inline def setExpiryyear(value: String | Double): Self = StObject.set(x, "expiryyear", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setInclude_integrity_hash(value: String): Self = StObject.set(x, "include_integrity_hash", value.asInstanceOf[js.Any])
    
    inline def setInclude_integrity_hashUndefined: Self = StObject.set(x, "include_integrity_hash", js.undefined)
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
    
    inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setPhonenumber(value: String | Double): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setPhonenumberUndefined: Self = StObject.set(x, "phonenumber", js.undefined)
    
    inline def setPin(value: String | Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    inline def setRecurring_stop(value: String): Self = StObject.set(x, "recurring_stop", value.asInstanceOf[js.Any])
    
    inline def setRecurring_stopUndefined: Self = StObject.set(x, "recurring_stop", js.undefined)
    
    inline def setSettlement_token(value: String): Self = StObject.set(x, "settlement_token", value.asInstanceOf[js.Any])
    
    inline def setSettlement_tokenUndefined: Self = StObject.set(x, "settlement_token", js.undefined)
    
    inline def setSuggested_auth(value: String): Self = StObject.set(x, "suggested_auth", value.asInstanceOf[js.Any])
    
    inline def setSuggested_authUndefined: Self = StObject.set(x, "suggested_auth", js.undefined)
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
