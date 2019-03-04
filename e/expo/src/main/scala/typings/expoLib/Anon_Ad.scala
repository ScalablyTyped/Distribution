package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ad extends js.Object {
  var adsManager: expoLib.expoMod.FacebookAdsNs.NativeAdsManager
  var onAdLoaded: js.UndefOr[
    (js.Function1[/* ad */ expoLib.expoMod.FacebookAdsNs.NativeAd, scala.Unit]) | scala.Null
  ] = js.undefined
}

object Anon_Ad {
  @scala.inline
  def apply(
    adsManager: expoLib.expoMod.FacebookAdsNs.NativeAdsManager,
    onAdLoaded: js.Function1[/* ad */ expoLib.expoMod.FacebookAdsNs.NativeAd, scala.Unit] = null
  ): Anon_Ad = {
    val __obj = js.Dynamic.literal(adsManager = adsManager)
    if (onAdLoaded != null) __obj.updateDynamic("onAdLoaded")(onAdLoaded)
    __obj.asInstanceOf[Anon_Ad]
  }
}

