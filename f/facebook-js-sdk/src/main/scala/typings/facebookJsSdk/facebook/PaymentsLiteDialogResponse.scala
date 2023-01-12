package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentsLiteDialogResponse
  extends StObject
     with DialogResponse {
  
  var app_id: Double
  
  var developer_payload: js.UndefOr[String] = js.undefined
  
  var payment_id: Double
  
  var product_id: String
  
  var purchase_time: Double
  
  var purchase_token: String
  
  var signed_request: String
}
object PaymentsLiteDialogResponse {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PaymentsLiteDialogResponse] (val x: Self) extends AnyVal {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_payload(value: String): Self = StObject.set(x, "developer_payload", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_payloadUndefined: Self = StObject.set(x, "developer_payload", js.undefined)
    
    inline def setPayment_id(value: Double): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setPurchase_time(value: Double): Self = StObject.set(x, "purchase_time", value.asInstanceOf[js.Any])
    
    inline def setPurchase_token(value: String): Self = StObject.set(x, "purchase_token", value.asInstanceOf[js.Any])
    
    inline def setSigned_request(value: String): Self = StObject.set(x, "signed_request", value.asInstanceOf[js.Any])
  }
}
