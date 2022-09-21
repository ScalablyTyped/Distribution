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
  * Fetches media in an account.
  *
  * Typical usage:
  *
  *      var mediaIterator = AdsApp.adMedia().media()
  *        .withCondition("Type = IMAGE")
  *        .get();
  */
trait MediaSelector
  extends StObject
     with Selector[MediaIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object MediaSelector {
  
  inline def apply(
    get: () => MediaIterator,
    orderBy: String => MediaSelector,
    withCondition: String => MediaSelector,
    withIds: js.Array[Double] => MediaSelector,
    withLimit: Double => MediaSelector
  ): MediaSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[MediaSelector]
  }
}
