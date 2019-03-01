package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  def getTargetingSetting(): java.lang.String
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): scala.Unit
}

object AdGroupTargeting {
  @scala.inline
  def apply[SearchAdGroupAudience, SearchAdGroupExcludedAudience](
    audiences: js.Function0[AdWordsSelector[SearchAdGroupAudience]],
    exculdedAudiences: js.Function0[AdWordsSelector[SearchAdGroupExcludedAudience]],
    getTargetingSetting: js.Function0[java.lang.String],
    newUserListBuilder: js.Function0[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    setTargetingSetting: js.Function2[CriterionTypeGroup, TargetingSetting, scala.Unit]
  ): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audiences")(audiences)
    __obj.updateDynamic("exculdedAudiences")(exculdedAudiences)
    __obj.updateDynamic("getTargetingSetting")(getTargetingSetting)
    __obj.updateDynamic("newUserListBuilder")(newUserListBuilder)
    __obj.updateDynamic("setTargetingSetting")(setTargetingSetting)
    __obj.asInstanceOf[AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
  }
}

