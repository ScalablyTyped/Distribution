package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaign extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var adBlockingConfiguration: js.UndefOr[AdBlockingConfiguration] = js.native
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[CreativeOptimizationConfiguration]] = js.native
  var advertiserGroupId: js.UndefOr[String] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var archived: js.UndefOr[Boolean] = js.native
  var audienceSegmentGroups: js.UndefOr[js.Array[AudienceSegmentGroup]] = js.native
  var billingInvoiceCode: js.UndefOr[String] = js.native
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.native
  var comment: js.UndefOr[String] = js.native
  var createInfo: js.UndefOr[LastModifiedInfo] = js.native
  var creativeGroupIds: js.UndefOr[js.Array[String]] = js.native
  var creativeOptimizationConfiguration: js.UndefOr[CreativeOptimizationConfiguration] = js.native
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.native
  var defaultLandingPageId: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.native
  var externalId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var name: js.UndefOr[String] = js.native
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  var startDate: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var traffickerEmails: js.UndefOr[js.Array[String]] = js.native
}

object Campaign {
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  @scala.inline
  implicit class CampaignOps[Self <: Campaign] (val x: Self) extends AnyVal {
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
    def setAdBlockingConfiguration(value: AdBlockingConfiguration): Self = this.set("adBlockingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdBlockingConfiguration: Self = this.set("adBlockingConfiguration", js.undefined)
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurationsVarargs(value: CreativeOptimizationConfiguration*): Self = this.set("additionalCreativeOptimizationConfigurations", js.Array(value :_*))
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurations(value: js.Array[CreativeOptimizationConfiguration]): Self = this.set("additionalCreativeOptimizationConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalCreativeOptimizationConfigurations: Self = this.set("additionalCreativeOptimizationConfigurations", js.undefined)
    @scala.inline
    def setAdvertiserGroupId(value: String): Self = this.set("advertiserGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserGroupId: Self = this.set("advertiserGroupId", js.undefined)
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
    def setAudienceSegmentGroupsVarargs(value: AudienceSegmentGroup*): Self = this.set("audienceSegmentGroups", js.Array(value :_*))
    @scala.inline
    def setAudienceSegmentGroups(value: js.Array[AudienceSegmentGroup]): Self = this.set("audienceSegmentGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceSegmentGroups: Self = this.set("audienceSegmentGroups", js.undefined)
    @scala.inline
    def setBillingInvoiceCode(value: String): Self = this.set("billingInvoiceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingInvoiceCode: Self = this.set("billingInvoiceCode", js.undefined)
    @scala.inline
    def setClickThroughUrlSuffixProperties(value: ClickThroughUrlSuffixProperties): Self = this.set("clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThroughUrlSuffixProperties: Self = this.set("clickThroughUrlSuffixProperties", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCreateInfo(value: LastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    @scala.inline
    def setCreativeGroupIdsVarargs(value: String*): Self = this.set("creativeGroupIds", js.Array(value :_*))
    @scala.inline
    def setCreativeGroupIds(value: js.Array[String]): Self = this.set("creativeGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeGroupIds: Self = this.set("creativeGroupIds", js.undefined)
    @scala.inline
    def setCreativeOptimizationConfiguration(value: CreativeOptimizationConfiguration): Self = this.set("creativeOptimizationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeOptimizationConfiguration: Self = this.set("creativeOptimizationConfiguration", js.undefined)
    @scala.inline
    def setDefaultClickThroughEventTagProperties(value: DefaultClickThroughEventTagProperties): Self = this.set("defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultClickThroughEventTagProperties: Self = this.set("defaultClickThroughEventTagProperties", js.undefined)
    @scala.inline
    def setDefaultLandingPageId(value: String): Self = this.set("defaultLandingPageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLandingPageId: Self = this.set("defaultLandingPageId", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setEventTagOverridesVarargs(value: EventTagOverride*): Self = this.set("eventTagOverrides", js.Array(value :_*))
    @scala.inline
    def setEventTagOverrides(value: js.Array[EventTagOverride]): Self = this.set("eventTagOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTagOverrides: Self = this.set("eventTagOverrides", js.undefined)
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
    def setNielsenOcrEnabled(value: Boolean): Self = this.set("nielsenOcrEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNielsenOcrEnabled: Self = this.set("nielsenOcrEnabled", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTraffickerEmailsVarargs(value: String*): Self = this.set("traffickerEmails", js.Array(value :_*))
    @scala.inline
    def setTraffickerEmails(value: js.Array[String]): Self = this.set("traffickerEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraffickerEmails: Self = this.set("traffickerEmails", js.undefined)
  }
  
}

