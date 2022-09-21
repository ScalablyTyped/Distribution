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
  * Fetches keywords. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var keywordSelector = AdsApp
  *          .keywords()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var keywordIterator = keywordSelector.get();
  *      while (keywordIterator.hasNext()) {
  *        var keyword = keywordIterator.next();
  *      }
  */
@js.native
trait KeywordSelector
  extends StObject
     with Selector[KeywordIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
