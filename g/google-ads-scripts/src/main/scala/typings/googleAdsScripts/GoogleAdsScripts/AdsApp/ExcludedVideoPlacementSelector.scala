package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video placements. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoPlacementSelector = AdsApp.videoTargeting()
  *          .excludedVideoPlacements()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoPlacementIterator = excludedVideoPlacementSelector.get();
  *      while (excludedVideoPlacementIterator.hasNext()) {
  *        var excludedVideoPlacement = excludedVideoPlacementIterator.next();
  *      }
  */
trait ExcludedVideoPlacementSelector
  extends StObject
     with Selector[ExcludedVideoPlacementIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoPlacementSelector {
  
  inline def apply(
    get: () => ExcludedVideoPlacementIterator,
    orderBy: String => ExcludedVideoPlacementSelector,
    withCondition: String => ExcludedVideoPlacementSelector,
    withLimit: Double => ExcludedVideoPlacementSelector
  ): ExcludedVideoPlacementSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoPlacementSelector]
  }
}
