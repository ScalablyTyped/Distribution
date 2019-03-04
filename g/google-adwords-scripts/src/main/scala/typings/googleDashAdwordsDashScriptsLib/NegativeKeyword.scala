package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Negative Keywords
trait NegativeKeyword
  extends isAdGroupChild
     with AdWordsEntity {
  def getMatchType(): MatchType
  def getText(): java.lang.String
  def remove(): scala.Unit
}

object NegativeKeyword {
  @scala.inline
  def apply(
    getAdGroup: js.Function0[AdGroup],
    getCampaign: js.Function0[Campaign],
    getMatchType: js.Function0[MatchType],
    getText: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup, getCampaign = getCampaign, getMatchType = getMatchType, getText = getText, remove = remove)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[NegativeKeyword]
  }
}

