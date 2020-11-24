package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCampaignTargeting extends js.Object {
  
  def adSchedules(): AdWordsSelector[AdSchedule] = js.native
  
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel] = js.native
  
  def excludedLocations(): AdWordsSelector[ExcludedLocation] = js.native
  
  def languages(): AdWordsSelector[Language] = js.native
  
  def platforms(): AdWordsSelector[Platform] = js.native
  
  def targetedLocations(): AdWordsSelector[TargetedLocation] = js.native
  
  def targetedProximities(): AdWordsSelector[TargetedProximity] = js.native
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
  
  @scala.inline
  implicit class VideoCampaignTargetingOps[Self <: VideoCampaignTargeting] (val x: Self) extends AnyVal {
    
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
    def setLanguages(value: () => AdWordsSelector[Language]): Self = this.set("languages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlatforms(value: () => AdWordsSelector[Platform]): Self = this.set("platforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self = this.set("targetedLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self = this.set("targetedProximities", js.Any.fromFunction0(value))
  }
}
