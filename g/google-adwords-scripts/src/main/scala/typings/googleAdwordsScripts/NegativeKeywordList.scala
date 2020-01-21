package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeKeywordList extends AdWordsEntity {
  def addNegativeKeyword(keywordText: String): Unit
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit
  def campaigns(): AdWordsSelector[Campaign]
  def getId(): Double
  def getName(): String
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword]
  def setName(): String
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
    setName: () => String,
    getEntityType: () => String = null
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1(addNegativeKeyword), addNegativeKeywords = js.Any.fromFunction1(addNegativeKeywords), campaigns = js.Any.fromFunction0(campaigns), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), negativeKeywords = js.Any.fromFunction0(negativeKeywords), setName = js.Any.fromFunction0(setName))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[NegativeKeywordList]
  }
}

