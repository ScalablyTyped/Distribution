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
    getMatchType: js.Function0[MatchType],
    getNegativeKeywordList: js.Function0[NegativeKeywordList],
    getText: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMatchType")(getMatchType)
    __obj.updateDynamic("getNegativeKeywordList")(getNegativeKeywordList)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("remove")(remove)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
}

