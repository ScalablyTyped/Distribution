package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded content labels. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedContentLabelSelector = campaign.targeting()
  *          .excludedContentLabels()
  *          .withCondition("Impressions > 100")
  *          .orderBy("Clicks DESC");
  *
  *      var excludedContentLabelIterator = excludedContentLabelSelector.get();
  *      while (excludedContentLabelIterator.hasNext()) {
  *        var excludedContentLabel = excludedContentLabelIterator.next();
  *      }
  */
trait ExcludedContentLabelSelector
  extends StObject
     with Selector[ExcludedContentLabelIterator]
     with SelectorWithIds
     with SelectorWithLimit
object ExcludedContentLabelSelector {
  
  inline def apply(
    get: () => ExcludedContentLabelIterator,
    withIds: js.Array[Double] => ExcludedContentLabelSelector,
    withLimit: Double => ExcludedContentLabelSelector
  ): ExcludedContentLabelSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedContentLabelSelector]
  }
}
