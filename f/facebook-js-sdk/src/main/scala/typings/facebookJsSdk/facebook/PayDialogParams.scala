package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayDialogParams extends DialogParams {
  
  var action: purchaseitem = js.native
  
  var method: pay = js.native
  
  var pricepoint_id: js.UndefOr[String] = js.native
  
  var product: String = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var quantity_max: js.UndefOr[Double] = js.native
  
  var quantity_min: js.UndefOr[Double] = js.native
  
  var request_id: js.UndefOr[String] = js.native
  
  var test_currency: js.UndefOr[String] = js.native
}
object PayDialogParams {
  
  @scala.inline
  def apply(action: purchaseitem, method: pay, product: String): PayDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogParams]
  }
  
  @scala.inline
  implicit class PayDialogParamsMutableBuilder[Self <: PayDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: purchaseitem): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: pay): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricepoint_id(value: String): Self = StObject.set(x, "pricepoint_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricepoint_idUndefined: Self = StObject.set(x, "pricepoint_id", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setQuantity_max(value: Double): Self = StObject.set(x, "quantity_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity_maxUndefined: Self = StObject.set(x, "quantity_max", js.undefined)
    
    @scala.inline
    def setQuantity_min(value: Double): Self = StObject.set(x, "quantity_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity_minUndefined: Self = StObject.set(x, "quantity_min", js.undefined)
    
    @scala.inline
    def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
    
    @scala.inline
    def setTest_currency(value: String): Self = StObject.set(x, "test_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest_currencyUndefined: Self = StObject.set(x, "test_currency", js.undefined)
  }
}
