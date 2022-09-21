package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches labels. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var labelSelector = AdsApp.labels()
  *          .withCondition("CampaignsCount > 5")
  *          .orderBy("CampaignsCount DESC");
  *
  *      var labelIterator = labelSelector.get();
  *      while (labelIterator.hasNext()) {
  *        var label = labelIterator.next();
  *      }
  */
trait LabelSelector
  extends StObject
     with Selector[LabelIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object LabelSelector {
  
  inline def apply(
    get: () => LabelIterator,
    orderBy: String => LabelSelector,
    withCondition: String => LabelSelector,
    withIds: js.Array[Double] => LabelSelector,
    withLimit: Double => LabelSelector
  ): LabelSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[LabelSelector]
  }
}
