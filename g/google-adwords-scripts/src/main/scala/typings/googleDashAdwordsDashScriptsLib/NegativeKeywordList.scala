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
    addNegativeKeyword: js.Function1[java.lang.String, scala.Unit],
    addNegativeKeywords: js.Function1[js.Array[java.lang.String], scala.Unit],
    campaigns: js.Function0[AdWordsSelector[Campaign]],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    negativeKeywords: js.Function0[AdWordsSelector[SharedNegativeKeyword]],
    setName: js.Function0[java.lang.String],
    getEntityType: js.Function0[java.lang.String] = null
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = addNegativeKeyword, addNegativeKeywords = addNegativeKeywords, campaigns = campaigns, getId = getId, getName = getName, negativeKeywords = negativeKeywords, setName = setName)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[NegativeKeywordList]
  }
}

