package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Placement in a Video Campaign. */
trait ExcludedVideoPlacement extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoPlacement". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video placement. */
  def getId(): Double
  
  /** Returns the URL of the excluded placement. */
  def getUrl(): String
  
  /** Returns the ad group to which this excluded video placement belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video placement belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video placement. */
  def remove(): Unit
}
object ExcludedVideoPlacement {
  
  inline def apply(
    getEntityType: () => String,
    getId: () => Double,
    getUrl: () => String,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoPlacement = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getUrl = js.Any.fromFunction0(getUrl), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoPlacement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoPlacement] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
