package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Targeting extends VideoCampaignTargeting {
  
  def audiences(): AdWordsSelector[SearchCampaignAudience] = js.native
  
  def excludedAudiences(): AdWordsSelector[SearchCampaignExcludedAudience] = js.native
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
  
  @scala.inline
  implicit class TargetingOps[Self <: Targeting] (val x: Self) extends AnyVal {
    
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
    def setAudiences(value: () => AdWordsSelector[SearchCampaignAudience]): Self = this.set("audiences", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedAudiences(value: () => AdWordsSelector[SearchCampaignExcludedAudience]): Self = this.set("excludedAudiences", js.Any.fromFunction0(value))
  }
}
