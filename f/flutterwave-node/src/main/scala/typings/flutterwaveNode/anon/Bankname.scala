package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bankname extends StObject {
  
  var account_number: String
  
  var amount: Double
  
  var bank_code: String
  
  var bank_name: String
  
  var complete_message: String
  
  var currency: String
  
  var date_created: String
  
  var fee: Double
  
  var fullname: String
  
  var id: Double
  
  var is_approved: Double
  
  var narration: String
  
  var reference: String
  
  var requires_approval: Double
  
  var status: String
}
object Bankname {
  
  inline def apply(
    account_number: String,
    amount: Double,
    bank_code: String,
    bank_name: String,
    complete_message: String,
    currency: String,
    date_created: String,
    fee: Double,
    fullname: String,
    id: Double,
    is_approved: Double,
    narration: String,
    reference: String,
    requires_approval: Double,
    status: String
  ): Bankname = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], complete_message = complete_message.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_approved = is_approved.asInstanceOf[js.Any], narration = narration.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], requires_approval = requires_approval.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
  
  extension [Self <: Bankname](x: Self) {
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setComplete_message(value: String): Self = StObject.set(x, "complete_message", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_approved(value: Double): Self = StObject.set(x, "is_approved", value.asInstanceOf[js.Any])
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRequires_approval(value: Double): Self = StObject.set(x, "requires_approval", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
