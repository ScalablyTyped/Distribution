package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expoMod {
  type AdMobBannerSize = expoLib.expoLibStrings.banner | expoLib.expoLibStrings.largeBanner | expoLib.expoLibStrings.mediumRectangle | expoLib.expoLibStrings.fullBanner | expoLib.expoLibStrings.leaderboard | expoLib.expoLibStrings.smartBannerPortrait | expoLib.expoLibStrings.smartBannerLandscape
  type AdMobInterstitialEmptyEvent = expoLib.expoLibStrings.interstitialDidLoad | expoLib.expoLibStrings.interstitialDidOpen | expoLib.expoLibStrings.interstitialDidClose | expoLib.expoLibStrings.interstitialWillLeaveApplication
  type AdMobInterstitialEvent = AdMobInterstitialEmptyEvent | expoLib.expoLibStrings.interstitialDidFailToLoad
  type AdMobRewardedEmptyEvent = expoLib.expoLibStrings.rewardedVideoDidLoad | expoLib.expoLibStrings.rewardedVideoDidOpen | expoLib.expoLibStrings.rewardedVideoDidStart | expoLib.expoLibStrings.rewardedVideoDidClose | expoLib.expoLibStrings.rewardedVideoWillLeaveApplication
  type AdMobRewardedEvent = AdMobRewardedEmptyEvent | expoLib.expoLibStrings.rewardedVideoDidRewardUser | expoLib.expoLibStrings.rewardedVideoDidFailToLoad
  type Axis = scala.Double
  type BarCodeScannedCallback = js.Function1[/* result */ expoLib.Anon_Data, scala.Unit]
  type Md5 = java.lang.String
  type Orientation = expoLib.expoLibStrings.portrait | expoLib.expoLibStrings.landscape
  type PlaybackSource = RequireSource | expoLib.Anon_Uri | Asset
  type PlaybackStatus = expoLib.Anon_AndroidImplementation | expoLib.Anon_AndroidImplementationDidJustFinish
  type RequireSource = reactDashNativeLib.reactDashNativeMod.ImageRequireSource
  type ResizeModeContain = expoLib.expoLibStrings.contain
  type ResizeModeCover = expoLib.expoLibStrings.cover
  type ResizeModeStretch = expoLib.expoLibStrings.stretch
  type URISource = reactDashNativeLib.reactDashNativeMod.ImageURISource
}
