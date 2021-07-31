package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with AdWordsEntity
     with isCampaignChild {
  
  def getCampaignType(): CampaignType
  
  def getId(): Double
  
  def getName(): String
  
  def getVideoCampaign(): Campaign
  
  // TODO: VideoCampaign
  def remove(): Unit
}
object Language {
  
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getId: () => Double,
    getName: () => String,
    getVideoCampaign: () => Campaign,
    remove: () => Unit
  ): Language = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCampaignType(value: () => CampaignType): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVideoCampaign(value: () => Campaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
