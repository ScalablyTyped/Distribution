package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdGroupId extends StObject {
  
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
  implicit class AdGroupIdMutableBuilder[Self <: AdGroupId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
    
    @scala.inline
    def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
    
    @scala.inline
    def setKeywordId(value: String): Self = StObject.set(x, "keywordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordIdUndefined: Self = StObject.set(x, "keywordId", js.undefined)
  }
}
