package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads negative keyword.
  *
  * Negative keywords can exist either at the ad group level or the campaign level.
  */
trait NegativeKeyword extends StObject {
  
  /** Returns the AdGroup to which the negative keyword belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base AdGroup to which the negative keyword belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this negative keyword belongs or null if it does not belong to a search or display campaign. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this negative keyword belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the type of this entity as a String, in this case, "NegativeKeyword". */
  def getEntityType(): String
  
  /** Returns the match type of the negative keyword. */
  def getMatchType(): String
  
  /** Returns the ShoppingAdGroup to which the negative keyword belongs. */
  def getShoppingAdGroup(): ShoppingAdGroup
  
  /** Returns the shopping campaign to which this negative keyword belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign
  
  /** Returns the text of the negative keyword. */
  def getText(): String
  
  /** Removes the negative keyword. */
  def remove(): Unit
}
object NegativeKeyword {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getBaseAdGroup: () => AdGroup,
    getBaseCampaign: () => Campaign,
    getCampaign: () => Campaign,
    getCampaignType: () => String,
    getEntityType: () => String,
    getMatchType: () => String,
    getShoppingAdGroup: () => ShoppingAdGroup,
    getShoppingCampaign: () => ShoppingCampaign,
    getText: () => String,
    remove: () => Unit
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getBaseAdGroup = js.Any.fromFunction0(getBaseAdGroup), getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getEntityType = js.Any.fromFunction0(getEntityType), getMatchType = js.Any.fromFunction0(getMatchType), getShoppingAdGroup = js.Any.fromFunction0(getShoppingAdGroup), getShoppingCampaign = js.Any.fromFunction0(getShoppingCampaign), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NegativeKeyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegativeKeyword] (val x: Self) extends AnyVal {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseAdGroup(value: () => AdGroup): Self = StObject.set(x, "getBaseAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
    
    inline def setGetCampaignType(value: () => String): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetMatchType(value: () => String): Self = StObject.set(x, "getMatchType", js.Any.fromFunction0(value))
    
    inline def setGetShoppingAdGroup(value: () => ShoppingAdGroup): Self = StObject.set(x, "getShoppingAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetShoppingCampaign(value: () => ShoppingCampaign): Self = StObject.set(x, "getShoppingCampaign", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
