package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to campaign-level targeting criteria.
  *
  * For instance, to select all locations targeted by a campaign you might use:
  *
  *  var campaign = AdsApp.shoppingCampaigns().get().next();
  *  var locations = campaign.targeting().targetedLocations().get();
  *  while (locations.hasNext()) {
  *    var location = locations.next();
  *  }
  */
trait ShoppingCampaignTargeting extends StObject {
  
  /** Specializes this selector to return AdSchedule criteria. */
  def adSchedules(): AdScheduleSelector
  
  /** Specializes this selector to return ShoppingCampaignAudience criteria. */
  def audiences(): ShoppingCampaignAudienceSelector
  
  /** Specializes this selector to return ExcludedLocation criteria. */
  def excludedLocations(): ExcludedLocationSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this campaign. */
  def getTargetingSetting(criterionTypeGroup: String): String
  
  /** Returns a new user list audience builder for this campaign. */
  def newUserListBuilder(): ShoppingCampaignAudienceBuilder
  
  /** Specializes this selector to return Platform criteria. */
  def platforms(): PlatformSelector
  
  /** Sets the targeting setting for this campaign. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
  
  /** Specializes this selector to return TargetedLocation criteria. */
  def targetedLocations(): TargetedLocationSelector
  
  /** Specializes this selector to return TargetedProximity criteria. */
  def targetedProximities(): TargetedProximitySelector
}
object ShoppingCampaignTargeting {
  
  inline def apply(
    adSchedules: () => AdScheduleSelector,
    audiences: () => ShoppingCampaignAudienceSelector,
    excludedLocations: () => ExcludedLocationSelector,
    getTargetingSetting: String => String,
    newUserListBuilder: () => ShoppingCampaignAudienceBuilder,
    platforms: () => PlatformSelector,
    setTargetingSetting: (String, String) => Unit,
    targetedLocations: () => TargetedLocationSelector,
    targetedProximities: () => TargetedProximitySelector
  ): ShoppingCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), audiences = js.Any.fromFunction0(audiences), excludedLocations = js.Any.fromFunction0(excludedLocations), getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), platforms = js.Any.fromFunction0(platforms), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[ShoppingCampaignTargeting]
  }
  
  extension [Self <: ShoppingCampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: () => AdScheduleSelector): Self = StObject.set(x, "adSchedules", js.Any.fromFunction0(value))
    
    inline def setAudiences(value: () => ShoppingCampaignAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedLocations(value: () => ExcludedLocationSelector): Self = StObject.set(x, "excludedLocations", js.Any.fromFunction0(value))
    
    inline def setGetTargetingSetting(value: String => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction1(value))
    
    inline def setNewUserListBuilder(value: () => ShoppingCampaignAudienceBuilder): Self = StObject.set(x, "newUserListBuilder", js.Any.fromFunction0(value))
    
    inline def setPlatforms(value: () => PlatformSelector): Self = StObject.set(x, "platforms", js.Any.fromFunction0(value))
    
    inline def setSetTargetingSetting(value: (String, String) => Unit): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2(value))
    
    inline def setTargetedLocations(value: () => TargetedLocationSelector): Self = StObject.set(x, "targetedLocations", js.Any.fromFunction0(value))
    
    inline def setTargetedProximities(value: () => TargetedProximitySelector): Self = StObject.set(x, "targetedProximities", js.Any.fromFunction0(value))
  }
}
