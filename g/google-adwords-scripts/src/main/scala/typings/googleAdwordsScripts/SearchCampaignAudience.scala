package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCampaignAudience
  extends StObject
     with SearchCampaignExcludedAudience {
  
  def bidding(): SearchAudienceBidding
  
  def isEnabled(): Boolean
  
  def isPaused(): Boolean
}
object SearchCampaignAudience {
  
  inline def apply(
    bidding: () => SearchAudienceBidding,
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    isEnabled: () => Boolean,
    isPaused: () => Boolean,
    remove: () => Unit
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal(bidding = js.Any.fromFunction0(bidding), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchCampaignAudience]
  }
  
  extension [Self <: SearchCampaignAudience](x: Self) {
    
    inline def setBidding(value: () => SearchAudienceBidding): Self = StObject.set(x, "bidding", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
  }
}
