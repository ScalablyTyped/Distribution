package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Age criterion in a Video Campaign. */
trait ExcludedVideoAge extends StObject {
  
  /** Returns the age range. */
  def getAgeRange(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoAge". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video age. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video age belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video age belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Enable this excluded video age in the ad group. */
  def include(): Unit
}
object ExcludedVideoAge {
  
  inline def apply(
    getAgeRange: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    include: () => Unit
  ): ExcludedVideoAge = {
    val __obj = js.Dynamic.literal(getAgeRange = js.Any.fromFunction0(getAgeRange), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), include = js.Any.fromFunction0(include))
    __obj.asInstanceOf[ExcludedVideoAge]
  }
  
  extension [Self <: ExcludedVideoAge](x: Self) {
    
    inline def setGetAgeRange(value: () => String): Self = StObject.set(x, "getAgeRange", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setInclude(value: () => Unit): Self = StObject.set(x, "include", js.Any.fromFunction0(value))
  }
}
