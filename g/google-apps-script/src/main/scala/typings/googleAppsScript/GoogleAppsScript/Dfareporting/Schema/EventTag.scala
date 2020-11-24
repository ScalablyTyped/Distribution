package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTag extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var campaignId: js.UndefOr[String] = js.native
  
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var enabledByDefault: js.UndefOr[Boolean] = js.native
  
  var excludeFromAdxRequests: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var siteFilterType: js.UndefOr[String] = js.native
  
  var siteIds: js.UndefOr[js.Array[String]] = js.native
  
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urlEscapeLevels: js.UndefOr[Double] = js.native
}
object EventTag {
  
  @scala.inline
  def apply(): EventTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTag]
  }
  
  @scala.inline
  implicit class EventTagOps[Self <: EventTag] (val x: Self) extends AnyVal {
    
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
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCampaignIdDimensionValue(value: DimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    
    @scala.inline
    def setEnabledByDefault(value: Boolean): Self = this.set("enabledByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledByDefault: Self = this.set("enabledByDefault", js.undefined)
    
    @scala.inline
    def setExcludeFromAdxRequests(value: Boolean): Self = this.set("excludeFromAdxRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFromAdxRequests: Self = this.set("excludeFromAdxRequests", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSiteFilterType(value: String): Self = this.set("siteFilterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteFilterType: Self = this.set("siteFilterType", js.undefined)
    
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = this.set("siteIds", js.Array(value :_*))
    
    @scala.inline
    def setSiteIds(value: js.Array[String]): Self = this.set("siteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteIds: Self = this.set("siteIds", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlEscapeLevels(value: Double): Self = this.set("urlEscapeLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlEscapeLevels: Self = this.set("urlEscapeLevels", js.undefined)
  }
}
