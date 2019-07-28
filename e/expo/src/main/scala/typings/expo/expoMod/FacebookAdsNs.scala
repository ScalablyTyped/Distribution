package typings.expo.expoMod

import typings.expo.Anon_Ad
import typings.expo.Anon_AdCanRequestAds
import typings.expo.Anon_NativeAd
import typings.expo.Anon_Props
import typings.expo.expoMod.FacebookAdsNs.AdSettingsNs.SDKLogLevel
import typings.expo.expoMod.FacebookAdsNs.AdTriggerViewProps
import typings.expo.expoMod.FacebookAdsNs.AdType
import typings.expo.expoMod.FacebookAdsNs.BannerViewProps
import typings.expo.expoMod.FacebookAdsNs.MediaCachePolicy
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FacebookAds")
@js.native
object FacebookAdsNs extends js.Object {
  @js.native
  class AdIconView ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class AdMediaView ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class AdTriggerView[P] ()
    extends Component[AdTriggerViewProps[P], js.Object, js.Any]
  
  /**
    * Banner View
    */
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoStrings.large
    - typings.expo.expoStrings.rectangle
    - typings.expo.expoStrings.standard
  */
  trait AdType extends js.Object
  
  @js.native
  class BannerView ()
    extends Component[BannerViewProps, js.Object, js.Any]
  
  trait BannerViewProps extends js.Object {
    var placementId: String
    var `type`: AdType
    def onError(): Unit
    def onPress(): Unit
  }
  
  /**
    * Native Ads
    */
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoStrings.none
    - typings.expo.expoStrings.icon
    - typings.expo.expoStrings.image
    - typings.expo.expoStrings.all
  */
  trait MediaCachePolicy extends js.Object
  
  trait NativeAd extends js.Object {
    /**
      * The word "ad", translated into the viewer's language
      */
    var adTranslation: js.UndefOr[String] = js.undefined
    /**
      * The name of the Facebook Page or mobile app that represents the business running the ad
      */
    var advertiserName: js.UndefOr[String] = js.undefined
    /**
      * The body text, truncated to 90 characters, that contains the text the advertiser entered when
      * they created their ad to tell people what the ad promotes
      */
    var bodyText: js.UndefOr[String] = js.undefined
    /**
      * The call-to-action phrase of the ad, such as, "Install Now"
      */
    var callToActionText: js.UndefOr[String] = js.undefined
    /**
      * The headline the advertiser entered when they created their ad. This is usually the ad's main
      * title.
      */
    var headline: js.UndefOr[String] = js.undefined
    /**
      * The link description which is additional information that the advertiser may have entered
      */
    var linkDescription: js.UndefOr[String] = js.undefined
    /**
      * The word "promoted", translated into the viewer's language
      */
    var promotedTranslation: js.UndefOr[String] = js.undefined
    /**
      * The ad's social context, such as, "Over half a million users"
      */
    var socialContext: js.UndefOr[String] = js.undefined
    /**
      * The word "sponsored", translated into the viewer's language
      */
    var sponsoredTranslation: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  class NativeAdsManager protected () extends js.Object {
    def this(placementId: String) = this()
    def this(placementId: String, numberOfAdsToRequest: Double) = this()
    def disableAutoRefresh(): Unit = js.native
    def setMediaCachePolicy(cachePolicy: MediaCachePolicy): Unit = js.native
  }
  
  def withNativeAd[P](component: Component[P with Anon_NativeAd, js.Object, _]): Component[Anon_Ad with P, Anon_AdCanRequestAds, _] = js.native
  /**
    * Ad Settings
    */
  @JSName("AdSettings")
  @js.native
  object AdSettingsNs extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - typings.expo.expoStrings.none
      - typings.expo.expoStrings.debug
      - typings.expo.expoStrings.verbose
      - typings.expo.expoStrings.warning
      - typings.expo.expoStrings.error
      - typings.expo.expoStrings.notification
    */
    trait SDKLogLevel extends js.Object
    
    val currentDeviceHash: String = js.native
    def addTestDevice(device: String): Unit = js.native
    def clearTestDevices(): Unit = js.native
    def setIsChildDirected(isDirected: Boolean): Unit = js.native
    def setLogLevel(logLevel: SDKLogLevel): Unit = js.native
    def setMediationService(mediationService: String): Unit = js.native
    def setUrlPrefix(urlPrefix: String): Unit = js.native
  }
  
  /**
    * Interstitial Ads
    */
  @JSName("InterstitialAdManager")
  @js.native
  object InterstitialAdManagerNs extends js.Object {
    def showAd(placementId: String): js.Promise[Boolean] = js.native
  }
  
  type AdTriggerViewProps[P] = Anon_Props[P] with P
}

