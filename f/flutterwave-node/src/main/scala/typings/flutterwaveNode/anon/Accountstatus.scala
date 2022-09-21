package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accountstatus extends StObject {
  
  var accountnumber: String
  
  var accountstatus: String
  
  var amount: Any
  
  var bankname: String
  
  var created_on: String
  
  var expiry_date: String
  
  var flw_reference: String
  
  var frequency: String
  
  var note: String
  
  var response_code: String
  
  var response_message: String
}
object Accountstatus {
  
  inline def apply(
    accountnumber: String,
    accountstatus: String,
    amount: Any,
    bankname: String,
    created_on: String,
    expiry_date: String,
    flw_reference: String,
    frequency: String,
    note: String,
    response_code: String,
    response_message: String
  ): Accountstatus = {
    val __obj = js.Dynamic.literal(accountnumber = accountnumber.asInstanceOf[js.Any], accountstatus = accountstatus.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], bankname = bankname.asInstanceOf[js.Any], created_on = created_on.asInstanceOf[js.Any], expiry_date = expiry_date.asInstanceOf[js.Any], flw_reference = flw_reference.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], response_message = response_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountstatus]
  }
  
  extension [Self <: Accountstatus](x: Self) {
    
    inline def setAccountnumber(value: String): Self = StObject.set(x, "accountnumber", value.asInstanceOf[js.Any])
    
    inline def setAccountstatus(value: String): Self = StObject.set(x, "accountstatus", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: Any): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBankname(value: String): Self = StObject.set(x, "bankname", value.asInstanceOf[js.Any])
    
    inline def setCreated_on(value: String): Self = StObject.set(x, "created_on", value.asInstanceOf[js.Any])
    
    inline def setExpiry_date(value: String): Self = StObject.set(x, "expiry_date", value.asInstanceOf[js.Any])
    
    inline def setFlw_reference(value: String): Self = StObject.set(x, "flw_reference", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setResponse_code(value: String): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    inline def setResponse_message(value: String): Self = StObject.set(x, "response_message", value.asInstanceOf[js.Any])
  }
}
