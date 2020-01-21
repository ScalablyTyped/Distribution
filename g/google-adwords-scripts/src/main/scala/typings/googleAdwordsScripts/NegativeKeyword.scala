package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Negative Keywords
trait NegativeKeyword
  extends isAdGroupChild
     with AdWordsEntity {
  def getMatchType(): MatchType
  def getText(): String
  def remove(): Unit
}

object NegativeKeyword {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getMatchType: () => MatchType,
    getText: () => String,
    remove: () => Unit,
    getEntityType: () => String = null
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getMatchType = js.Any.fromFunction0(getMatchType), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[NegativeKeyword]
  }
}

