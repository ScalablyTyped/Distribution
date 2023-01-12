package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targeting
  extends StObject
     with VideoCampaignTargeting {
  
  def audiences(): AdWordsSelector[SearchCampaignAudience]
  
  def excludedAudiences(): AdWordsSelector[SearchCampaignExcludedAudience]
}
object Targeting {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Targeting] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => AdWordsSelector[SearchCampaignAudience]): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedAudiences(value: () => AdWordsSelector[SearchCampaignExcludedAudience]): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
  }
}
