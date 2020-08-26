package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] extends AdWordsTargeting[AdWordsEntity, AdWordsEntity] {
  def adSchedules(): AdWordsSelector[AdSchedule] = js.native
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel] = js.native
  def excludedLocations(): AdWordsSelector[ExcludedLocation] = js.native
  def getTargetingSetting(criterionTypeGroup: CriterionTypeGroup): TargetingSetting = js.native
  def languages(): AdWordsSelector[Language] = js.native
  def newUserListBuilder(): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
  def platforms(): AdWordsSelector[Platform] = js.native
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit = js.native
  def targetedLocations(): AdWordsSelector[TargetedLocation] = js.native
  def targetedProximities(): AdWordsSelector[TargetedProximity] = js.native
}

object CampaignTargeting {
  @scala.inline
  def apply[SearchCampaignAudience, SearchCampaignExcludedAudience](
    adSchedules: () => AdWordsSelector[AdSchedule],
    audiences: () => AdWordsSelector[AdWordsEntity],
    excludedContentLabels: () => AdWordsSelector[ExcludedContentLabel],
    excludedLocations: () => AdWordsSelector[ExcludedLocation],
    exculdedAudiences: () => AdWordsSelector[AdWordsEntity],
    getTargetingSetting: CriterionTypeGroup => TargetingSetting,
    languages: () => AdWordsSelector[Language],
    newUserListBuilder: () => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    platforms: () => AdWordsSelector[Platform],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Unit,
    targetedLocations: () => AdWordsSelector[TargetedLocation],
    targetedProximities: () => AdWordsSelector[TargetedProximity]
  ): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), audiences = js.Any.fromFunction0(audiences), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences), getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), languages = js.Any.fromFunction0(languages), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), platforms = js.Any.fromFunction0(platforms), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]]
  }
  @scala.inline
  implicit class CampaignTargetingOps[Self <: CampaignTargeting[_, _], SearchCampaignAudience, SearchCampaignExcludedAudience] (val x: Self with (CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience])) extends AnyVal {
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
    def setAdSchedules(value: () => AdWordsSelector[AdSchedule]): Self = this.set("adSchedules", js.Any.fromFunction0(value))
    @scala.inline
    def setExcludedContentLabels(value: () => AdWordsSelector[ExcludedContentLabel]): Self = this.set("excludedContentLabels", js.Any.fromFunction0(value))
    @scala.inline
    def setExcludedLocations(value: () => AdWordsSelector[ExcludedLocation]): Self = this.set("excludedLocations", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTargetingSetting(value: CriterionTypeGroup => TargetingSetting): Self = this.set("getTargetingSetting", js.Any.fromFunction1(value))
    @scala.inline
    def setLanguages(value: () => AdWordsSelector[Language]): Self = this.set("languages", js.Any.fromFunction0(value))
    @scala.inline
    def setNewUserListBuilder(value: () => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = this.set("newUserListBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setPlatforms(value: () => AdWordsSelector[Platform]): Self = this.set("platforms", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Unit): Self = this.set("setTargetingSetting", js.Any.fromFunction2(value))
    @scala.inline
    def setTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self = this.set("targetedLocations", js.Any.fromFunction0(value))
    @scala.inline
    def setTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self = this.set("targetedProximities", js.Any.fromFunction0(value))
  }
  
}

