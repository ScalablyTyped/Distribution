package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbillsCreateRequest extends StObject {
  
  var IP: String
  
  var amount: String
  
  var country: String
  
  var currency: String
  
  var custom_business_name: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var narration: js.UndefOr[String] = js.undefined
  
  var numberofunits: String
  
  var phonenumber: String
  
  var txRef: String
}
object EbillsCreateRequest {
  
  inline def apply(
    IP: String,
    amount: String,
    country: String,
    currency: String,
    email: String,
    numberofunits: String,
    phonenumber: String,
    txRef: String
  ): EbillsCreateRequest = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], numberofunits = numberofunits.asInstanceOf[js.Any], phonenumber = phonenumber.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbillsCreateRequest]
  }
  
  extension [Self <: EbillsCreateRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustom_business_name(value: String): Self = StObject.set(x, "custom_business_name", value.asInstanceOf[js.Any])
    
    inline def setCustom_business_nameUndefined: Self = StObject.set(x, "custom_business_name", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setNumberofunits(value: String): Self = StObject.set(x, "numberofunits", value.asInstanceOf[js.Any])
    
    inline def setPhonenumber(value: String): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
