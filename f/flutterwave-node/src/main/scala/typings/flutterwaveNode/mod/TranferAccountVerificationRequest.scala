package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranferAccountVerificationRequest extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var destbankcode: String
  
  var recipientaccount: String
}
object TranferAccountVerificationRequest {
  
  inline def apply(destbankcode: String, recipientaccount: String): TranferAccountVerificationRequest = {
    val __obj = js.Dynamic.literal(destbankcode = destbankcode.asInstanceOf[js.Any], recipientaccount = recipientaccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranferAccountVerificationRequest]
  }
  
  extension [Self <: TranferAccountVerificationRequest](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDestbankcode(value: String): Self = StObject.set(x, "destbankcode", value.asInstanceOf[js.Any])
    
    inline def setRecipientaccount(value: String): Self = StObject.set(x, "recipientaccount", value.asInstanceOf[js.Any])
  }
}
