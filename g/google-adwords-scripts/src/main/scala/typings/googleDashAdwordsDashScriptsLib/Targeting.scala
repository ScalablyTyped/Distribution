package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targeting extends VideoCampaignTargeting {
  def audiences(): AdWordsSelector[SearchCampaignAudience]
  def excludedAudiences(): AdWordsSelector[SearchCampaignExcludedAudience]
}

object Targeting {
  @scala.inline
  def apply(
    adSchedules: js.Function0[AdWordsSelector[AdSchedule]],
    audiences: js.Function0[AdWordsSelector[SearchCampaignAudience]],
    excludedAudiences: js.Function0[AdWordsSelector[SearchCampaignExcludedAudience]],
    excludedContentLabels: js.Function0[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: js.Function0[AdWordsSelector[ExcludedLocation]],
    languages: js.Function0[AdWordsSelector[Language]],
    platforms: js.Function0[AdWordsSelector[Platform]],
    targetedLocations: js.Function0[AdWordsSelector[TargetedLocation]],
    targetedProximities: js.Function0[AdWordsSelector[TargetedProximity]]
  ): Targeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules, audiences = audiences, excludedAudiences = excludedAudiences, excludedContentLabels = excludedContentLabels, excludedLocations = excludedLocations, languages = languages, platforms = platforms, targetedLocations = targetedLocations, targetedProximities = targetedProximities)
  
    __obj.asInstanceOf[Targeting]
  }
}

