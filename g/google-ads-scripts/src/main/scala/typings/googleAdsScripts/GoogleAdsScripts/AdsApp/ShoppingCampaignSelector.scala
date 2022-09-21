package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorForDateRange
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches shopping campaigns. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var shoppingCampaignSelector = AdsApp
  *          .shoppingCampaigns()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var shoppingCampaignIterator = shoppingCampaignSelector.get();
  *      while (shoppingCampaignIterator.hasNext()) {
  *        var shoppingCampaign = shoppingCampaignIterator.next();
  *      }
  */
@js.native
trait ShoppingCampaignSelector
  extends StObject
     with Selector[ShoppingCampaignIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
