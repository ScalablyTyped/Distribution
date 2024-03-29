package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to the targeting criteria for video campaigns.
  *
  * For example, to select the ad schedules for all video campaigns:
  *
  *  var adSchedules = AdsApp.videoCampaignTargeting().adSchedules().get();
  *  while (adSchedules.hasNext()) {
  *    var adSchedule = adSchedules.next();
  *  }
  */
trait VideoCampaignTargeting extends StObject {
  
  /** Specializes this selector to return AdSchedule criteria. */
  def adSchedules(): AdScheduleSelector
  
  /** Specializes this selector to return ExcludedContentLabel criteria. */
  def excludedContentLabels(): ExcludedContentLabelSelector
  
  /** Specializes this selector to return ExcludedLocation criteria. */
  def excludedLocations(): ExcludedLocationSelector
  
  /** Specializes this selector to return Language criteria. */
  def languages(): LanguageSelector
  
  /** Specializes this selector to return Platform criteria. */
  def platforms(): PlatformSelector
  
  /** Specializes this selector to return TargetedLocation criteria. */
  def targetedLocations(): TargetedLocationSelector
  
  /** Specializes this selector to return TargetedProximity criteria. */
  def targetedProximities(): TargetedProximitySelector
}
object VideoCampaignTargeting {
  
  inline def apply(
    adSchedules: () => AdScheduleSelector,
    excludedContentLabels: () => ExcludedContentLabelSelector,
    excludedLocations: () => ExcludedLocationSelector,
    languages: () => LanguageSelector,
    platforms: () => PlatformSelector,
    targetedLocations: () => TargetedLocationSelector,
    targetedProximities: () => TargetedProximitySelector
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), languages = js.Any.fromFunction0(languages), platforms = js.Any.fromFunction0(platforms), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoCampaignTargeting] (val x: Self) extends AnyVal {
    
    inline def setAdSchedules(value: () => AdScheduleSelector): Self = StObject.set(x, "adSchedules", js.Any.fromFunction0(value))
    
    inline def setExcludedContentLabels(value: () => ExcludedContentLabelSelector): Self = StObject.set(x, "excludedContentLabels", js.Any.fromFunction0(value))
    
    inline def setExcludedLocations(value: () => ExcludedLocationSelector): Self = StObject.set(x, "excludedLocations", js.Any.fromFunction0(value))
    
    inline def setLanguages(value: () => LanguageSelector): Self = StObject.set(x, "languages", js.Any.fromFunction0(value))
    
    inline def setPlatforms(value: () => PlatformSelector): Self = StObject.set(x, "platforms", js.Any.fromFunction0(value))
    
    inline def setTargetedLocations(value: () => TargetedLocationSelector): Self = StObject.set(x, "targetedLocations", js.Any.fromFunction0(value))
    
    inline def setTargetedProximities(value: () => TargetedProximitySelector): Self = StObject.set(x, "targetedProximities", js.Any.fromFunction0(value))
  }
}
