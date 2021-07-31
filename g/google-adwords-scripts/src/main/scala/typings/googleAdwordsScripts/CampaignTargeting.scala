package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]
  extends StObject
     with AdWordsTargeting[AdWordsEntity, AdWordsEntity] {
  
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
  
  @scala.inline
  implicit class CampaignTargetingMutableBuilder[Self <: CampaignTargeting[?, ?], SearchCampaignAudience, SearchCampaignExcludedAudience] (val x: Self & (CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience])) extends AnyVal {
    
    @scala.inline
    def setAdSchedules(value: () => AdWordsSelector[AdSchedule]): Self = StObject.set(x, "adSchedules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedContentLabels(value: () => AdWordsSelector[ExcludedContentLabel]): Self = StObject.set(x, "excludedContentLabels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedLocations(value: () => AdWordsSelector[ExcludedLocation]): Self = StObject.set(x, "excludedLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetingSetting(value: CriterionTypeGroup => TargetingSetting): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguages(value: () => AdWordsSelector[Language]): Self = StObject.set(x, "languages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserListBuilder(value: () => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self = StObject.set(x, "newUserListBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlatforms(value: () => AdWordsSelector[Platform]): Self = StObject.set(x, "platforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Unit): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self = StObject.set(x, "targetedLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self = StObject.set(x, "targetedProximities", js.Any.fromFunction0(value))
  }
}
