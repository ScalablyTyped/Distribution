package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ad extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var active: js.UndefOr[Boolean] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var archived: js.UndefOr[Boolean] = js.native
  
  var audienceSegmentId: js.UndefOr[String] = js.native
  
  var campaignId: js.UndefOr[String] = js.native
  
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.native
  
  var comments: js.UndefOr[String] = js.native
  
  var compatibility: js.UndefOr[String] = js.native
  
  var createInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.native
  
  var creativeRotation: js.UndefOr[CreativeRotation] = js.native
  
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.native
  
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.native
  
  var deliverySchedule: js.UndefOr[DeliverySchedule] = js.native
  
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  
  var endTime: js.UndefOr[String] = js.native
  
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.native
  
  var geoTargeting: js.UndefOr[GeoTargeting] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.native
  
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var placementAssignments: js.UndefOr[js.Array[PlacementAssignment]] = js.native
  
  var remarketingListExpression: js.UndefOr[ListTargetingExpression] = js.native
  
  var size: js.UndefOr[Size] = js.native
  
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  var sslRequired: js.UndefOr[Boolean] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var targetingTemplateId: js.UndefOr[String] = js.native
  
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Ad {
  
  @scala.inline
  def apply(): Ad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ad]
  }
  
  @scala.inline
  implicit class AdOps[Self <: Ad] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
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
    def setAudienceSegmentId(value: String): Self = this.set("audienceSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceSegmentId: Self = this.set("audienceSegmentId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCampaignIdDimensionValue(value: DimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    
    @scala.inline
    def setClickThroughUrl(value: ClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffixProperties(value: ClickThroughUrlSuffixProperties): Self = this.set("clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrlSuffixProperties: Self = this.set("clickThroughUrlSuffixProperties", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: LastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    
    @scala.inline
    def setCreativeGroupAssignmentsVarargs(value: CreativeGroupAssignment*): Self = this.set("creativeGroupAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroupAssignments(value: js.Array[CreativeGroupAssignment]): Self = this.set("creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupAssignments: Self = this.set("creativeGroupAssignments", js.undefined)
    
    @scala.inline
    def setCreativeRotation(value: CreativeRotation): Self = this.set("creativeRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeRotation: Self = this.set("creativeRotation", js.undefined)
    
    @scala.inline
    def setDayPartTargeting(value: DayPartTargeting): Self = this.set("dayPartTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPartTargeting: Self = this.set("dayPartTargeting", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagProperties(value: DefaultClickThroughEventTagProperties): Self = this.set("defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClickThroughEventTagProperties: Self = this.set("defaultClickThroughEventTagProperties", js.undefined)
    
    @scala.inline
    def setDeliverySchedule(value: DeliverySchedule): Self = this.set("deliverySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliverySchedule: Self = this.set("deliverySchedule", js.undefined)
    
    @scala.inline
    def setDynamicClickTracker(value: Boolean): Self = this.set("dynamicClickTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicClickTracker: Self = this.set("dynamicClickTracker", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEventTagOverridesVarargs(value: EventTagOverride*): Self = this.set("eventTagOverrides", js.Array(value :_*))
    
    @scala.inline
    def setEventTagOverrides(value: js.Array[EventTagOverride]): Self = this.set("eventTagOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTagOverrides: Self = this.set("eventTagOverrides", js.undefined)
    
    @scala.inline
    def setGeoTargeting(value: GeoTargeting): Self = this.set("geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoTargeting: Self = this.set("geoTargeting", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKeyValueTargetingExpression(value: KeyValueTargetingExpression): Self = this.set("keyValueTargetingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValueTargetingExpression: Self = this.set("keyValueTargetingExpression", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguageTargeting(value: LanguageTargeting): Self = this.set("languageTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageTargeting: Self = this.set("languageTargeting", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlacementAssignmentsVarargs(value: PlacementAssignment*): Self = this.set("placementAssignments", js.Array(value :_*))
    
    @scala.inline
    def setPlacementAssignments(value: js.Array[PlacementAssignment]): Self = this.set("placementAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementAssignments: Self = this.set("placementAssignments", js.undefined)
    
    @scala.inline
    def setRemarketingListExpression(value: ListTargetingExpression): Self = this.set("remarketingListExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingListExpression: Self = this.set("remarketingListExpression", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTargetingTemplateId(value: String): Self = this.set("targetingTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingTemplateId: Self = this.set("targetingTemplateId", js.undefined)
    
    @scala.inline
    def setTechnologyTargeting(value: TechnologyTargeting): Self = this.set("technologyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechnologyTargeting: Self = this.set("technologyTargeting", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
