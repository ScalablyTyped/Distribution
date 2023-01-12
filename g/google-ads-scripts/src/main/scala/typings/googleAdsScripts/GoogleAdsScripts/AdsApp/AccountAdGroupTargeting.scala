package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to ad group-level targeting criteria (currently just audiences). */
trait AccountAdGroupTargeting extends StObject {
  
  /** Specializes this selector to return SearchAdGroupAudience criteria. */
  def audiences(): SearchAdGroupAudienceSelector
  
  /** Specializes this selector to return SearchAdGroupExcludedAudience criteria. */
  def excludedAudiences(): SearchAdGroupExcludedAudienceSelector
}
object AccountAdGroupTargeting {
  
  inline def apply(
    audiences: () => SearchAdGroupAudienceSelector,
    excludedAudiences: () => SearchAdGroupExcludedAudienceSelector
  ): AccountAdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences))
    __obj.asInstanceOf[AccountAdGroupTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountAdGroupTargeting] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => SearchAdGroupAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedAudiences(value: () => SearchAdGroupExcludedAudienceSelector): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
  }
}
