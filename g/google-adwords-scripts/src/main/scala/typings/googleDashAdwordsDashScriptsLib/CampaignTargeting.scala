package typings
package googleDashAdwordsDashScriptsLib

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
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): scala.Unit
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  def targetedProximities(): AdWordsSelector[TargetedProximity]
}

object CampaignTargeting {
  @scala.inline
  def apply[SearchCampaignAudience, SearchCampaignExcludedAudience](
    adSchedules: js.Function0[AdWordsSelector[AdSchedule]],
    audiences: js.Function0[AdWordsSelector[AdWordsEntity]],
    excludedContentLabels: js.Function0[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: js.Function0[AdWordsSelector[ExcludedLocation]],
    exculdedAudiences: js.Function0[AdWordsSelector[AdWordsEntity]],
    getTargetingSetting: js.Function1[CriterionTypeGroup, TargetingSetting],
    languages: js.Function0[AdWordsSelector[Language]],
    newUserListBuilder: js.Function0[SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    platforms: js.Function0[AdWordsSelector[Platform]],
    setTargetingSetting: js.Function2[CriterionTypeGroup, TargetingSetting, scala.Unit],
    targetedLocations: js.Function0[AdWordsSelector[TargetedLocation]],
    targetedProximities: js.Function0[AdWordsSelector[TargetedProximity]]
  ): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules, audiences = audiences, excludedContentLabels = excludedContentLabels, excludedLocations = excludedLocations, exculdedAudiences = exculdedAudiences, getTargetingSetting = getTargetingSetting, languages = languages, newUserListBuilder = newUserListBuilder, platforms = platforms, setTargetingSetting = setTargetingSetting, targetedLocations = targetedLocations, targetedProximities = targetedProximities)
  
    __obj.asInstanceOf[CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]]
  }
}

