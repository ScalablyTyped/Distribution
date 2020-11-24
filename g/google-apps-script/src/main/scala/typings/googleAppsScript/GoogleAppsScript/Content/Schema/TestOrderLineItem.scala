package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrderLineItem extends js.Object {
  
  var product: js.UndefOr[TestOrderLineItemProduct] = js.native
  
  var quantityOrdered: js.UndefOr[Double] = js.native
  
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.native
  
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.native
  
  var unitTax: js.UndefOr[Price] = js.native
}
object TestOrderLineItem {
  
  @scala.inline
  def apply(): TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderLineItem]
  }
  
  @scala.inline
  implicit class TestOrderLineItemOps[Self <: TestOrderLineItem] (val x: Self) extends AnyVal {
    
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
    def setProduct(value: TestOrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = this.set("quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityOrdered: Self = this.set("quantityOrdered", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: OrderLineItemReturnInfo): Self = this.set("returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnInfo: Self = this.set("returnInfo", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: OrderLineItemShippingDetails): Self = this.set("shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingDetails: Self = this.set("shippingDetails", js.undefined)
    
    @scala.inline
    def setUnitTax(value: Price): Self = this.set("unitTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitTax: Self = this.set("unitTax", js.undefined)
  }
}
