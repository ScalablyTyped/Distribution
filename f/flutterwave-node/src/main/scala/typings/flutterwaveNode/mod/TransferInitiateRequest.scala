package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferInitiateRequest extends StObject {
  
  var account_bank: js.UndefOr[String] = js.undefined
  
  var account_number: js.UndefOr[String] = js.undefined
  
  var amount: String
  
  var beneficiary_name: String
  
  var callback_url: js.UndefOr[String] = js.undefined
  
  var currency: String
  
  var debit_currency: js.UndefOr[String] = js.undefined
  
  var destination_branch_code: String
  
  var narration: js.UndefOr[String] = js.undefined
  
  var recipient: js.UndefOr[String] = js.undefined
  
  var reference: js.UndefOr[String] = js.undefined
}
object TransferInitiateRequest {
  
  inline def apply(amount: String, beneficiary_name: String, currency: String, destination_branch_code: String): TransferInitiateRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiary_name = beneficiary_name.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], destination_branch_code = destination_branch_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInitiateRequest]
  }
  
  extension [Self <: TransferInitiateRequest](x: Self) {
    
    inline def setAccount_bank(value: String): Self = StObject.set(x, "account_bank", value.asInstanceOf[js.Any])
    
    inline def setAccount_bankUndefined: Self = StObject.set(x, "account_bank", js.undefined)
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAccount_numberUndefined: Self = StObject.set(x, "account_number", js.undefined)
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBeneficiary_name(value: String): Self = StObject.set(x, "beneficiary_name", value.asInstanceOf[js.Any])
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setCallback_urlUndefined: Self = StObject.set(x, "callback_url", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDebit_currency(value: String): Self = StObject.set(x, "debit_currency", value.asInstanceOf[js.Any])
    
    inline def setDebit_currencyUndefined: Self = StObject.set(x, "debit_currency", js.undefined)
    
    inline def setDestination_branch_code(value: String): Self = StObject.set(x, "destination_branch_code", value.asInstanceOf[js.Any])
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
