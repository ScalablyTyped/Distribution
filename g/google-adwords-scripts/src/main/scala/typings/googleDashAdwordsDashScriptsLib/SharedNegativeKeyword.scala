package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedNegativeKeyword extends AdWordsEntity {
  def getMatchType(): MatchType
  def getNegativeKeywordList(): NegativeKeywordList
  def getText(): java.lang.String
  def remove(): scala.Unit
}

object SharedNegativeKeyword {
  @scala.inline
  def apply(
    getMatchType: () => MatchType,
    getNegativeKeywordList: () => NegativeKeywordList,
    getText: () => java.lang.String,
    remove: () => scala.Unit,
    getEntityType: () => java.lang.String = null
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getMatchType = js.Any.fromFunction0(getMatchType), getNegativeKeywordList = js.Any.fromFunction0(getNegativeKeywordList), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
}

