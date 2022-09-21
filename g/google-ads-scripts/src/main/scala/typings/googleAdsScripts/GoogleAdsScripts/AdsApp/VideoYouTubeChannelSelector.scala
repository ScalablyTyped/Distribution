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
  * Fetches video YouTube channels. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var youTubeChannelSelector = AdsApp.videoTargeting()
  *          .youTubeChannels()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var youTubeChannelIterator = youTubeChannelSelector.get();
  *      while (youTubeChannelIterator.hasNext()) {
  *        var youTubeChannel = youTubeChannelIterator.next();
  *      }
  */
@js.native
trait VideoYouTubeChannelSelector
  extends StObject
     with Selector[VideoYouTubeChannelIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
