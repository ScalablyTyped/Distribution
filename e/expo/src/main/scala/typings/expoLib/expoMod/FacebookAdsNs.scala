package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FacebookAds")
@js.native
object FacebookAdsNs extends js.Object {
  @js.native
  class AdIconView ()
    extends reactLib.reactMod.Component[js.Object, js.Object, js.Any]
  
  @js.native
  class AdMediaView ()
    extends reactLib.reactMod.Component[js.Object, js.Object, js.Any]
  
  @js.native
  class AdTriggerView[P] ()
    extends reactLib.reactMod.Component[AdTriggerViewProps[P], js.Object, js.Any]
  
  /**
    * Banner View
    */
  /* Rewritten from type alias, can be one of: 
    - expoLib.expoLibStrings.large
    - expoLib.expoLibStrings.rectangle
    - expoLib.expoLibStrings.standard
  */
  trait AdType extends js.Object
  
  @js.native
  class BannerView ()
    extends reactLib.reactMod.Component[BannerViewProps, js.Object, js.Any]
  
  trait BannerViewProps extends js.Object {
    var placementId: java.lang.String
    var `type`: AdType
    def onError(): scala.Unit
    def onPress(): scala.Unit
  }
  
  /**
    * Native Ads
    */
  /* Rewritten from type alias, can be one of: 
    - expoLib.expoLibStrings.none
    - expoLib.expoLibStrings.icon
    - expoLib.expoLibStrings.image
    - expoLib.expoLibStrings.all
  */
  trait MediaCachePolicy extends js.Object
  
  trait NativeAd extends js.Object {
    /**
      * The word "ad", translated into the viewer's language
      */
    var adTranslation: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the Facebook Page or mobile app that represents the business running the ad
      */
    var advertiserName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The body text, truncated to 90 characters, that contains the text the advertiser entered when
      * they created their ad to tell people what the ad promotes
      */
    var bodyText: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The call-to-action phrase of the ad, such as, "Install Now"
      */
    var callToActionText: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The headline the advertiser entered when they created their ad. This is usually the ad's main
      * title.
      */
    var headline: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The link description which is additional information that the advertiser may have entered
      */
    var linkDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The word "promoted", translated into the viewer's language
      */
    var promotedTranslation: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ad's social context, such as, "Over half a million users"
      */
    var socialContext: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The word "sponsored", translated into the viewer's language
      */
    var sponsoredTranslation: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class NativeAdsManager protected () extends js.Object {
    def this(placementId: java.lang.String) = this()
    def this(placementId: java.lang.String, numberOfAdsToRequest: scala.Double) = this()
    def disableAutoRefresh(): scala.Unit = js.native
    def setMediaCachePolicy(cachePolicy: MediaCachePolicy): scala.Unit = js.native
  }
  
  def withNativeAd[P](component: reactLib.reactMod.Component[P with expoLib.Anon_NativeAd, js.Object, _]): reactLib.reactMod.Component[expoLib.Anon_Ad with P, expoLib.Anon_AdCanRequestAds, _] = js.native
  /**
    * Ad Settings
    */
  @JSName("AdSettings")
  @js.native
  object AdSettingsNs extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - expoLib.expoLibStrings.none
      - expoLib.expoLibStrings.debug
      - expoLib.expoLibStrings.verbose
      - expoLib.expoLibStrings.warning
      - expoLib.expoLibStrings.error
      - expoLib.expoLibStrings.notification
    */
    trait SDKLogLevel extends js.Object
    
    val currentDeviceHash: java.lang.String = js.native
    def addTestDevice(device: java.lang.String): scala.Unit = js.native
    def clearTestDevices(): scala.Unit = js.native
    def setIsChildDirected(isDirected: scala.Boolean): scala.Unit = js.native
    def setLogLevel(logLevel: SDKLogLevel): scala.Unit = js.native
    def setMediationService(mediationService: java.lang.String): scala.Unit = js.native
    def setUrlPrefix(urlPrefix: java.lang.String): scala.Unit = js.native
  }
  
  /**
    * Interstitial Ads
    */
  @JSName("InterstitialAdManager")
  @js.native
  object InterstitialAdManagerNs extends js.Object {
    def showAd(placementId: java.lang.String): js.Promise[scala.Boolean] = js.native
  }
  
  type AdTriggerViewProps[P] = expoLib.Anon_Props[P] with P
}

