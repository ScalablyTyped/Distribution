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
  * Fetches topics. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var topicSelector = AdsApp.display()
  *         .topics()
  *         .withCondition("Impressions > 100")
  *         .forDateRange("LAST_MONTH")
  *         .orderBy("Clicks DESC");
  *
  *     var topicIterator = topicSelector.get();
  *     while (topicIterator.hasNext()) {
  *       var topic = topicIterator.next();
  *     }
  */
@js.native
trait TopicSelector
  extends StObject
     with Selector[TopicIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
