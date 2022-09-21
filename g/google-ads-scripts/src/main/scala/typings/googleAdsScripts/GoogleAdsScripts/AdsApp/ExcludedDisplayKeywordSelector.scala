package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded display keywords. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedDisplayKeywordSelector = AdsApp.display()
  *          .keywords()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var excludedDisplayKeywordIterator = excludedDisplayKeywordSelector.get();
  *      while (excludedDisplayKeywordIterator.hasNext()) {
  *        var excludedDisplayKeyword = excludedDisplayKeywordIterator.next();
  *      }
  */
trait ExcludedDisplayKeywordSelector
  extends StObject
     with Selector[ExcludedDisplayKeywordIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedDisplayKeywordSelector {
  
  inline def apply(
    get: () => ExcludedDisplayKeywordIterator,
    orderBy: String => ExcludedDisplayKeywordSelector,
    withCondition: String => ExcludedDisplayKeywordSelector,
    withLimit: Double => ExcludedDisplayKeywordSelector
  ): ExcludedDisplayKeywordSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedDisplayKeywordSelector]
  }
}
