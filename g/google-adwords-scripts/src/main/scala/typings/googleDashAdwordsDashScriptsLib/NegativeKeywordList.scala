package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeKeywordList extends AdWordsEntity {
  def addNegativeKeyword(keywordText: java.lang.String): scala.Unit
  def addNegativeKeywords(keywordTexts: js.Array[java.lang.String]): scala.Unit
  def campaigns(): AdWordsSelector[Campaign]
  def getId(): scala.Double
  def getName(): java.lang.String
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword]
  def setName(): java.lang.String
}

object NegativeKeywordList {
  @scala.inline
  def apply(
    addNegativeKeyword: java.lang.String => scala.Unit,
    addNegativeKeywords: js.Array[java.lang.String] => scala.Unit,
    campaigns: () => AdWordsSelector[Campaign],
    getId: () => scala.Double,
    getName: () => java.lang.String,
    negativeKeywords: () => AdWordsSelector[SharedNegativeKeyword],
    setName: () => java.lang.String,
    getEntityType: () => java.lang.String = null
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1(addNegativeKeyword), addNegativeKeywords = js.Any.fromFunction1(addNegativeKeywords), campaigns = js.Any.fromFunction0(campaigns), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), negativeKeywords = js.Any.fromFunction0(negativeKeywords), setName = js.Any.fromFunction0(setName))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[NegativeKeywordList]
  }
}

