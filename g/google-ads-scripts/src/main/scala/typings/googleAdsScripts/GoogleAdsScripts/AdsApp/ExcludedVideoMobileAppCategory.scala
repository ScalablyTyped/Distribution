package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Mobile App Category in a Video Campaign. */
trait ExcludedVideoMobileAppCategory extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoMobileAppCategory". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video mobile application category. */
  def getId(): Double
  
  /** Returns the ID of the excluded mobile application category. */
  def getMobileAppCategoryId(): Double
  
  /** Returns the ad group to which this excluded video mobile application category belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video mobile application category belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video mobile application category. */
  def remove(): Unit
}
object ExcludedVideoMobileAppCategory {
  
  inline def apply(
    getEntityType: () => String,
    getId: () => Double,
    getMobileAppCategoryId: () => Double,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoMobileAppCategory = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getMobileAppCategoryId = js.Any.fromFunction0(getMobileAppCategoryId), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoMobileAppCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoMobileAppCategory] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetMobileAppCategoryId(value: () => Double): Self = StObject.set(x, "getMobileAppCategoryId", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
