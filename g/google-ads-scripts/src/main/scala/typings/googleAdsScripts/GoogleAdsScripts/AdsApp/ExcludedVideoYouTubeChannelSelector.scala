package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video YouTube channels. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoYouTubeChannelSelector = AdsApp.videoTargeting()
  *          .excludedVideoYouTubeChannels()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoYouTubeChannelIterator = excludedVideoYouTubeChannelSelector.get();
  *      while (excludedVideoYouTubeChannelIterator.hasNext()) {
  *        var excludedVideoYouTubeChannel = excludedVideoYouTubeChannelIterator.next();
  *      }
  */
trait ExcludedVideoYouTubeChannelSelector
  extends StObject
     with Selector[ExcludedVideoYouTubeChannelIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoYouTubeChannelSelector {
  
  inline def apply(
    get: () => ExcludedVideoYouTubeChannelIterator,
    orderBy: String => ExcludedVideoYouTubeChannelSelector,
    withCondition: String => ExcludedVideoYouTubeChannelSelector,
    withLimit: Double => ExcludedVideoYouTubeChannelSelector
  ): ExcludedVideoYouTubeChannelSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoYouTubeChannelSelector]
  }
}
