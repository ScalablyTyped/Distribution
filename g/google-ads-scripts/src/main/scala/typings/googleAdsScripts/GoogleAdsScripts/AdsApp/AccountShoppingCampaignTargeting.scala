package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to shopping campaign-level targeting criteria (currently just audiences).
  *
  * For instance, to select all audiences targeted by shopping campaigns you might use:
  *
  *      var shoppingAudienceSelector = AdsApp.shoppingCampaignTargeting()
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
trait AccountShoppingCampaignTargeting extends StObject {
  
  /** Specializes this selector to return ShoppingCampaignAudience criteria. */
  def audiences(): ShoppingCampaignAudienceSelector
}
object AccountShoppingCampaignTargeting {
  
  inline def apply(audiences: () => ShoppingCampaignAudienceSelector): AccountShoppingCampaignTargeting = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences))
    __obj.asInstanceOf[AccountShoppingCampaignTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountShoppingCampaignTargeting] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => ShoppingCampaignAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
  }
}
