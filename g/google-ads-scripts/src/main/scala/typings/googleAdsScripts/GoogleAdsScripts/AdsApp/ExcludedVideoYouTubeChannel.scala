package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Channel in a Video Campaign. */
trait ExcludedVideoYouTubeChannel extends StObject {
  
  /** Returns the YouTube channel ID. */
  def getChannelId(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoYouTubeChannel". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video YouTube channel. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video YouTube channel belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video YouTube channel belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video YouTube channel. */
  def remove(): Unit
}
object ExcludedVideoYouTubeChannel {
  
  inline def apply(
    getChannelId: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoYouTubeChannel = {
    val __obj = js.Dynamic.literal(getChannelId = js.Any.fromFunction0(getChannelId), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoYouTubeChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoYouTubeChannel] (val x: Self) extends AnyVal {
    
    inline def setGetChannelId(value: () => String): Self = StObject.set(x, "getChannelId", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
