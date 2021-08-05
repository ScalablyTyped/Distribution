package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCampaignTargeting extends StObject {
  
  def adSchedules(): AdWordsSelector[AdSchedule]
  
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel]
  
  def excludedLocations(): AdWordsSelector[ExcludedLocation]
  
  def languages(): AdWordsSelector[Language]
  
  def platforms(): AdWordsSelector[Platform]
  
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  
  def targetedProximities(): AdWordsSelector[TargetedProximity]
}
object VideoCampaignTargeting {
  
  inline def apply(
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
  
  extension [Self <: VideoCampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: () => AdWordsSelector[AdSchedule]): Self = StObject.set(x, "adSchedules", js.Any.fromFunction0(value))
    
    inline def setExcludedContentLabels(value: () => AdWordsSelector[ExcludedContentLabel]): Self = StObject.set(x, "excludedContentLabels", js.Any.fromFunction0(value))
    
    inline def setExcludedLocations(value: () => AdWordsSelector[ExcludedLocation]): Self = StObject.set(x, "excludedLocations", js.Any.fromFunction0(value))
    
    inline def setLanguages(value: () => AdWordsSelector[Language]): Self = StObject.set(x, "languages", js.Any.fromFunction0(value))
    
    inline def setPlatforms(value: () => AdWordsSelector[Platform]): Self = StObject.set(x, "platforms", js.Any.fromFunction0(value))
    
    inline def setTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self = StObject.set(x, "targetedLocations", js.Any.fromFunction0(value))
    
    inline def setTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self = StObject.set(x, "targetedProximities", js.Any.fromFunction0(value))
  }
}
