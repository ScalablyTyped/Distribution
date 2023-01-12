package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Video. */
trait ExcludedYouTubeVideo extends StObject {
  
  /** Returns the ad group to which this excluded YouTube video belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this excluded YouTube video belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this excluded YouTube video belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded YouTube video belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the excluded YouTube video. */
  def getId(): Double
  
  /** Returns the YouTube video ID. */
  def getVideoId(): String
  
  /** Removes the excluded YouTube video. */
  def remove(): Unit
}
object ExcludedYouTubeVideo {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getBaseAdGroup: () => AdGroup,
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getId: () => Double,
    getVideoId: () => String,
    remove: () => Unit
  ): ExcludedYouTubeVideo = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getBaseAdGroup = js.Any.fromFunction0(getBaseAdGroup), getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getVideoId = js.Any.fromFunction0(getVideoId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedYouTubeVideo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedYouTubeVideo] (val x: Self) extends AnyVal {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseAdGroup(value: () => AdGroup): Self = StObject.set(x, "getBaseAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetVideoId(value: () => String): Self = StObject.set(x, "getVideoId", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
