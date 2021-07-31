package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCampaignExcludedAudience
  extends StObject
     with isCampaignChild {
  
  def getAudienceId(): Double
  
  def getId(): Double
  
  def getName(): String
  
  def remove(): Unit
}
object SearchCampaignExcludedAudience {
  
  @scala.inline
  def apply(
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    remove: () => Unit
  ): SearchCampaignExcludedAudience = {
    val __obj = js.Dynamic.literal(getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchCampaignExcludedAudience]
  }
  
  @scala.inline
  implicit class SearchCampaignExcludedAudienceMutableBuilder[Self <: SearchCampaignExcludedAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAudienceId(value: () => Double): Self = StObject.set(x, "getAudienceId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
