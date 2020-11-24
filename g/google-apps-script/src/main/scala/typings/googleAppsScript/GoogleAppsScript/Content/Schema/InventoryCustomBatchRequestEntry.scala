package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryCustomBatchRequestEntry extends js.Object {
  
  var batchId: js.UndefOr[Double] = js.native
  
  var inventory: js.UndefOr[Inventory] = js.native
  
  var merchantId: js.UndefOr[String] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  var storeCode: js.UndefOr[String] = js.native
}
object InventoryCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): InventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class InventoryCustomBatchRequestEntryOps[Self <: InventoryCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setInventory(value: Inventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
  }
}
