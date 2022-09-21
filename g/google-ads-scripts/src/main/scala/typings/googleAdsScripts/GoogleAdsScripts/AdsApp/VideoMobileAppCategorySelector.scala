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
  * Fetches video mobile application categories. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var mobileAppCategorySelector = AdsApp.videoTargeting()
  *          .mobileAppCategories()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var mobileAppCategoryIterator = mobileAppCategorySelector.get();
  *      while (mobileAppCategoryIterator.hasNext()) {
  *        var mobileAppCategory = mobileAppCategoryIterator.next();
  *      }
  */
@js.native
trait VideoMobileAppCategorySelector
  extends StObject
     with Selector[VideoMobileAppCategoryIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
