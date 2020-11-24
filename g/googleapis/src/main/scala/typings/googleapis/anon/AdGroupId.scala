package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdGroupId extends js.Object {
  
  var adGroupId: js.UndefOr[String] = js.native
  
  var adId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var agencyId: js.UndefOr[String] = js.native
  
  var campaignId: js.UndefOr[String] = js.native
  
  var engineAccountId: js.UndefOr[String] = js.native
  
  var keywordId: js.UndefOr[String] = js.native
}
object AdGroupId {
  
  @scala.inline
  def apply(): AdGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdGroupId]
  }
  
  @scala.inline
  implicit class AdGroupIdOps[Self <: AdGroupId] (val x: Self) extends AnyVal {
    
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
    def setAdGroupId(value: String): Self = this.set("adGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdGroupId: Self = this.set("adGroupId", js.undefined)
    
    @scala.inline
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdId: Self = this.set("adId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setEngineAccountId(value: String): Self = this.set("engineAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineAccountId: Self = this.set("engineAccountId", js.undefined)
    
    @scala.inline
    def setKeywordId(value: String): Self = this.set("keywordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywordId: Self = this.set("keywordId", js.undefined)
  }
}
