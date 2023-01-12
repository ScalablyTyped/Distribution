package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Gender criterion in a Video Campaign. */
trait ExcludedVideoGender extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoGender". */
  def getEntityType(): String
  
  /** Returns the gender type. */
  def getGenderType(): String
  
  /** Returns the ID of the excluded video gender. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video gender belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video gender belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Enable this excluded video gender in the ad group. */
  def include(): Unit
}
object ExcludedVideoGender {
  
  inline def apply(
    getEntityType: () => String,
    getGenderType: () => String,
    getId: () => Double,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    include: () => Unit
  ): ExcludedVideoGender = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getGenderType = js.Any.fromFunction0(getGenderType), getId = js.Any.fromFunction0(getId), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), include = js.Any.fromFunction0(include))
    __obj.asInstanceOf[ExcludedVideoGender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoGender] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetGenderType(value: () => String): Self = StObject.set(x, "getGenderType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setInclude(value: () => Unit): Self = StObject.set(x, "include", js.Any.fromFunction0(value))
  }
}
