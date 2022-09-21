package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches shared negative keyword. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var sharedNegativeKeywordSelector = negativeKeywordList.negativeKeywords()
  *          .withCondition("KeywordText STARTS_WITH 'test'")
  *          .withLimit(1)
  *          .withIds([10,20])
  *          .orderBy("SharedSetId DESC");
  *
  *      var sharedNegativeKeywordIterator = sharedNegativeKeywordSelector.get();
  *
  *      while (sharedNegativeKeywordIterator.hasNext()) {
  *        var sharedNegativeKeyword = sharedNegativeKeywordIterator.next();
  *      }
  */
trait SharedNegativeKeywordSelector
  extends StObject
     with Selector[SharedNegativeKeywordIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object SharedNegativeKeywordSelector {
  
  inline def apply(
    get: () => SharedNegativeKeywordIterator,
    orderBy: String => SharedNegativeKeywordSelector,
    withCondition: String => SharedNegativeKeywordSelector,
    withLimit: Double => SharedNegativeKeywordSelector
  ): SharedNegativeKeywordSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[SharedNegativeKeywordSelector]
  }
}
