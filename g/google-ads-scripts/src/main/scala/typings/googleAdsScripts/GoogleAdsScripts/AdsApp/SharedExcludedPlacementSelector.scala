package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches shared excluded placements. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var sharedExcludedPlacementSelector = negativeKeywordList.negativeKeywords()
  *          .withCondition("PlacementUrl CONTAINS 'test'")
  *          .withLimit(1)
  *          .withIds([10,20])
  *          .orderBy("SharedSetId DESC");
  *
  *      var sharedExcludedPlacementIterator = sharedExcludedPlacementSelector.get();
  *
  *      while (sharedExcludedPlacementIterator.hasNext()) {
  *        var sharedExcludedPlacement = sharedExcludedPlacementIterator.next();
  *      }
  */
trait SharedExcludedPlacementSelector
  extends StObject
     with Selector[SharedExcludedPlacementIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object SharedExcludedPlacementSelector {
  
  inline def apply(
    get: () => SharedExcludedPlacementIterator,
    orderBy: String => SharedExcludedPlacementSelector,
    withCondition: String => SharedExcludedPlacementSelector,
    withLimit: Double => SharedExcludedPlacementSelector
  ): SharedExcludedPlacementSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[SharedExcludedPlacementSelector]
  }
}
