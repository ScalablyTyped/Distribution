package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersReturnRefundLineItemRequest extends js.Object {
  
  var amountPretax: js.UndefOr[Price] = js.native
  
  var amountTax: js.UndefOr[Price] = js.native
  
  var lineItemId: js.UndefOr[String] = js.native
  
  var operationId: js.UndefOr[String] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var reasonText: js.UndefOr[String] = js.native
}
object OrdersReturnRefundLineItemRequest {
  
  @scala.inline
  def apply(): OrdersReturnRefundLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersReturnRefundLineItemRequest]
  }
  
  @scala.inline
  implicit class OrdersReturnRefundLineItemRequestOps[Self <: OrdersReturnRefundLineItemRequest] (val x: Self) extends AnyVal {
    
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
    def setAmountPretax(value: Price): Self = this.set("amountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountPretax: Self = this.set("amountPretax", js.undefined)
    
    @scala.inline
    def setAmountTax(value: Price): Self = this.set("amountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountTax: Self = this.set("amountTax", js.undefined)
    
    @scala.inline
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
  }
}
