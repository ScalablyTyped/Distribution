package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdCanRequestAds extends js.Object {
  var ad: expoLib.expoMod.FacebookAdsNs.NativeAd | scala.Null
  var canRequestAds: scala.Boolean
}

object Anon_AdCanRequestAds {
  @scala.inline
  def apply(canRequestAds: scala.Boolean, ad: expoLib.expoMod.FacebookAdsNs.NativeAd = null): Anon_AdCanRequestAds = {
    val __obj = js.Dynamic.literal(canRequestAds = canRequestAds)
    if (ad != null) __obj.updateDynamic("ad")(ad)
    __obj.asInstanceOf[Anon_AdCanRequestAds]
  }
}

