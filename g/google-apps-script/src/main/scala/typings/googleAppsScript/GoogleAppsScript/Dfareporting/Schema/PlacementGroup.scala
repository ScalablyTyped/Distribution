package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroup extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var archived: js.UndefOr[Boolean] = js.native
  
  var campaignId: js.UndefOr[String] = js.native
  
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var childPlacementIds: js.UndefOr[js.Array[String]] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var contentCategoryId: js.UndefOr[String] = js.native
  
  var createInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var directorySiteId: js.UndefOr[String] = js.native
  
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var externalId: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var placementGroupType: js.UndefOr[String] = js.native
  
  var placementStrategyId: js.UndefOr[String] = js.native
  
  var pricingSchedule: js.UndefOr[PricingSchedule] = js.native
  
  var primaryPlacementId: js.UndefOr[String] = js.native
  
  var primaryPlacementIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var siteId: js.UndefOr[String] = js.native
  
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
}
object PlacementGroup {
  
  @scala.inline
  def apply(): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroup]
  }
  
  @scala.inline
  implicit class PlacementGroupOps[Self <: PlacementGroup] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: DimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCampaignIdDimensionValue(value: DimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    
    @scala.inline
    def setChildPlacementIdsVarargs(value: String*): Self = this.set("childPlacementIds", js.Array(value :_*))
    
    @scala.inline
    def setChildPlacementIds(value: js.Array[String]): Self = this.set("childPlacementIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildPlacementIds: Self = this.set("childPlacementIds", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setContentCategoryId(value: String): Self = this.set("contentCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCategoryId: Self = this.set("contentCategoryId", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: LastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdDimensionValue(value: DimensionValue): Self = this.set("directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteIdDimensionValue: Self = this.set("directorySiteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
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
    def setPlacementGroupType(value: String): Self = this.set("placementGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroupType: Self = this.set("placementGroupType", js.undefined)
    
    @scala.inline
    def setPlacementStrategyId(value: String): Self = this.set("placementStrategyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategyId: Self = this.set("placementStrategyId", js.undefined)
    
    @scala.inline
    def setPricingSchedule(value: PricingSchedule): Self = this.set("pricingSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingSchedule: Self = this.set("pricingSchedule", js.undefined)
    
    @scala.inline
    def setPrimaryPlacementId(value: String): Self = this.set("primaryPlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryPlacementId: Self = this.set("primaryPlacementId", js.undefined)
    
    @scala.inline
    def setPrimaryPlacementIdDimensionValue(value: DimensionValue): Self = this.set("primaryPlacementIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryPlacementIdDimensionValue: Self = this.set("primaryPlacementIdDimensionValue", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSiteIdDimensionValue(value: DimensionValue): Self = this.set("siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteIdDimensionValue: Self = this.set("siteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
}
