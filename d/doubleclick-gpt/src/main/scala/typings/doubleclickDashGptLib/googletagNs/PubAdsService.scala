package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubAdsService extends Service {
  def clear(): scala.Boolean = js.native
  def clear(opt_slots: js.Array[Slot]): scala.Boolean = js.native
  def clearCategoryExclusions(): PubAdsService = js.native
  def clearTagForChildDirectedTreatment(): PubAdsService = js.native
  def clearTargeting(): PubAdsService = js.native
  def clearTargeting(opt_key: java.lang.String): PubAdsService = js.native
  def collapseEmptyDivs(): scala.Boolean = js.native
  def collapseEmptyDivs(opt_collapseBeforeAdFetch: scala.Boolean): scala.Boolean = js.native
  def defineOutOfPagePassback(adUnitPath: java.lang.String): PassbackSlot = js.native
  def definePassback(adUnitPath: java.lang.String, size: GeneralSize): PassbackSlot = js.native
  def disableInitialLoad(): scala.Unit = js.native
  def display(adUnitPath: java.lang.String, size: GeneralSize): Slot = js.native
  def display(adUnitPath: java.lang.String, size: GeneralSize, opt_div: java.lang.String): Slot = js.native
  def display(
    adUnitPath: java.lang.String,
    size: GeneralSize,
    opt_div: java.lang.String,
    opt_clickUrl: java.lang.String
  ): Slot = js.native
  def display(adUnitPath: java.lang.String, size: GeneralSize, opt_div: stdLib.Element): Slot = js.native
  def display(
    adUnitPath: java.lang.String,
    size: GeneralSize,
    opt_div: stdLib.Element,
    opt_clickUrl: java.lang.String
  ): Slot = js.native
  def enableAsyncRendering(): scala.Boolean = js.native
  def enableLazyLoad(): scala.Unit = js.native
  def enableLazyLoad(opt_config: LazyLoadOptionsConfig): scala.Unit = js.native
  def enableSingleRequest(): scala.Boolean = js.native
  def enableSyncRendering(): scala.Boolean = js.native
  def enableVideoAds(): scala.Unit = js.native
  def get(key: java.lang.String): java.lang.String | scala.Null = js.native
  def getAttributeKeys(): js.Array[java.lang.String] = js.native
  def getTargeting(key: java.lang.String): js.Array[java.lang.String] = js.native
  def getTargetingKeys(): js.Array[java.lang.String] = js.native
  def refresh(): scala.Unit = js.native
  def refresh(opt_slots: js.Array[Slot]): scala.Unit = js.native
  def refresh(opt_slots: js.Array[Slot], opt_options: doubleclickDashGptLib.Anon_ChangeCorrelator): scala.Unit = js.native
  def set(key: java.lang.String, value: java.lang.String): PubAdsService = js.native
  def setCategoryExclusion(categoryExclusion: java.lang.String): PubAdsService = js.native
  def setCentering(centerAds: scala.Boolean): scala.Unit = js.native
  def setCookieOptions(cookieOptions: scala.Double): PubAdsService = js.native
  def setForceSafeFrame(forceSafeFrame: scala.Boolean): PubAdsService = js.native
  def setLocation(latitudeOrAddress: java.lang.String): PubAdsService = js.native
  def setLocation(latitudeOrAddress: java.lang.String, opt_longitude: scala.Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: java.lang.String, opt_longitude: scala.Double, opt_radius: scala.Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: scala.Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: scala.Double, opt_longitude: scala.Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: scala.Double, opt_longitude: scala.Double, opt_radius: scala.Double): PubAdsService = js.native
  def setPublisherProvidedId(ppid: java.lang.String): PubAdsService = js.native
  @JSName("setRequestNonPersonalizedAds")
  def setRequestNonPersonalizedAds_0(nonPersonalizedAds: doubleclickDashGptLib.doubleclickDashGptLibNumbers.`0`): PubAdsService = js.native
  @JSName("setRequestNonPersonalizedAds")
  def setRequestNonPersonalizedAds_1(nonPersonalizedAds: doubleclickDashGptLib.doubleclickDashGptLibNumbers.`1`): PubAdsService = js.native
  def setSafeFrameConfig(config: SafeFrameConfig): PubAdsService = js.native
  def setTagForChildDirectedTreatment(value: scala.Double): PubAdsService = js.native
  def setTagForUnderAgeOfConsent(): PubAdsService = js.native
  def setTagForUnderAgeOfConsent(opt_value: scala.Double): PubAdsService = js.native
  def setTargeting(key: java.lang.String, value: java.lang.String): PubAdsService = js.native
  def setTargeting(key: java.lang.String, value: js.Array[java.lang.String]): PubAdsService = js.native
  def setVideoContent(videoContentId: java.lang.String, videoCmsId: java.lang.String): scala.Unit = js.native
  def updateCorrelator(): PubAdsService = js.native
}

