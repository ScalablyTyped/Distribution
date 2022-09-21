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
  * Fetches shopping ad groups. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var shoppingAdGroupSelector = AdsApp
  *          .shoppingAdGroups()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var shoppingAdGroupIterator = shoppingAdGroupSelector.get();
  *      while (shoppingAdGroupIterator.hasNext()) {
  *        var shoppingAdGroup = shoppingAdGroupIterator.next();
  *      }
  */
@js.native
trait ShoppingAdGroupSelector
  extends StObject
     with Selector[ShoppingAdGroupIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
