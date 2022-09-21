package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video YouTube videos. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoYouTubeVideoSelector = AdsApp.videoTargeting()
  *          .excludedVideoYouTubeVideos()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoYouTubeVideoIterator = excludedVideoYouTubeVideoSelector.get();
  *      while (excludedVideoYouTubeVideoIterator.hasNext()) {
  *        var excludedVideoYouTubeVideo = excludedVideoYouTubeVideoIterator.next();
  *      }
  */
trait ExcludedVideoYouTubeVideoSelector
  extends StObject
     with Selector[ExcludedVideoYouTubeVideoIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoYouTubeVideoSelector {
  
  inline def apply(
    get: () => ExcludedVideoYouTubeVideoIterator,
    orderBy: String => ExcludedVideoYouTubeVideoSelector,
    withCondition: String => ExcludedVideoYouTubeVideoSelector,
    withLimit: Double => ExcludedVideoYouTubeVideoSelector
  ): ExcludedVideoYouTubeVideoSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoYouTubeVideoSelector]
  }
}
