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
  * Fetches excluded YouTube videos. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedYouTubeVideoSelector = AdsApp.display()
  *          .excludedYouTubeVideos()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedYouTubeVideoIterator = excludedYouTubeVideoSelector.get();
  *      while (excludedYouTubeVideoIterator.hasNext()) {
  *        var excludedYouTubeVideo = excludedYouTubeVideoIterator.next();
  *      }
  */
@js.native
trait ExcludedYouTubeVideoSelector
  extends StObject
     with Selector[ExcludedYouTubeVideoIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
