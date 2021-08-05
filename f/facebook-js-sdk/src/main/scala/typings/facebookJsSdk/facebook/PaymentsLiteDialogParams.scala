package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseiap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentsLiteDialogParams
  extends StObject
     with DialogParams {
  
  var action: purchaseiap
  
  var developer_payload: js.UndefOr[String] = js.undefined
  
  var method: pay
  
  var product_id: String
  
  var quantity: js.UndefOr[Double] = js.undefined
}
object PaymentsLiteDialogParams {
  
  inline def apply(product_id: String): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal(action = "purchaseiap", method = "pay", product_id = product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
  
  extension [Self <: PaymentsLiteDialogParams](x: Self) {
    
    inline def setAction(value: purchaseiap): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_payload(value: String): Self = StObject.set(x, "developer_payload", value.asInstanceOf[js.Any])
    
    inline def setDeveloper_payloadUndefined: Self = StObject.set(x, "developer_payload", js.undefined)
    
    inline def setMethod(value: pay): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
