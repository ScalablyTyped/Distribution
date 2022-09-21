package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a negative keyword list. */
trait NegativeKeywordList extends StObject {
  
  /** Adds a SharedNegativeKeyword to a negative keyword list. */
  def addNegativeKeyword(keywordText: String): Unit
  
  /** Adds a list of SharedNegativeKeyword objects to a negative keyword list. */
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit
  
  /** Returns a selector of all campaigns this negative keyword list has been applied to. */
  def campaigns(): CampaignSelector
  
  /** Returns the type of this entity as a String, in this case, "NegativeKeywordList". */
  def getEntityType(): String
  
  /** Returns the ID of the negative keyword list. */
  def getId(): Double
  
  /** Returns the name of a negative keyword list. */
  def getName(): String
  
  /** Returns a selector of the shared negative keywords in a negative keyword list. */
  def negativeKeywords(): SharedNegativeKeywordSelector
  
  /** Sets the name of a negative keyword list. */
  def setName(name: String): Unit
}
object NegativeKeywordList {
  
  inline def apply(
    addNegativeKeyword: String => Unit,
    addNegativeKeywords: js.Array[String] => Unit,
    campaigns: () => CampaignSelector,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    negativeKeywords: () => SharedNegativeKeywordSelector,
    setName: String => Unit
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1(addNegativeKeyword), addNegativeKeywords = js.Any.fromFunction1(addNegativeKeywords), campaigns = js.Any.fromFunction0(campaigns), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), negativeKeywords = js.Any.fromFunction0(negativeKeywords), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[NegativeKeywordList]
  }
  
  extension [Self <: NegativeKeywordList](x: Self) {
    
    inline def setAddNegativeKeyword(value: String => Unit): Self = StObject.set(x, "addNegativeKeyword", js.Any.fromFunction1(value))
    
    inline def setAddNegativeKeywords(value: js.Array[String] => Unit): Self = StObject.set(x, "addNegativeKeywords", js.Any.fromFunction1(value))
    
    inline def setCampaigns(value: () => CampaignSelector): Self = StObject.set(x, "campaigns", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setNegativeKeywords(value: () => SharedNegativeKeywordSelector): Self = StObject.set(x, "negativeKeywords", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
