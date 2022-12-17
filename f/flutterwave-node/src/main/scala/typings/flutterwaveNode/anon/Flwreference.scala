package typings.flutterwaveNode.anon

import typings.flutterwaveNode.flutterwaveNodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flwreference extends StObject {
  
  var amount: String
  
  var flw_reference: String
  
  var note: Any
  
  var payment_code: Any
  
  var redirect: `true`
  
  var redirect_url: String
  
  var transaction_date: String
  
  var transaction_reference: String
  
  var `type`: String
  
  var type_data: String
}
object Flwreference {
  
  inline def apply(
    amount: String,
    flw_reference: String,
    note: Any,
    payment_code: Any,
    redirect_url: String,
    transaction_date: String,
    transaction_reference: String,
    `type`: String,
    type_data: String
  ): Flwreference = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], flw_reference = flw_reference.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], payment_code = payment_code.asInstanceOf[js.Any], redirect = true, redirect_url = redirect_url.asInstanceOf[js.Any], transaction_date = transaction_date.asInstanceOf[js.Any], transaction_reference = transaction_reference.asInstanceOf[js.Any], type_data = type_data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flwreference]
  }
  
  extension [Self <: Flwreference](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setFlw_reference(value: String): Self = StObject.set(x, "flw_reference", value.asInstanceOf[js.Any])
    
    inline def setNote(value: Any): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setPayment_code(value: Any): Self = StObject.set(x, "payment_code", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: `true`): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirect_url(value: String): Self = StObject.set(x, "redirect_url", value.asInstanceOf[js.Any])
    
    inline def setTransaction_date(value: String): Self = StObject.set(x, "transaction_date", value.asInstanceOf[js.Any])
    
    inline def setTransaction_reference(value: String): Self = StObject.set(x, "transaction_reference", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setType_data(value: String): Self = StObject.set(x, "type_data", value.asInstanceOf[js.Any])
  }
}
