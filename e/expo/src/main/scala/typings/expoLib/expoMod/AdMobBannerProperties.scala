package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdMobBannerProperties
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  var adUnitID: js.UndefOr[java.lang.String] = js.undefined
  var adViewDidDismissScreen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var adViewDidReceiveAd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var adViewWillDismissScreen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var adViewWillLeaveApplication: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var adViewWillPresentScreen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var bannerSize: js.UndefOr[AdMobBannerSize] = js.undefined
  var didFailToReceiveAdWithError: js.UndefOr[js.Function1[/* errorDescription */ java.lang.String, scala.Unit]] = js.undefined
  var testDeviceID: js.UndefOr[java.lang.String] = js.undefined
}

