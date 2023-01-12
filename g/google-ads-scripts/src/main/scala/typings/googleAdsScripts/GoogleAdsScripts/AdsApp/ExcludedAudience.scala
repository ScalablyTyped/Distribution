package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excludedAudience. */
trait ExcludedAudience extends StObject {
  
  /** Returns the ad group to which this excludedAudience belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the excludedAudience ID of the excludedAudience. */
  def getAudienceId(): Double
  
  /** Returns the type of the excludedAudience, either USER_INTEREST or USER_LIST. */
  def getAudienceType(): AudienceTypeType
  
  /** Returns the base ad group to which this excludedAudience belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this excludedAudience belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excludedAudience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the excludedAudience. */
  def getId(): Double
  
  /** Removes the excludedAudience. */
  def remove(): Unit
}
object ExcludedAudience {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getAudienceId: () => Double,
    getAudienceType: () => AudienceTypeType,
    getBaseAdGroup: () => AdGroup,
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getId: () => Double,
    remove: () => Unit
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getAudienceType = js.Any.fromFunction0(getAudienceType), getBaseAdGroup = js.Any.fromFunction0(getBaseAdGroup), getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedAudience]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedAudience] (val x: Self) extends AnyVal {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetAudienceId(value: () => Double): Self = StObject.set(x, "getAudienceId", js.Any.fromFunction0(value))
    
    inline def setGetAudienceType(value: () => AudienceTypeType): Self = StObject.set(x, "getAudienceType", js.Any.fromFunction0(value))
    
    inline def setGetBaseAdGroup(value: () => AdGroup): Self = StObject.set(x, "getBaseAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
