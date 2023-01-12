package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountCreateRequest extends StObject {
  
  var account_bank: String
  
  var account_number: String
  
  var business_contact: js.UndefOr[String] = js.undefined
  
  var business_contact_mobile: js.UndefOr[String] = js.undefined
  
  var business_email: js.UndefOr[String] = js.undefined
  
  var business_mobile: String
  
  var business_name: String
  
  var country: String
  
  var meta: js.UndefOr[String] = js.undefined
  
  var split_type: String
  
  var split_value: String
}
object SubaccountCreateRequest {
  
  inline def apply(
    account_bank: String,
    account_number: String,
    business_mobile: String,
    business_name: String,
    country: String,
    split_type: String,
    split_value: String
  ): SubaccountCreateRequest = {
    val __obj = js.Dynamic.literal(account_bank = account_bank.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], business_mobile = business_mobile.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], split_type = split_type.asInstanceOf[js.Any], split_value = split_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setAccount_bank(value: String): Self = StObject.set(x, "account_bank", value.asInstanceOf[js.Any])
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setBusiness_contact(value: String): Self = StObject.set(x, "business_contact", value.asInstanceOf[js.Any])
    
    inline def setBusiness_contactUndefined: Self = StObject.set(x, "business_contact", js.undefined)
    
    inline def setBusiness_contact_mobile(value: String): Self = StObject.set(x, "business_contact_mobile", value.asInstanceOf[js.Any])
    
    inline def setBusiness_contact_mobileUndefined: Self = StObject.set(x, "business_contact_mobile", js.undefined)
    
    inline def setBusiness_email(value: String): Self = StObject.set(x, "business_email", value.asInstanceOf[js.Any])
    
    inline def setBusiness_emailUndefined: Self = StObject.set(x, "business_email", js.undefined)
    
    inline def setBusiness_mobile(value: String): Self = StObject.set(x, "business_mobile", value.asInstanceOf[js.Any])
    
    inline def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setSplit_type(value: String): Self = StObject.set(x, "split_type", value.asInstanceOf[js.Any])
    
    inline def setSplit_value(value: String): Self = StObject.set(x, "split_value", value.asInstanceOf[js.Any])
  }
}
