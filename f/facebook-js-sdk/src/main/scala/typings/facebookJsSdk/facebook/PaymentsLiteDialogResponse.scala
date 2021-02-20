package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsLiteDialogResponse extends DialogResponse {
  
  var app_id: Double = js.native
  
  var developer_payload: js.UndefOr[String] = js.native
  
  var payment_id: Double = js.native
  
  var product_id: String = js.native
  
  var purchase_time: Double = js.native
  
  var purchase_token: String = js.native
  
  var signed_request: String = js.native
}
object PaymentsLiteDialogResponse {
  
  @scala.inline
  def apply(
    app_id: Double,
    payment_id: Double,
    product_id: String,
    purchase_time: Double,
    purchase_token: String,
    signed_request: String
  ): PaymentsLiteDialogResponse = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], purchase_time = purchase_time.asInstanceOf[js.Any], purchase_token = purchase_token.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogResponse]
  }
  
  @scala.inline
  implicit class PaymentsLiteDialogResponseMutableBuilder[Self <: PaymentsLiteDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloper_payload(value: String): Self = StObject.set(x, "developer_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloper_payloadUndefined: Self = StObject.set(x, "developer_payload", js.undefined)
    
    @scala.inline
    def setPayment_id(value: Double): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchase_time(value: Double): Self = StObject.set(x, "purchase_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchase_token(value: String): Self = StObject.set(x, "purchase_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigned_request(value: String): Self = StObject.set(x, "signed_request", value.asInstanceOf[js.Any])
  }
}
