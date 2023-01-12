package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Channel. */
trait ExcludedYouTubeChannel extends StObject {
  
  /** Returns the ad group to which this excluded YouTube channel belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this excluded YouTube channel belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this excluded YouTube channel belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded YouTube channel belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the excluded YouTube channel ID. */
  def getChannelId(): String
  
  /** Returns the ID of the excluded YouTube channel. */
  def getId(): Double
  
  /** Removes the excluded YouTube channel. */
  def remove(): Unit
}
object ExcludedYouTubeChannel {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getBaseAdGroup: () => AdGroup,
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getChannelId: () => String,
    getId: () => Double,
    remove: () => Unit
  ): ExcludedYouTubeChannel = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getBaseAdGroup = js.Any.fromFunction0(getBaseAdGroup), getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getChannelId = js.Any.fromFunction0(getChannelId), getId = js.Any.fromFunction0(getId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedYouTubeChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedYouTubeChannel] (val x: Self) extends AnyVal {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseAdGroup(value: () => AdGroup): Self = StObject.set(x, "getBaseAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetChannelId(value: () => String): Self = StObject.set(x, "getChannelId", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
