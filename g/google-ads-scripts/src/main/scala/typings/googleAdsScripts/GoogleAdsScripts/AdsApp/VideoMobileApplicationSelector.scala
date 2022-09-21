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
  * Fetches video mobile applications. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var mobileApplicationSelector = AdsApp.videoTargeting()
  *          .mobileApplications()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var mobileApplicationIterator = mobileApplicationSelector.get();
  *      while (mobileApplicationIterator.hasNext()) {
  *        var mobileApplication = mobileApplicationIterator.next();
  *      }
  */
@js.native
trait VideoMobileApplicationSelector
  extends StObject
     with Selector[VideoMobileApplicationIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
