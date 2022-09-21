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
  * Fetches excluded YouTube channels. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedYouTubeChannelSelector = AdsApp.display()
  *          .excludedYouTubeChannels()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedYouTubeChannelIterator = excludedYouTubeChannelSelector.get();
  *      while (excludedYouTubeChannelIterator.hasNext()) {
  *        var excludedYouTubeChannel = excludedYouTubeChannelIterator.next();
  *      }
  */
@js.native
trait ExcludedYouTubeChannelSelector
  extends StObject
     with Selector[ExcludedYouTubeChannelIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
