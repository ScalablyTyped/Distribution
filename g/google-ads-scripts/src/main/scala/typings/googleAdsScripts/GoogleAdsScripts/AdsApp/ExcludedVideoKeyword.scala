package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Keyword in a Video Campaign. */
trait ExcludedVideoKeyword extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoKeyword". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video keyword. */
  def getId(): Double
  
  /** Returns the text of the excluded video keyword. */
  def getText(): String
  
  /** Returns the ad group to which this excluded video keyword belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video keyword belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video keyword. */
  def remove(): Unit
}
object ExcludedVideoKeyword {
  
  inline def apply(
    getEntityType: () => String,
    getId: () => Double,
    getText: () => String,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoKeyword = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getText = js.Any.fromFunction0(getText), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoKeyword]
  }
  
  extension [Self <: ExcludedVideoKeyword](x: Self) {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
