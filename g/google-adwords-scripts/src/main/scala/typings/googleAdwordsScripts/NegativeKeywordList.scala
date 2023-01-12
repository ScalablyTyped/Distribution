package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeKeywordList
  extends StObject
     with AdWordsEntity {
  
  def addNegativeKeyword(keywordText: String): Unit
  
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit
  
  def campaigns(): AdWordsSelector[Campaign]
  
  def getId(): Double
  
  def getName(): String
  
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword]
  
  def setName(): String
}
object NegativeKeywordList {
  
  inline def apply(
    addNegativeKeyword: String => Unit,
    addNegativeKeywords: js.Array[String] => Unit,
    campaigns: () => AdWordsSelector[Campaign],
    getId: () => Double,
    getName: () => String,
    negativeKeywords: () => AdWordsSelector[SharedNegativeKeyword],
    setName: () => String
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1(addNegativeKeyword), addNegativeKeywords = js.Any.fromFunction1(addNegativeKeywords), campaigns = js.Any.fromFunction0(campaigns), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), negativeKeywords = js.Any.fromFunction0(negativeKeywords), setName = js.Any.fromFunction0(setName))
    __obj.asInstanceOf[NegativeKeywordList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegativeKeywordList] (val x: Self) extends AnyVal {
    
    inline def setAddNegativeKeyword(value: String => Unit): Self = StObject.set(x, "addNegativeKeyword", js.Any.fromFunction1(value))
    
    inline def setAddNegativeKeywords(value: js.Array[String] => Unit): Self = StObject.set(x, "addNegativeKeywords", js.Any.fromFunction1(value))
    
    inline def setCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "campaigns", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setNegativeKeywords(value: () => AdWordsSelector[SharedNegativeKeyword]): Self = StObject.set(x, "negativeKeywords", js.Any.fromFunction0(value))
    
    inline def setSetName(value: () => String): Self = StObject.set(x, "setName", js.Any.fromFunction0(value))
  }
}
