package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantOrderReturnItem extends js.Object {
  
  var customerReturnReason: js.UndefOr[CustomerReturnReason] = js.native
  
  var itemId: js.UndefOr[String] = js.native
  
  var merchantReturnReason: js.UndefOr[RefundReason] = js.native
  
  var product: js.UndefOr[OrderLineItemProduct] = js.native
  
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object MerchantOrderReturnItem {
  
  @scala.inline
  def apply(): MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantOrderReturnItem]
  }
  
  @scala.inline
  implicit class MerchantOrderReturnItemOps[Self <: MerchantOrderReturnItem] (val x: Self) extends AnyVal {
    
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
    def setCustomerReturnReason(value: CustomerReturnReason): Self = this.set("customerReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerReturnReason: Self = this.set("customerReturnReason", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setMerchantReturnReason(value: RefundReason): Self = this.set("merchantReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantReturnReason: Self = this.set("merchantReturnReason", js.undefined)
    
    @scala.inline
    def setProduct(value: OrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setReturnShipmentIdsVarargs(value: String*): Self = this.set("returnShipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setReturnShipmentIds(value: js.Array[String]): Self = this.set("returnShipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnShipmentIds: Self = this.set("returnShipmentIds", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
