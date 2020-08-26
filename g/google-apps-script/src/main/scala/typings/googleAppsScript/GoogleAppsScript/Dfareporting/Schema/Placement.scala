package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var archived: js.UndefOr[Boolean] = js.native
  var campaignId: js.UndefOr[String] = js.native
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var comment: js.UndefOr[String] = js.native
  var compatibility: js.UndefOr[String] = js.native
  var contentCategoryId: js.UndefOr[String] = js.native
  var createInfo: js.UndefOr[LastModifiedInfo] = js.native
  var directorySiteId: js.UndefOr[String] = js.native
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var externalId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var keyName: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  var name: js.UndefOr[String] = js.native
  var paymentApproved: js.UndefOr[Boolean] = js.native
  var paymentSource: js.UndefOr[String] = js.native
  var placementGroupId: js.UndefOr[String] = js.native
  var placementGroupIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var placementStrategyId: js.UndefOr[String] = js.native
  var pricingSchedule: js.UndefOr[PricingSchedule] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var publisherUpdateInfo: js.UndefOr[LastModifiedInfo] = js.native
  var siteId: js.UndefOr[String] = js.native
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var size: js.UndefOr[Size] = js.native
  var sslRequired: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var tagFormats: js.UndefOr[js.Array[String]] = js.native
  var tagSetting: js.UndefOr[TagSetting] = js.native
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
  var videoSettings: js.UndefOr[VideoSettings] = js.native
  var vpaidAdapterChoice: js.UndefOr[String] = js.native
}

object Placement {
  @scala.inline
  def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
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
    def setAdBlockingOptOut(value: Boolean): Self = this.set("adBlockingOptOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdBlockingOptOut: Self = this.set("adBlockingOptOut", js.undefined)
    @scala.inline
    def setAdditionalSizesVarargs(value: Size*): Self = this.set("additionalSizes", js.Array(value :_*))
    @scala.inline
    def setAdditionalSizes(value: js.Array[Size]): Self = this.set("additionalSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalSizes: Self = this.set("additionalSizes", js.undefined)
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
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
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    @scala.inline
    def setLookbackConfiguration(value: LookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPaymentApproved(value: Boolean): Self = this.set("paymentApproved", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentApproved: Self = this.set("paymentApproved", js.undefined)
    @scala.inline
    def setPaymentSource(value: String): Self = this.set("paymentSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentSource: Self = this.set("paymentSource", js.undefined)
    @scala.inline
    def setPlacementGroupId(value: String): Self = this.set("placementGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroupId: Self = this.set("placementGroupId", js.undefined)
    @scala.inline
    def setPlacementGroupIdDimensionValue(value: DimensionValue): Self = this.set("placementGroupIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroupIdDimensionValue: Self = this.set("placementGroupIdDimensionValue", js.undefined)
    @scala.inline
    def setPlacementStrategyId(value: String): Self = this.set("placementStrategyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStrategyId: Self = this.set("placementStrategyId", js.undefined)
    @scala.inline
    def setPricingSchedule(value: PricingSchedule): Self = this.set("pricingSchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingSchedule: Self = this.set("pricingSchedule", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setPublisherUpdateInfo(value: LastModifiedInfo): Self = this.set("publisherUpdateInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherUpdateInfo: Self = this.set("publisherUpdateInfo", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    @scala.inline
    def setSiteIdDimensionValue(value: DimensionValue): Self = this.set("siteIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteIdDimensionValue: Self = this.set("siteIdDimensionValue", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTagFormatsVarargs(value: String*): Self = this.set("tagFormats", js.Array(value :_*))
    @scala.inline
    def setTagFormats(value: js.Array[String]): Self = this.set("tagFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFormats: Self = this.set("tagFormats", js.undefined)
    @scala.inline
    def setTagSetting(value: TagSetting): Self = this.set("tagSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSetting: Self = this.set("tagSetting", js.undefined)
    @scala.inline
    def setVideoActiveViewOptOut(value: Boolean): Self = this.set("videoActiveViewOptOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoActiveViewOptOut: Self = this.set("videoActiveViewOptOut", js.undefined)
    @scala.inline
    def setVideoSettings(value: VideoSettings): Self = this.set("videoSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSettings: Self = this.set("videoSettings", js.undefined)
    @scala.inline
    def setVpaidAdapterChoice(value: String): Self = this.set("vpaidAdapterChoice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpaidAdapterChoice: Self = this.set("vpaidAdapterChoice", js.undefined)
  }
  
}

