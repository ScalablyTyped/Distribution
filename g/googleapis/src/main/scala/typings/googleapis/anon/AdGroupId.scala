package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupId extends StObject {
  
  var adGroupId: js.UndefOr[String] = js.undefined
  
  var adId: js.UndefOr[String] = js.undefined
  
  var advertiserId: js.UndefOr[String] = js.undefined
  
  var agencyId: js.UndefOr[String] = js.undefined
  
  var campaignId: js.UndefOr[String] = js.undefined
  
  var engineAccountId: js.UndefOr[String] = js.undefined
  
  var keywordId: js.UndefOr[String] = js.undefined
}
object AdGroupId {
  
  inline def apply(): AdGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdGroupId]
  }
  
  extension [Self <: AdGroupId](x: Self) {
    
    inline def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
    
    inline def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
    
    inline def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
    
    inline def setKeywordId(value: String): Self = StObject.set(x, "keywordId", value.asInstanceOf[js.Any])
    
    inline def setKeywordIdUndefined: Self = StObject.set(x, "keywordId", js.undefined)
  }
}
