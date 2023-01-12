package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads label. */
trait Label extends StObject {
  
  /** Returns the selector of all ad groups to which the label is applied. */
  def adGroups(): AdGroupSelector
  
  /** Returns the selector of all ads to which the label is applied. */
  def ads(): AdSelector
  
  /** Returns the selector of all campaigns to which the label is applied. */
  def campaigns(): CampaignSelector
  
  /** Returns the color code of the label. */
  def getColor(): String
  
  /** Returns the description of the label. */
  def getDescription(): String
  
  /** Returns the type of this entity as a String, in this case, "Label". */
  def getEntityType(): String
  
  /** Returns the ID of the label. */
  def getId(): String
  
  /** Returns the name of the label. */
  def getName(): String
  
  /** Returns the selector of all keywords to which the label is applied. */
  def keywords(): KeywordSelector
  
  /** Removes the label. */
  def remove(): Unit
  
  /**
    * Sets the background color of the label.
    *
    * @param color	The new color. It must be specified in either RGB form (#RRGGBB or #RGB) or one of the 16 basic CSS color names.
    */
  def setColor(color: String): Unit
  
  /** Sets the description for this label. */
  def setDescription(description: String): Unit
  
  /** Changes the name of the Label. */
  def setName(name: String): Unit
}
object Label {
  
  inline def apply(
    adGroups: () => AdGroupSelector,
    ads: () => AdSelector,
    campaigns: () => CampaignSelector,
    getColor: () => String,
    getDescription: () => String,
    getEntityType: () => String,
    getId: () => String,
    getName: () => String,
    keywords: () => KeywordSelector,
    remove: () => Unit,
    setColor: String => Unit,
    setDescription: String => Unit,
    setName: String => Unit
  ): Label = {
    val __obj = js.Dynamic.literal(adGroups = js.Any.fromFunction0(adGroups), ads = js.Any.fromFunction0(ads), campaigns = js.Any.fromFunction0(campaigns), getColor = js.Any.fromFunction0(getColor), getDescription = js.Any.fromFunction0(getDescription), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), keywords = js.Any.fromFunction0(keywords), remove = js.Any.fromFunction0(remove), setColor = js.Any.fromFunction1(setColor), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    inline def setAdGroups(value: () => AdGroupSelector): Self = StObject.set(x, "adGroups", js.Any.fromFunction0(value))
    
    inline def setAds(value: () => AdSelector): Self = StObject.set(x, "ads", js.Any.fromFunction0(value))
    
    inline def setCampaigns(value: () => CampaignSelector): Self = StObject.set(x, "campaigns", js.Any.fromFunction0(value))
    
    inline def setGetColor(value: () => String): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setKeywords(value: () => KeywordSelector): Self = StObject.set(x, "keywords", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetColor(value: String => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    inline def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
