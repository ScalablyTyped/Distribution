package typings.googleDashAdwordsDashScripts

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
    adSchedules: () => AdWordsSelector[AdSchedule],
    audiences: () => AdWordsSelector[SearchCampaignAudience],
    excludedAudiences: () => AdWordsSelector[SearchCampaignExcludedAudience],
    excludedContentLabels: () => AdWordsSelector[ExcludedContentLabel],
    excludedLocations: () => AdWordsSelector[ExcludedLocation],
    languages: () => AdWordsSelector[Language],
    platforms: () => AdWordsSelector[Platform],
    targetedLocations: () => AdWordsSelector[TargetedLocation],
    targetedProximities: () => AdWordsSelector[TargetedProximity]
  ): Targeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), languages = js.Any.fromFunction0(languages), platforms = js.Any.fromFunction0(platforms), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
  
    __obj.asInstanceOf[Targeting]
  }
}

