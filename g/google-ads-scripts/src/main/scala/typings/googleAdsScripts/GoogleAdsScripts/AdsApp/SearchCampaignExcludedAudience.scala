package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded audience configured for search campaigns. */
trait SearchCampaignExcludedAudience extends StObject {
  
  /** Returns the audience ID of the excluded audience. */
  def getAudienceId(): Double
  
  /** Returns the base campaign to which this excluded audience belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded audience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the excluded audience. */
  def getId(): Double
  
  /** Returns the name of the audience. */
  def getName(): String
  
  /** Removes the excluded audience. */
  def remove(): Unit
}
object SearchCampaignExcludedAudience {
  
  inline def apply(
    getAudienceId: () => Double,
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    remove: () => Unit
  ): SearchCampaignExcludedAudience = {
    val __obj = js.Dynamic.literal(getAudienceId = js.Any.fromFunction0(getAudienceId), getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchCampaignExcludedAudience]
  }
  
  extension [Self <: SearchCampaignExcludedAudience](x: Self) {
    
    inline def setGetAudienceId(value: () => Double): Self = StObject.set(x, "getAudienceId", js.Any.fromFunction0(value))
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
