package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads excluded location.
  *
  * Excluded locations are used to restrict your ads from showing in specific geographic areas.
  * For instance, a campaign could show ads in all parts of a country except for a specific city by having a TargetedLocation
  * for the entire country and an ExcludedLocation for that specific city.
  */
trait ExcludedLocation extends StObject {
  
  /** Returns the base campaign to which this excluded location belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded location belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the country code of this location. */
  def getCountryCode(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedLocation". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded location. */
  def getId(): Double
  
  /** Returns the name of this location. */
  def getName(): String
  
  /** Returns the shopping campaign to which this excluded location belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign
  
  /** Returns the target type of this location. */
  def getTargetType(): String
  
  /** Returns the targeting status of this location. */
  def getTargetingStatus(): String
  
  /** Returns the video campaign to which this excluded location belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded location. */
  def remove(): Unit
}
object ExcludedLocation {
  
  inline def apply(
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getCampaignType: () => String,
    getCountryCode: () => String,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    getShoppingCampaign: () => ShoppingCampaign,
    getTargetType: () => String,
    getTargetingStatus: () => String,
    getVideoCampaign: () => VideoCampaign,
    remove: () => Unit
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getCountryCode = js.Any.fromFunction0(getCountryCode), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getShoppingCampaign = js.Any.fromFunction0(getShoppingCampaign), getTargetType = js.Any.fromFunction0(getTargetType), getTargetingStatus = js.Any.fromFunction0(getTargetingStatus), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedLocation]
  }
  
  extension [Self <: ExcludedLocation](x: Self) {
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaignType(value: () => String): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    inline def setGetCountryCode(value: () => String): Self = StObject.set(x, "getCountryCode", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetShoppingCampaign(value: () => ShoppingCampaign): Self = StObject.set(x, "getShoppingCampaign", js.Any.fromFunction0(value))
    
    inline def setGetTargetType(value: () => String): Self = StObject.set(x, "getTargetType", js.Any.fromFunction0(value))
    
    inline def setGetTargetingStatus(value: () => String): Self = StObject.set(x, "getTargetingStatus", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
