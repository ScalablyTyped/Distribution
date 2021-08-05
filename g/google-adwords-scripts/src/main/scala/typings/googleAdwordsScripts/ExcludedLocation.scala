package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedLocation
  extends StObject
     with AdWordsEntity
     with isCampaignChild {
  
  def getCampaignType(): CampaignType
  
  def getCountryCode(): String
  
  def getId(): Double
  
  def getName(): String
  
  def getTargetType(): TargetType
  
  def getTargetingStatus(): TargetingStatus
  
  def getVideoCampaign(): Campaign
  
  // TODO: VideoCampaign
  def remove(): Unit
}
object ExcludedLocation {
  
  inline def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getCountryCode: () => String,
    getId: () => Double,
    getName: () => String,
    getTargetType: () => TargetType,
    getTargetingStatus: () => TargetingStatus,
    getVideoCampaign: () => Campaign,
    remove: () => Unit
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getCountryCode = js.Any.fromFunction0(getCountryCode), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getTargetType = js.Any.fromFunction0(getTargetType), getTargetingStatus = js.Any.fromFunction0(getTargetingStatus), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedLocation]
  }
  
  extension [Self <: ExcludedLocation](x: Self) {
    
    inline def setGetCampaignType(value: () => CampaignType): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    inline def setGetCountryCode(value: () => String): Self = StObject.set(x, "getCountryCode", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetTargetType(value: () => TargetType): Self = StObject.set(x, "getTargetType", js.Any.fromFunction0(value))
    
    inline def setGetTargetingStatus(value: () => TargetingStatus): Self = StObject.set(x, "getTargetingStatus", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => Campaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
