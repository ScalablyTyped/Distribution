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
  * Fetches drafts. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var draftSelector = AdsApp.drafts()
  *          .withCondition("BaseCampaignId = 123456789")
  *          .orderBy("DraftName ASC");
  *
  *      var draftIterator = draftSelector.get();
  *      while (draftIterator.hasNext()) {
  *        var draft = draftIterator.next();
  *      }
  */
trait DraftSelector
  extends StObject
     with Selector[DraftIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object DraftSelector {
  
  inline def apply(
    get: () => DraftIterator,
    orderBy: String => DraftSelector,
    withCondition: String => DraftSelector,
    withIds: js.Array[Double] => DraftSelector,
    withLimit: Double => DraftSelector
  ): DraftSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[DraftSelector]
  }
}
