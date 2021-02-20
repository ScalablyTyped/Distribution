package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordList extends AdWordsEntity {
  
  def addNegativeKeyword(keywordText: String): Unit = js.native
  
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit = js.native
  
  def campaigns(): AdWordsSelector[Campaign] = js.native
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword] = js.native
  
  def setName(): String = js.native
}
object NegativeKeywordList {
  
  @scala.inline
  def apply(
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
  implicit class NegativeKeywordListMutableBuilder[Self <: NegativeKeywordList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNegativeKeyword(value: String => Unit): Self = StObject.set(x, "addNegativeKeyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddNegativeKeywords(value: js.Array[String] => Unit): Self = StObject.set(x, "addNegativeKeywords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "campaigns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNegativeKeywords(value: () => AdWordsSelector[SharedNegativeKeyword]): Self = StObject.set(x, "negativeKeywords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetName(value: () => String): Self = StObject.set(x, "setName", js.Any.fromFunction0(value))
  }
}
