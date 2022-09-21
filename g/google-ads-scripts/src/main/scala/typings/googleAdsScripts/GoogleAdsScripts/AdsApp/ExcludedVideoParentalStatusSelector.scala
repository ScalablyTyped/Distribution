package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video parental statuses. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoParentalStatusSelector = AdsApp.videoTargeting()
  *          .excludedVideoParentalStatuses()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoParentalStatusIterator = excludedVideoParentalStatusSelector.get();
  *      while (excludedVideoParentalStatusIterator.hasNext()) {
  *        var excludedVideoParentalStatus = excludedVideoParentalStatusIterator.next();
  *      }
  */
trait ExcludedVideoParentalStatusSelector
  extends StObject
     with Selector[ExcludedVideoParentalStatusIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoParentalStatusSelector {
  
  inline def apply(
    get: () => ExcludedVideoParentalStatusIterator,
    orderBy: String => ExcludedVideoParentalStatusSelector,
    withCondition: String => ExcludedVideoParentalStatusSelector,
    withLimit: Double => ExcludedVideoParentalStatusSelector
  ): ExcludedVideoParentalStatusSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoParentalStatusSelector]
  }
}
