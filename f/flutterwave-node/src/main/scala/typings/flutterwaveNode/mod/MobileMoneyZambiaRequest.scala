package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyZambiaRequest extends StObject {
  
  var IP: js.UndefOr[String] = js.undefined
  
  var amount: String
  
  var country: String
  
  var currency: String
  
  var device_fingerprint: String
  
  var email: String
  
  var firstname: js.UndefOr[String] = js.undefined
  
  var is_mobile_money_ug: String
  
  var lastname: js.UndefOr[String] = js.undefined
  
  var network: String
  
  var orderRef: String
  
  var payment_type: String
  
  var phonenumber: String
  
  var subaccounts: js.UndefOr[String] = js.undefined
  
  var txRef: String
  
  var voucher: String
}
object MobileMoneyZambiaRequest {
  
  inline def apply(
    amount: String,
    country: String,
    currency: String,
    device_fingerprint: String,
    email: String,
    is_mobile_money_ug: String,
    network: String,
    orderRef: String,
    payment_type: String,
    phonenumber: String,
    txRef: String,
    voucher: String
  ): MobileMoneyZambiaRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], device_fingerprint = device_fingerprint.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], is_mobile_money_ug = is_mobile_money_ug.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], orderRef = orderRef.asInstanceOf[js.Any], payment_type = payment_type.asInstanceOf[js.Any], phonenumber = phonenumber.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any], voucher = voucher.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyZambiaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileMoneyZambiaRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprint(value: String): Self = StObject.set(x, "device_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
    
    inline def setIs_mobile_money_ug(value: String): Self = StObject.set(x, "is_mobile_money_ug", value.asInstanceOf[js.Any])
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
    
    inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setOrderRef(value: String): Self = StObject.set(x, "orderRef", value.asInstanceOf[js.Any])
    
    inline def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPhonenumber(value: String): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setSubaccounts(value: String): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
    
    inline def setVoucher(value: String): Self = StObject.set(x, "voucher", value.asInstanceOf[js.Any])
  }
}
