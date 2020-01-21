package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedNegativeKeyword extends AdWordsEntity {
  def getMatchType(): MatchType
  def getNegativeKeywordList(): NegativeKeywordList
  def getText(): String
  def remove(): Unit
}

object SharedNegativeKeyword {
  @scala.inline
  def apply(
    getMatchType: () => MatchType,
    getNegativeKeywordList: () => NegativeKeywordList,
    getText: () => String,
    remove: () => Unit,
    getEntityType: () => String = null
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getMatchType = js.Any.fromFunction0(getMatchType), getNegativeKeywordList = js.Any.fromFunction0(getNegativeKeywordList), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
}

