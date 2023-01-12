package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscDisburseRequest extends StObject {
  
  var account_number: String
  
  var amount: String
  
  var bank_code: String
  
  var currency: String
}
object MiscDisburseRequest {
  
  inline def apply(account_number: String, amount: String, bank_code: String, currency: String): MiscDisburseRequest = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], bank_code = bank_code.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiscDisburseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiscDisburseRequest] (val x: Self) extends AnyVal {
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
  }
}
