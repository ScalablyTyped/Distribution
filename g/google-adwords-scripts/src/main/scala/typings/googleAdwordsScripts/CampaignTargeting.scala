package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] extends AdWordsTargeting[AdWordsEntity, AdWordsEntity] {
  def adSchedules(): AdWordsSelector[AdSchedule]
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel]
  def excludedLocations(): AdWordsSelector[ExcludedLocation]
  def getTargetingSetting(criterionTypeGroup: CriterionTypeGroup): TargetingSetting
  def languages(): AdWordsSelector[Language]
  def newUserListBuilder(): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  def platforms(): AdWordsSelector[Platform]
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  def targetedProximities(): AdWordsSelector[TargetedProximity]
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
}

