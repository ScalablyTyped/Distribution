package typings.expo

import typings.expo.expoMod.FacebookAdsNs.NativeAd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdCanRequestAds extends js.Object {
  var ad: NativeAd | Null
  var canRequestAds: Boolean
}

object Anon_AdCanRequestAds {
  @scala.inline
  def apply(canRequestAds: Boolean, ad: NativeAd = null): Anon_AdCanRequestAds = {
    val __obj = js.Dynamic.literal(canRequestAds = canRequestAds)
    if (ad != null) __obj.updateDynamic("ad")(ad)
    __obj.asInstanceOf[Anon_AdCanRequestAds]
  }
}

