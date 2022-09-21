package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded content label target. */
trait ExcludedContentLabel extends StObject {
  
  /** Returns the base campaign to which this excluded content label belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded content label belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the content label type. */
  def getContentLabelType(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedContentLabel". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded content label. */
  def getId(): Double
  
  /** Returns the video campaign to which this excluded content label belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded content label. */
  def remove(): Unit
}
object ExcludedContentLabel {
  
  inline def apply(
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getCampaignType: () => String,
    getContentLabelType: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getContentLabelType = js.Any.fromFunction0(getContentLabelType), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedContentLabel]
  }
  
  extension [Self <: ExcludedContentLabel](x: Self) {
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaignType(value: () => String): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    inline def setGetContentLabelType(value: () => String): Self = StObject.set(x, "getContentLabelType", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
