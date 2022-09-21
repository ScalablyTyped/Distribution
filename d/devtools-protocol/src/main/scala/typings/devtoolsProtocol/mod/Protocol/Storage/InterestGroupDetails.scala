package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterestGroupDetails extends StObject {
  
  var adComponents: js.Array[InterestGroupAd]
  
  var ads: js.Array[InterestGroupAd]
  
  var biddingUrl: js.UndefOr[String] = js.undefined
  
  var biddingWasmHelperUrl: js.UndefOr[String] = js.undefined
  
  var expirationTime: TimeSinceEpoch
  
  var joiningOrigin: String
  
  var name: String
  
  var ownerOrigin: String
  
  var trustedBiddingSignalsKeys: js.Array[String]
  
  var trustedBiddingSignalsUrl: js.UndefOr[String] = js.undefined
  
  var updateUrl: js.UndefOr[String] = js.undefined
  
  var userBiddingSignals: js.UndefOr[String] = js.undefined
}
object InterestGroupDetails {
  
  inline def apply(
    adComponents: js.Array[InterestGroupAd],
    ads: js.Array[InterestGroupAd],
    expirationTime: TimeSinceEpoch,
    joiningOrigin: String,
    name: String,
    ownerOrigin: String,
    trustedBiddingSignalsKeys: js.Array[String]
  ): InterestGroupDetails = {
    val __obj = js.Dynamic.literal(adComponents = adComponents.asInstanceOf[js.Any], ads = ads.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], joiningOrigin = joiningOrigin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerOrigin = ownerOrigin.asInstanceOf[js.Any], trustedBiddingSignalsKeys = trustedBiddingSignalsKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterestGroupDetails]
  }
  
  extension [Self <: InterestGroupDetails](x: Self) {
    
    inline def setAdComponents(value: js.Array[InterestGroupAd]): Self = StObject.set(x, "adComponents", value.asInstanceOf[js.Any])
    
    inline def setAdComponentsVarargs(value: InterestGroupAd*): Self = StObject.set(x, "adComponents", js.Array(value*))
    
    inline def setAds(value: js.Array[InterestGroupAd]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    inline def setAdsVarargs(value: InterestGroupAd*): Self = StObject.set(x, "ads", js.Array(value*))
    
    inline def setBiddingUrl(value: String): Self = StObject.set(x, "biddingUrl", value.asInstanceOf[js.Any])
    
    inline def setBiddingUrlUndefined: Self = StObject.set(x, "biddingUrl", js.undefined)
    
    inline def setBiddingWasmHelperUrl(value: String): Self = StObject.set(x, "biddingWasmHelperUrl", value.asInstanceOf[js.Any])
    
    inline def setBiddingWasmHelperUrlUndefined: Self = StObject.set(x, "biddingWasmHelperUrl", js.undefined)
    
    inline def setExpirationTime(value: TimeSinceEpoch): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setJoiningOrigin(value: String): Self = StObject.set(x, "joiningOrigin", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
    
    inline def setTrustedBiddingSignalsKeys(value: js.Array[String]): Self = StObject.set(x, "trustedBiddingSignalsKeys", value.asInstanceOf[js.Any])
    
    inline def setTrustedBiddingSignalsKeysVarargs(value: String*): Self = StObject.set(x, "trustedBiddingSignalsKeys", js.Array(value*))
    
    inline def setTrustedBiddingSignalsUrl(value: String): Self = StObject.set(x, "trustedBiddingSignalsUrl", value.asInstanceOf[js.Any])
    
    inline def setTrustedBiddingSignalsUrlUndefined: Self = StObject.set(x, "trustedBiddingSignalsUrl", js.undefined)
    
    inline def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
    
    inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
    
    inline def setUserBiddingSignals(value: String): Self = StObject.set(x, "userBiddingSignals", value.asInstanceOf[js.Any])
    
    inline def setUserBiddingSignalsUndefined: Self = StObject.set(x, "userBiddingSignals", js.undefined)
  }
}
