package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItem extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var adSlots: js.UndefOr[js.Array[AdSlot]] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var contentCategoryId: js.UndefOr[String] = js.native
  
  var estimatedClickThroughRate: js.UndefOr[String] = js.native
  
  var estimatedConversionRate: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inPlan: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var negotiationChannelId: js.UndefOr[String] = js.native
  
  var orderId: js.UndefOr[String] = js.native
  
  var placementStrategyId: js.UndefOr[String] = js.native
  
  var pricing: js.UndefOr[Pricing] = js.native
  
  var projectId: js.UndefOr[String] = js.native
  
  var rfpId: js.UndefOr[String] = js.native
  
  var siteId: js.UndefOr[String] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object InventoryItem {
  
  @scala.inline
  def apply(): InventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit class InventoryItemOps[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdSlotsVarargs(value: AdSlot*): Self = this.set("adSlots", js.Array(value :_*))
    
    @scala.inline
    def setAdSlots(value: js.Array[AdSlot]): Self = this.set("adSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdSlots: Self = this.set("adSlots", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setContentCategoryId(value: String): Self = this.set("contentCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCategoryId: Self = this.set("contentCategoryId", js.undefined)
    
    @scala.inline
    def setEstimatedClickThroughRate(value: String): Self = this.set("estimatedClickThroughRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedClickThroughRate: Self = this.set("estimatedClickThroughRate", js.undefined)
    
    @scala.inline
    def setEstimatedConversionRate(value: String): Self = this.set("estimatedConversionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedConversionRate: Self = this.set("estimatedConversionRate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInPlan(value: Boolean): Self = this.set("inPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPlan: Self = this.set("inPlan", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNegotiationChannelId(value: String): Self = this.set("negotiationChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegotiationChannelId: Self = this.set("negotiationChannelId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPlacementStrategyId(value: String): Self = this.set("placementStrategyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategyId: Self = this.set("placementStrategyId", js.undefined)
    
    @scala.inline
    def setPricing(value: Pricing): Self = this.set("pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricing: Self = this.set("pricing", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRfpId(value: String): Self = this.set("rfpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRfpId: Self = this.set("rfpId", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
