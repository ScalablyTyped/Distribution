package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bankname extends StObject {
  
  var account_bank: String
  
  var account_number: String
  
  var bank_name: String
  
  var business_name: String
  
  var date_created: String
  
  var fullname: String
  
  var id: Double
  
  var meta: Any
  
  var split_ratio: Double
  
  var split_type: String
  
  var split_value: Double
  
  var subaccount_id: String
}
object Bankname {
  
  inline def apply(
    account_bank: String,
    account_number: String,
    bank_name: String,
    business_name: String,
    date_created: String,
    fullname: String,
    id: Double,
    meta: Any,
    split_ratio: Double,
    split_type: String,
    split_value: Double,
    subaccount_id: String
  ): Bankname = {
    val __obj = js.Dynamic.literal(account_bank = account_bank.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], split_ratio = split_ratio.asInstanceOf[js.Any], split_type = split_type.asInstanceOf[js.Any], split_value = split_value.asInstanceOf[js.Any], subaccount_id = subaccount_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bankname] (val x: Self) extends AnyVal {
    
    inline def setAccount_bank(value: String): Self = StObject.set(x, "account_bank", value.asInstanceOf[js.Any])
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setSplit_ratio(value: Double): Self = StObject.set(x, "split_ratio", value.asInstanceOf[js.Any])
    
    inline def setSplit_type(value: String): Self = StObject.set(x, "split_type", value.asInstanceOf[js.Any])
    
    inline def setSplit_value(value: Double): Self = StObject.set(x, "split_value", value.asInstanceOf[js.Any])
    
    inline def setSubaccount_id(value: String): Self = StObject.set(x, "subaccount_id", value.asInstanceOf[js.Any])
  }
}
