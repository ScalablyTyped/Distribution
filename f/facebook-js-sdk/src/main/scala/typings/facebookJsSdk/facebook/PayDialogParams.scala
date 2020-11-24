package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseitem
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
  implicit class PayDialogParamsOps[Self <: PayDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: purchaseitem): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: pay): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricepoint_id(value: String): Self = this.set("pricepoint_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricepoint_id: Self = this.set("pricepoint_id", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setQuantity_max(value: Double): Self = this.set("quantity_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity_max: Self = this.set("quantity_max", js.undefined)
    
    @scala.inline
    def setQuantity_min(value: Double): Self = this.set("quantity_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity_min: Self = this.set("quantity_min", js.undefined)
    
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_id: Self = this.set("request_id", js.undefined)
    
    @scala.inline
    def setTest_currency(value: String): Self = this.set("test_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest_currency: Self = this.set("test_currency", js.undefined)
  }
}
