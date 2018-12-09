package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FacebookAds")
@js.native
object FacebookAdsNs extends js.Object {
  @js.native
  class BannerView ()
    extends reactLib.reactMod.Component[BannerViewProps, js.Object, js.Any]
  
  
  trait BannerViewProps extends js.Object {
    var placementId: java.lang.String
    var `type`: AdType
    def onError(): scala.Unit
    def onPress(): scala.Unit
  }
  
  @js.native
  class NativeAdsManager protected () extends js.Object {
    def this(placementId: java.lang.String) = this()
    def this(placementId: java.lang.String, numberOfAdsToRequest: scala.Double) = this()
    def disableAutoRefresh(): scala.Unit = js.native
    def setMediaCachePolicy(cachePolicy: MediaCachePolicy): scala.Unit = js.native
  }
  
  def withNativeAd(component: reactLib.reactMod.Component[expoLib.Anon_Subtitle, js.Object, _]): reactLib.reactMod.Component[expoLib.Anon_AdsManager, expoLib.Anon_Ad, _] = js.native
  /**
       * Ad Settings
       */
  @JSName("AdSettings")
  @js.native
  object AdSettingsNs extends js.Object {
    val currentDeviceHash: java.lang.String = js.native
    def addTestDevice(device: java.lang.String): scala.Unit = js.native
    def clearTestDevices(): scala.Unit = js.native
    def setIsChildDirected(isDirected: scala.Boolean): scala.Unit = js.native
    def setLogLevel(logLevel: SDKLogLevel): scala.Unit = js.native
    def setMediationService(mediationService: java.lang.String): scala.Unit = js.native
    def setUrlPrefix(urlPrefix: java.lang.String): scala.Unit = js.native
    type SDKLogLevel = expoLib.expoLibStrings.none | expoLib.expoLibStrings.debug | expoLib.expoLibStrings.verbose | expoLib.expoLibStrings.warning | expoLib.expoLibStrings.error | expoLib.expoLibStrings.notification
  }
  
  /**
       * Interstitial Ads
       */
  @JSName("InterstitialAdManager")
  @js.native
  object InterstitialAdManagerNs extends js.Object {
    def showAd(placementId: java.lang.String): js.Promise[scala.Boolean] = js.native
  }
  
  /**
       * Banner View
       */
  type AdType = expoLib.expoLibStrings.large | expoLib.expoLibStrings.rectangle | expoLib.expoLibStrings.standard
  /**
       * Native Ads
       */
  type MediaCachePolicy = expoLib.expoLibStrings.none | expoLib.expoLibStrings.icon | expoLib.expoLibStrings.image | expoLib.expoLibStrings.all
}

