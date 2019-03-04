package typings
package googleDashAdwordsDashScriptsLib

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
    adSchedules: js.Function0[AdWordsSelector[AdSchedule]],
    excludedContentLabels: js.Function0[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: js.Function0[AdWordsSelector[ExcludedLocation]],
    languages: js.Function0[AdWordsSelector[Language]],
    platforms: js.Function0[AdWordsSelector[Platform]],
    targetedLocations: js.Function0[AdWordsSelector[TargetedLocation]],
    targetedProximities: js.Function0[AdWordsSelector[TargetedProximity]]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules, excludedContentLabels = excludedContentLabels, excludedLocations = excludedLocations, languages = languages, platforms = platforms, targetedLocations = targetedLocations, targetedProximities = targetedProximities)
  
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
}

