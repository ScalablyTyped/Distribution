package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseiap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsLiteDialogParams extends DialogParams {
  
  var action: purchaseiap = js.native
  
  var developer_payload: js.UndefOr[String] = js.native
  
  var method: pay = js.native
  
  var product_id: String = js.native
  
  var quantity: js.UndefOr[Double] = js.native
}
object PaymentsLiteDialogParams {
  
  @scala.inline
  def apply(action: purchaseiap, method: pay, product_id: String): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
  
  @scala.inline
  implicit class PaymentsLiteDialogParamsMutableBuilder[Self <: PaymentsLiteDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: purchaseiap): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloper_payload(value: String): Self = StObject.set(x, "developer_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloper_payloadUndefined: Self = StObject.set(x, "developer_payload", js.undefined)
    
    @scala.inline
    def setMethod(value: pay): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
