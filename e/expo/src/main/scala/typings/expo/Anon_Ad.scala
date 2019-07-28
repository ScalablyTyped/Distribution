package typings.expo

import typings.expo.expoMod.FacebookAdsNs.NativeAd
import typings.expo.expoMod.FacebookAdsNs.NativeAdsManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ad extends js.Object {
  var adsManager: NativeAdsManager
  var onAdLoaded: js.UndefOr[(js.Function1[/* ad */ NativeAd, Unit]) | Null] = js.undefined
}

object Anon_Ad {
  @scala.inline
  def apply(adsManager: NativeAdsManager, onAdLoaded: /* ad */ NativeAd => Unit = null): Anon_Ad = {
    val __obj = js.Dynamic.literal(adsManager = adsManager)
    if (onAdLoaded != null) __obj.updateDynamic("onAdLoaded")(js.Any.fromFunction1(onAdLoaded))
    __obj.asInstanceOf[Anon_Ad]
  }
}

