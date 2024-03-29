package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorForDateRange
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches video YouTube videos. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var youTubeVideoSelector = AdsApp.videoTargeting()
  *          .youTubeVideos()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var youTubeVideoIterator = youTubeVideoSelector.get();
  *      while (youTubeVideoIterator.hasNext()) {
  *        var youTubeVideo = youTubeVideoIterator.next();
  *      }
  */
@js.native
trait VideoYouTubeVideoSelector
  extends StObject
     with Selector[VideoYouTubeVideoIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
