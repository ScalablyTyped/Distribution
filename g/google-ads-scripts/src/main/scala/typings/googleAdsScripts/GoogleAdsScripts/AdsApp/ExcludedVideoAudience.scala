package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Audience in a Video Campaign. */
trait ExcludedVideoAudience extends StObject {
  
  /** Returns the ID of the excluded audience. */
  def getAudienceId(): Double
  
  /** Returns the type of the excluded audience. */
  def getAudienceType(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoAudience". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video audience. */
  def getId(): Double
  
  /** Returns the name of the excluded audience. */
  def getName(): String
  
  /** Returns the ad group to which this excluded video audience belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video audience belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video audience. */
  def remove(): Unit
}
object ExcludedVideoAudience {
  
  inline def apply(
    getAudienceId: () => Double,
    getAudienceType: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoAudience = {
    val __obj = js.Dynamic.literal(getAudienceId = js.Any.fromFunction0(getAudienceId), getAudienceType = js.Any.fromFunction0(getAudienceType), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoAudience]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoAudience] (val x: Self) extends AnyVal {
    
    inline def setGetAudienceId(value: () => Double): Self = StObject.set(x, "getAudienceId", js.Any.fromFunction0(value))
    
    inline def setGetAudienceType(value: () => String): Self = StObject.set(x, "getAudienceType", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
