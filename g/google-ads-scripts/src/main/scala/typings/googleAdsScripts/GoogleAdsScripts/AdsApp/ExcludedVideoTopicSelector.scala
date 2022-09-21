package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video topics. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoTopicSelector = AdsApp.videoTargeting()
  *          .excludedVideoTopics()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoTopicIterator = excludedVideoTopicSelector.get();
  *      while (excludedVideoTopicIterator.hasNext()) {
  *        var excludedVideoTopic = excludedVideoTopicIterator.next();
  *      }
  */
trait ExcludedVideoTopicSelector
  extends StObject
     with Selector[ExcludedVideoTopicIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoTopicSelector {
  
  inline def apply(
    get: () => ExcludedVideoTopicIterator,
    orderBy: String => ExcludedVideoTopicSelector,
    withCondition: String => ExcludedVideoTopicSelector,
    withLimit: Double => ExcludedVideoTopicSelector
  ): ExcludedVideoTopicSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoTopicSelector]
  }
}
