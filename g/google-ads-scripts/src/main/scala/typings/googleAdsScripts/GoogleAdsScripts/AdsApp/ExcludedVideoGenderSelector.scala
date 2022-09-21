package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video genders. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoGenderSelector = AdsApp.videoTargeting()
  *          .excludedVideoGenders()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoGenderIterator = excludedVideoGenderSelector.get();
  *      while (excludedVideoGenderIterator.hasNext()) {
  *        var excludedVideoGender = excludedVideoGenderIterator.next();
  *      }
  */
trait ExcludedVideoGenderSelector
  extends StObject
     with Selector[ExcludedVideoGenderIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoGenderSelector {
  
  inline def apply(
    get: () => ExcludedVideoGenderIterator,
    orderBy: String => ExcludedVideoGenderSelector,
    withCondition: String => ExcludedVideoGenderSelector,
    withLimit: Double => ExcludedVideoGenderSelector
  ): ExcludedVideoGenderSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoGenderSelector]
  }
}
