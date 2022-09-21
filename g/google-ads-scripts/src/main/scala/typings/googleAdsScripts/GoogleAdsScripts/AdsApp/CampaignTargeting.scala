package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to campaign-level targeting criteria: device targeting, ad scheduling, location targeting, and audiences.
  *
  * For instance, to select all locations targeted by a campaign you might use:
  *
  *      var campaign = AdsApp.campaigns().get().next();
  *      var locations = campaign.targeting().targetedLocations().get();
  *      while (locations.hasNext()) {
  *        var location = locations.next();
  *      }
  */
trait CampaignTargeting extends StObject {
  
  /** Specializes this selector to return AdSchedule criteria. */
  def adSchedules(): AdScheduleSelector
  
  /** Specializes this selector to return SearchCampaignAudience criteria. */
  def audiences(): SearchCampaignAudienceSelector
  
  /** Specializes this selector to return SearchCampaignExcludedAudience criteria. */
  def excludedAudiences(): SearchCampaignExcludedAudienceSelector
  
  /** Specializes this selector to return ExcludedContentLabel criteria. */
  def excludedContentLabels(): ExcludedContentLabelSelector
  
  /** Specializes this selector to return ExcludedLocation criteria. */
  def excludedLocations(): ExcludedLocationSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this campaign. */
  def getTargetingSetting(): String
  
  /** Specializes this selector to return Language criteria. */
  def languages(): LanguageSelector
  
  /** Returns a new user list audience builder for this campaign. */
  def newUserListBuilder(): SearchCampaignAudienceBuilder
  
  /** Specializes this selector to return Platform criteria. */
  def platforms(): PlatformSelector
  
  /** Sets the targeting setting for this campaign. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
  
  /** Specializes this selector to return TargetedLocation criteria. */
  def targetedLocations(): TargetedLocationSelector
  
  /** Specializes this selector to return TargetedProximity criteria. */
  def targetedProximities(): TargetedProximitySelector
}
object CampaignTargeting {
  
  inline def apply(
    adSchedules: () => AdScheduleSelector,
    audiences: () => SearchCampaignAudienceSelector,
    excludedAudiences: () => SearchCampaignExcludedAudienceSelector,
    excludedContentLabels: () => ExcludedContentLabelSelector,
    excludedLocations: () => ExcludedLocationSelector,
    getTargetingSetting: () => String,
    languages: () => LanguageSelector,
    newUserListBuilder: () => SearchCampaignAudienceBuilder,
    platforms: () => PlatformSelector,
    setTargetingSetting: (String, String) => Unit,
    targetedLocations: () => TargetedLocationSelector,
    targetedProximities: () => TargetedProximitySelector
  ): CampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), getTargetingSetting = js.Any.fromFunction0(getTargetingSetting), languages = js.Any.fromFunction0(languages), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), platforms = js.Any.fromFunction0(platforms), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[CampaignTargeting]
  }
  
  extension [Self <: CampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: () => AdScheduleSelector): Self = StObject.set(x, "adSchedules", js.Any.fromFunction0(value))
    
    inline def setAudiences(value: () => SearchCampaignAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedAudiences(value: () => SearchCampaignExcludedAudienceSelector): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
    
    inline def setExcludedContentLabels(value: () => ExcludedContentLabelSelector): Self = StObject.set(x, "excludedContentLabels", js.Any.fromFunction0(value))
    
    inline def setExcludedLocations(value: () => ExcludedLocationSelector): Self = StObject.set(x, "excludedLocations", js.Any.fromFunction0(value))
    
    inline def setGetTargetingSetting(value: () => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction0(value))
    
    inline def setLanguages(value: () => LanguageSelector): Self = StObject.set(x, "languages", js.Any.fromFunction0(value))
    
    inline def setNewUserListBuilder(value: () => SearchCampaignAudienceBuilder): Self = StObject.set(x, "newUserListBuilder", js.Any.fromFunction0(value))
    
    inline def setPlatforms(value: () => PlatformSelector): Self = StObject.set(x, "platforms", js.Any.fromFunction0(value))
    
    inline def setSetTargetingSetting(value: (String, String) => Unit): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2(value))
    
    inline def setTargetedLocations(value: () => TargetedLocationSelector): Self = StObject.set(x, "targetedLocations", js.Any.fromFunction0(value))
    
    inline def setTargetedProximities(value: () => TargetedProximitySelector): Self = StObject.set(x, "targetedProximities", js.Any.fromFunction0(value))
  }
}
