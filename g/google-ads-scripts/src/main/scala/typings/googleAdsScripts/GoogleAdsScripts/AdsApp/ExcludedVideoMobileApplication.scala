package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Mobile Application criterion in a Video Campaign. */
trait ExcludedVideoMobileApplication extends StObject {
  
  /** Returns the ID of the excluded mobile application. */
  def getAppId(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoMobileApplication". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video mobile application. */
  def getId(): Double
  
  /** Returns the mobile application name. */
  def getName(): String
  
  /** Returns the ad group to which this excluded video mobile application belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video mobile application belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video mobile application. */
  def remove(): Unit
}
object ExcludedVideoMobileApplication {
  
  inline def apply(
    getAppId: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedVideoMobileApplication = {
    val __obj = js.Dynamic.literal(getAppId = js.Any.fromFunction0(getAppId), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedVideoMobileApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoMobileApplication] (val x: Self) extends AnyVal {
    
    inline def setGetAppId(value: () => String): Self = StObject.set(x, "getAppId", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
