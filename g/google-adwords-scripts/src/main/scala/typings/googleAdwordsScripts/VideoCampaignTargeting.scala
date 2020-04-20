package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCampaignTargeting extends js.Object {
  def adSchedules(): AdWordsSelector[AdSchedule]
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel]
  def excludedLocations(): AdWordsSelector[ExcludedLocation]
  def languages(): AdWordsSelector[Language]
  def platforms(): AdWordsSelector[Platform]
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  def targetedProximities(): AdWordsSelector[TargetedProximity]
}

object VideoCampaignTargeting {
  @scala.inline
  def apply(
    adSchedules: () => AdWordsSelector[AdSchedule],
    excludedContentLabels: () => AdWordsSelector[ExcludedContentLabel],
    excludedLocations: () => AdWordsSelector[ExcludedLocation],
    languages: () => AdWordsSelector[Language],
    platforms: () => AdWordsSelector[Platform],
    targetedLocations: () => AdWordsSelector[TargetedLocation],
    targetedProximities: () => AdWordsSelector[TargetedProximity]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), languages = js.Any.fromFunction0(languages), platforms = js.Any.fromFunction0(platforms), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
}

