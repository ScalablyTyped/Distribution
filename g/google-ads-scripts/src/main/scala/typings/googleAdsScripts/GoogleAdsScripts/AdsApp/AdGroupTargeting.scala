package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to ad group-level targeting criteria: audiences. */
trait AdGroupTargeting extends StObject {
  
  /** Specializes this selector to return SearchAdGroupAudience criteria. */
  def audiences(): SearchAdGroupAudienceSelector
  
  /** Specializes this selector to return SearchAdGroupExcludedAudience criteria. */
  def excludedAudiences(): SearchAdGroupExcludedAudienceSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this ad group. */
  def getTargetingSetting(): String
  
  /** Returns a new user list builder for this ad group. */
  def newUserListBuilder(): SearchAdGroupAudienceBuilder
  
  /** Sets the targeting setting for this ad group. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
}
object AdGroupTargeting {
  
  inline def apply(
    audiences: () => SearchAdGroupAudienceSelector,
    excludedAudiences: () => SearchAdGroupExcludedAudienceSelector,
    getTargetingSetting: () => String,
    newUserListBuilder: () => SearchAdGroupAudienceBuilder,
    setTargetingSetting: (String, String) => Unit
  ): AdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), getTargetingSetting = js.Any.fromFunction0(getTargetingSetting), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting))
    __obj.asInstanceOf[AdGroupTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdGroupTargeting] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => SearchAdGroupAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedAudiences(value: () => SearchAdGroupExcludedAudienceSelector): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
    
    inline def setGetTargetingSetting(value: () => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction0(value))
    
    inline def setNewUserListBuilder(value: () => SearchAdGroupAudienceBuilder): Self = StObject.set(x, "newUserListBuilder", js.Any.fromFunction0(value))
    
    inline def setSetTargetingSetting(value: (String, String) => Unit): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2(value))
  }
}
