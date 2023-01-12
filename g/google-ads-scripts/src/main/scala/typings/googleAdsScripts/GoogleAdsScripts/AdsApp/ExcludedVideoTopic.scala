package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedVideoTopic extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoTopic". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video topic. */
  def getId(): Double
  
  /** Returns the topic ID of the excluded topic. */
  def getTopicId(): Double
  
  /** Returns the ad group to which this excluded video topic belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video topic belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video topic. */
  def remove(): Unit
}
object ExcludedVideoTopic {
  
  inline def apply(
    getEntityType: () => String,
    getId: () => Double,
    getTopicId: () => Double,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoTopic = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getTopicId = js.Any.fromFunction0(getTopicId), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoTopic] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetTopicId(value: () => Double): Self = StObject.set(x, "getTopicId", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
