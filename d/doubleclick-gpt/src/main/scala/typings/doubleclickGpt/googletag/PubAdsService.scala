package typings.doubleclickGpt.googletag

import typings.doubleclickGpt.anon.ChangeCorrelator
import typings.doubleclickGpt.anon.RestrictDataProcessing
import typings.doubleclickGpt.doubleclickGptNumbers.`0`
import typings.doubleclickGpt.doubleclickGptNumbers.`1`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubAdsService extends Service {
  def clear(): Boolean = js.native
  def clear(opt_slots: js.Array[Slot]): Boolean = js.native
  def clearCategoryExclusions(): PubAdsService = js.native
  def clearTagForChildDirectedTreatment(): PubAdsService = js.native
  def clearTargeting(): PubAdsService = js.native
  def clearTargeting(opt_key: String): PubAdsService = js.native
  def collapseEmptyDivs(): Boolean = js.native
  def collapseEmptyDivs(opt_collapseBeforeAdFetch: Boolean): Boolean = js.native
  def defineOutOfPagePassback(adUnitPath: String): PassbackSlot = js.native
  def definePassback(adUnitPath: String, size: GeneralSize): PassbackSlot = js.native
  def disableInitialLoad(): Unit = js.native
  def display(adUnitPath: String, size: GeneralSize): Slot = js.native
  def display(adUnitPath: String, size: GeneralSize, opt_div: js.UndefOr[scala.Nothing], opt_clickUrl: String): Slot = js.native
  def display(adUnitPath: String, size: GeneralSize, opt_div: String): Slot = js.native
  def display(adUnitPath: String, size: GeneralSize, opt_div: String, opt_clickUrl: String): Slot = js.native
  def display(adUnitPath: String, size: GeneralSize, opt_div: Element): Slot = js.native
  def display(adUnitPath: String, size: GeneralSize, opt_div: Element, opt_clickUrl: String): Slot = js.native
  def enableAsyncRendering(): Boolean = js.native
  def enableLazyLoad(): Unit = js.native
  def enableLazyLoad(opt_config: LazyLoadOptionsConfig): Unit = js.native
  def enableSingleRequest(): Boolean = js.native
  def enableSyncRendering(): Boolean = js.native
  def enableVideoAds(): Unit = js.native
  def get(key: String): String | Null = js.native
  def getAttributeKeys(): js.Array[String] = js.native
  def getTargeting(key: String): js.Array[String] = js.native
  def getTargetingKeys(): js.Array[String] = js.native
  def refresh(): Unit = js.native
  def refresh(opt_slots: js.UndefOr[scala.Nothing], opt_options: ChangeCorrelator): Unit = js.native
  def refresh(opt_slots: js.Array[Slot]): Unit = js.native
  def refresh(opt_slots: js.Array[Slot], opt_options: ChangeCorrelator): Unit = js.native
  def set(key: String, value: String): PubAdsService = js.native
  def setCategoryExclusion(categoryExclusion: String): PubAdsService = js.native
  def setCentering(centerAds: Boolean): Unit = js.native
  def setCookieOptions(cookieOptions: Double): PubAdsService = js.native
  def setForceSafeFrame(forceSafeFrame: Boolean): PubAdsService = js.native
  def setLocation(latitudeOrAddress: String): PubAdsService = js.native
  def setLocation(latitudeOrAddress: String, opt_longitude: js.UndefOr[scala.Nothing], opt_radius: Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: String, opt_longitude: Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: String, opt_longitude: Double, opt_radius: Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: Double, opt_longitude: js.UndefOr[scala.Nothing], opt_radius: Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: Double, opt_longitude: Double): PubAdsService = js.native
  def setLocation(latitudeOrAddress: Double, opt_longitude: Double, opt_radius: Double): PubAdsService = js.native
  def setPrivacySettings(settings: RestrictDataProcessing): Slot = js.native
  def setPublisherProvidedId(ppid: String): PubAdsService = js.native
  @JSName("setRequestNonPersonalizedAds")
  def setRequestNonPersonalizedAds_0(nonPersonalizedAds: `0`): PubAdsService = js.native
  @JSName("setRequestNonPersonalizedAds")
  def setRequestNonPersonalizedAds_1(nonPersonalizedAds: `1`): PubAdsService = js.native
  def setSafeFrameConfig(config: SafeFrameConfig): PubAdsService = js.native
  def setTagForChildDirectedTreatment(value: Double): PubAdsService = js.native
  def setTagForUnderAgeOfConsent(): PubAdsService = js.native
  def setTagForUnderAgeOfConsent(opt_value: Double): PubAdsService = js.native
  def setTargeting(key: String, value: String): PubAdsService = js.native
  def setTargeting(key: String, value: js.Array[String]): PubAdsService = js.native
  def setVideoContent(videoContentId: String, videoCmsId: String): Unit = js.native
  def updateCorrelator(): PubAdsService = js.native
}

