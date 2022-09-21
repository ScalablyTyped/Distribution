package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Video in a Video Campaign. */
trait ExcludedVideoYouTubeVideo extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoYouTubeVideo". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video YouTube video. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video YouTube video belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video YouTube video belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Returns the YouTube video ID. */
  def getVideoId(): String
  
  /** Removes the excluded video YouTube video. */
  def remove(): Unit
}
object ExcludedVideoYouTubeVideo {
  
  inline def apply(
    getEntityType: () => String,
    getId: () => Double,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    getVideoId: () => String,
    remove: () => Unit
  ): ExcludedVideoYouTubeVideo = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), getVideoId = js.Any.fromFunction0(getVideoId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoYouTubeVideo]
  }
  
  extension [Self <: ExcludedVideoYouTubeVideo](x: Self) {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setGetVideoId(value: () => String): Self = StObject.set(x, "getVideoId", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
