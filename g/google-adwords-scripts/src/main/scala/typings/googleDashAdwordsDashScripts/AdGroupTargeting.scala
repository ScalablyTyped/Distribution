package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  def getTargetingSetting(): String
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit
}

object AdGroupTargeting {
  @scala.inline
  def apply[SearchAdGroupAudience, SearchAdGroupExcludedAudience](
    audiences: () => AdWordsSelector[SearchAdGroupAudience],
    exculdedAudiences: () => AdWordsSelector[SearchAdGroupExcludedAudience],
    getTargetingSetting: () => String,
    newUserListBuilder: () => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Unit
  ): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences), getTargetingSetting = js.Any.fromFunction0(getTargetingSetting), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting))
  
    __obj.asInstanceOf[AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
  }
}

