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
  * Fetches assets in an account.
  *
  * Typical usage:
  *
  *      var assetIterator = AdsApp.adAsset().assets()
  *        .withCondition("Type = IMAGE")
  *        .get();
  */
trait AssetSelector
  extends StObject
     with Selector[AssetIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object AssetSelector {
  
  inline def apply(
    get: () => AssetIterator,
    orderBy: String => AssetSelector,
    withCondition: String => AssetSelector,
    withIds: js.Array[Double] => AssetSelector,
    withLimit: Double => AssetSelector
  ): AssetSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[AssetSelector]
  }
}
