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
  * Fetches excluded placements. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var adGroup = AdsApp.adGroups().get().next();
  *      var excludedPlacementSelector = adGroup.display().excludedPlacements();
  *
  *      var excludedPlacementIterator = excludedPlacementSelector.get();
  *      while (excludedPlacementIterator.hasNext()) {
  *        var excludedPlacement = excludedPlacementIterator.next();
  *      }
  */
@js.native
trait ExcludedPlacementSelector
  extends StObject
     with Selector[ExcludedPlacementIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
