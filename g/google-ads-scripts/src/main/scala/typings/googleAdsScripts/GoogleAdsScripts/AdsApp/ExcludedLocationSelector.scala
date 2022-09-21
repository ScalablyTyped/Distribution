package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded locations. Unlike other selectors, does not support filtering or sorting.
  *
  * Typical usage:
  *
  *      var locationSelector = AdsApp.targeting().excludedLocations();
  *
  *      var locationIterator = locationSelector.get();
  *      while (locationIterator.hasNext()) {
  *        var location = locationIterator.next();
  *      }
  */
trait ExcludedLocationSelector
  extends StObject
     with Selector[ExcludedLocationIterator]
     with SelectorWithLimit
object ExcludedLocationSelector {
  
  inline def apply(get: () => ExcludedLocationIterator, withLimit: Double => ExcludedLocationSelector): ExcludedLocationSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedLocationSelector]
  }
}
