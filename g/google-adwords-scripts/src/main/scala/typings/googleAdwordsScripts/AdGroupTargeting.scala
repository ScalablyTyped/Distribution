package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  def getTargetingSetting(): String = js.native
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit = js.native
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
  @scala.inline
  implicit class AdGroupTargetingOps[Self <: AdGroupTargeting[_, _], SearchAdGroupAudience, SearchAdGroupExcludedAudience] (val x: Self with (AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTargetingSetting(value: () => String): Self = this.set("getTargetingSetting", js.Any.fromFunction0(value))
    @scala.inline
    def setNewUserListBuilder(value: () => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = this.set("newUserListBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Unit): Self = this.set("setTargetingSetting", js.Any.fromFunction2(value))
  }
  
}

