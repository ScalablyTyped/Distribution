package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderLineItem extends js.Object {
  
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.native
  
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var price: js.UndefOr[Price] = js.native
  
  var product: js.UndefOr[OrderLineItemProduct] = js.native
  
  var quantityCanceled: js.UndefOr[Double] = js.native
  
  var quantityDelivered: js.UndefOr[Double] = js.native
  
  var quantityOrdered: js.UndefOr[Double] = js.native
  
  var quantityPending: js.UndefOr[Double] = js.native
  
  var quantityReturned: js.UndefOr[Double] = js.native
  
  var quantityShipped: js.UndefOr[Double] = js.native
  
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.native
  
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.native
  
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.native
  
  var tax: js.UndefOr[Price] = js.native
}
object OrderLineItem {
  
  @scala.inline
  def apply(): OrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItem]
  }
  
  @scala.inline
  implicit class OrderLineItemOps[Self <: OrderLineItem] (val x: Self) extends AnyVal {
    
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
    def setAnnotationsVarargs(value: OrderMerchantProvidedAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[OrderMerchantProvidedAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setCancellationsVarargs(value: OrderCancellation*): Self = this.set("cancellations", js.Array(value :_*))
    
    @scala.inline
    def setCancellations(value: js.Array[OrderCancellation]): Self = this.set("cancellations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellations: Self = this.set("cancellations", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setProduct(value: OrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setQuantityCanceled(value: Double): Self = this.set("quantityCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityCanceled: Self = this.set("quantityCanceled", js.undefined)
    
    @scala.inline
    def setQuantityDelivered(value: Double): Self = this.set("quantityDelivered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityDelivered: Self = this.set("quantityDelivered", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = this.set("quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityOrdered: Self = this.set("quantityOrdered", js.undefined)
    
    @scala.inline
    def setQuantityPending(value: Double): Self = this.set("quantityPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityPending: Self = this.set("quantityPending", js.undefined)
    
    @scala.inline
    def setQuantityReturned(value: Double): Self = this.set("quantityReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityReturned: Self = this.set("quantityReturned", js.undefined)
    
    @scala.inline
    def setQuantityShipped(value: Double): Self = this.set("quantityShipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityShipped: Self = this.set("quantityShipped", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: OrderLineItemReturnInfo): Self = this.set("returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnInfo: Self = this.set("returnInfo", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: OrderReturn*): Self = this.set("returns", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: js.Array[OrderReturn]): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: OrderLineItemShippingDetails): Self = this.set("shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingDetails: Self = this.set("shippingDetails", js.undefined)
    
    @scala.inline
    def setTax(value: Price): Self = this.set("tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
}
