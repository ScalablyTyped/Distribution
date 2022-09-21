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
  * Fetches excluded topics. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var adGroup = AdsApp.adGroups().get().next();
  *      var excludedTopicSelector = adGroup.display().excludedTopics();
  *
  *      var excludedTopicIterator = excludedTopicSelector.get();
  *      while (excludedTopicIterator.hasNext()) {
  *        var excludedTopic = excludedTopicIterator.next();
  *      }
  */
@js.native
trait ExcludedTopicSelector
  extends StObject
     with Selector[ExcludedTopicIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
