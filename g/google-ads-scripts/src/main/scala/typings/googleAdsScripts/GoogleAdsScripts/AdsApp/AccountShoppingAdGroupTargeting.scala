package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to shopping ad group-level targeting criteria (currently just audiences).
  *
  * For instance, to select all audiences targeted by shopping ad groups you might use:
  *
  *      var shoppingAudienceSelector = AdsApp.shoppingAdGroupTargeting()
  *       .audiences()
  *       .withCondition("Impressions > 100")
  *       .forDateRange("LAST_MONTH")
  *       .orderBy("Clicks DESC");
  *
  *      var shoppingAudienceIterator = shoppingAudienceSelector.get();
  *      while (shoppingAudienceIterator.hasNext()) {
  *        var shoppingAudience = shoppingAudienceIterator.next();
  *      }
  */
trait AccountShoppingAdGroupTargeting extends StObject {
  
  /** Specializes this selector to return ShoppingAdGroupAudience criteria. */
  def audiences(): ShoppingAdGroupAudienceSelector
}
object AccountShoppingAdGroupTargeting {
  
  inline def apply(audiences: () => ShoppingAdGroupAudienceSelector): AccountShoppingAdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences))
    __obj.asInstanceOf[AccountShoppingAdGroupTargeting]
  }
  
  extension [Self <: AccountShoppingAdGroupTargeting](x: Self) {
    
    inline def setAudiences(value: () => ShoppingAdGroupAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
  }
}
