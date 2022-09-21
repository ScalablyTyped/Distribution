package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads language target. */
trait Language extends StObject {
  
  /** Returns the base campaign to which this language belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this language belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the type of this entity as a String, in this case, "Language". */
  def getEntityType(): String
  
  /** Returns the ID of the language. */
  def getId(): Double
  
  /** Returns the language name, e.g., "English", "German". */
  def getName(): String
  
  /** Returns the video campaign to which this language belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the language. */
  def remove(): Unit
}
object Language {
  
  inline def apply(
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getCampaignType: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): Language = {
    val __obj = js.Dynamic.literal(getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaignType(value: () => String): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
