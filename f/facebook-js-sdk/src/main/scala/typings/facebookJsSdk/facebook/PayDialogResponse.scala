package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.completed
import typings.facebookJsSdk.facebookJsSdkStrings.initiated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayDialogResponse
  extends StObject
     with DialogResponse {
  
  var amount: String
  
  var currency: String
  
  var payment_id: String
  
  var quantity: String
  
  var request_id: js.UndefOr[String] = js.undefined
  
  var signed_request: String
  
  var status: completed | initiated
}
object PayDialogResponse {
  
  @scala.inline
  def apply(
    amount: String,
    currency: String,
    payment_id: String,
    quantity: String,
    signed_request: String,
    status: completed | initiated
  ): PayDialogResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogResponse]
  }
  
  @scala.inline
  implicit class PayDialogResponseMutableBuilder[Self <: PayDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_id(value: String): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
    
    @scala.inline
    def setSigned_request(value: String): Self = StObject.set(x, "signed_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: completed | initiated): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
