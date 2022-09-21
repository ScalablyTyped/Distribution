package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video mobile applications. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoMobileApplicationSelector = AdsApp.videoTargeting()
  *          .excludedVideoMobileApplications()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoMobileApplicationIterator = excludedVideoMobileApplicationSelector.get();
  *      while (excludedVideoMobileApplicationIterator.hasNext()) {
  *        var excludedVideoMobileApplication = excludedVideoMobileApplicationIterator.next();
  *      }
  */
trait ExcludedVideoMobileApplicationSelector
  extends StObject
     with Selector[ExcludedVideoMobileApplicationIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoMobileApplicationSelector {
  
  inline def apply(
    get: () => ExcludedVideoMobileApplicationIterator,
    orderBy: String => ExcludedVideoMobileApplicationSelector,
    withCondition: String => ExcludedVideoMobileApplicationSelector,
    withLimit: Double => ExcludedVideoMobileApplicationSelector
  ): ExcludedVideoMobileApplicationSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoMobileApplicationSelector]
  }
}
