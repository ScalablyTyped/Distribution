package typings.doubleclickGpt

import typings.doubleclickGpt.anon.ChangeCorrelator
import typings.doubleclickGpt.doubleclickGptInts.`0`
import typings.doubleclickGpt.doubleclickGptInts.`1`
import typings.doubleclickGpt.doubleclickGptStrings.slotRenderEnded
import typings.doubleclickGpt.doubleclickGptStrings.slotRequested
import typings.doubleclickGpt.doubleclickGptStrings.slotResponseReceived
import typings.doubleclickGpt.doubleclickGptStrings.slotVisibilityChanged
import typings.doubleclickGpt.googletag.events.Event
import typings.doubleclickGpt.googletag.events.SlotRenderEndedEvent
import typings.doubleclickGpt.googletag.events.SlotRequestedEvent
import typings.doubleclickGpt.googletag.events.SlotResponseReceived
import typings.doubleclickGpt.googletag.events.SlotVisibilityChangedEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googletag {
  
  trait CommandArray extends StObject {
    
    def push(f: js.Function0[Unit]): Double
  }
  object CommandArray {
    
    inline def apply(push: js.Function0[Unit] => Double): CommandArray = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[CommandArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandArray] (val x: Self) extends AnyVal {
      
      inline def setPush(value: js.Function0[Unit] => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CompanionAdsService
    extends StObject
       with Service {
    
    def enableSyncLoading(): Unit = js.native
    
    def setRefreshUnfilledSlots(value: Boolean): Unit = js.native
  }
  
  @js.native
  trait ContentService
    extends StObject
       with Service {
    
    def setContent(slot: Slot, content: String): Unit = js.native
  }
  
  type GeneralSize = SingleSize | MultiSize
  
  @js.native
  trait Googletag extends StObject {
    
    var apiReady: Boolean = js.native
    
    var cmd: CommandArray = js.native
    
    def companionAds(): CompanionAdsService = js.native
    
    def content(): ContentService = js.native
    
    def defineOutOfPageSlot(adUnitPath: String): Slot = js.native
    def defineOutOfPageSlot(adUnitPath: String, opt_div: String): Slot = js.native
    
    def defineSlot(adUnitPath: String, size: GeneralSize): Slot = js.native
    def defineSlot(adUnitPath: String, size: GeneralSize, opt_div: String): Slot = js.native
    
    def destroySlots(): Boolean = js.native
    def destroySlots(opt_slots: js.Array[Slot]): Boolean = js.native
    
    def disablePublisherConsole(): Unit = js.native
    
    def display(): Unit = js.native
    def display(divOrSlot: String): Unit = js.native
    def display(divOrSlot: Slot): Unit = js.native
    def display(divOrSlot: Element): Unit = js.native
    
    def enableServices(): Unit = js.native
    
    def getVersion(): String = js.native
    
    def openConsole(): Unit = js.native
    def openConsole(opt_div: String): Unit = js.native
    
    def pubads(): PubAdsService = js.native
    
    var pubadsReady: Boolean = js.native
    
    def setAdIframeTitle(title: String): Unit = js.native
    
    def sizeMapping(): SizeMappingBuilder = js.native
  }
  
  trait LazyLoadOptionsConfig extends StObject {
    
    var fetchMarginPercent: js.UndefOr[Double] = js.undefined
    
    var mobileScaling: js.UndefOr[Double] = js.undefined
    
    var renderMarginPercent: js.UndefOr[Double] = js.undefined
  }
  object LazyLoadOptionsConfig {
    
    inline def apply(): LazyLoadOptionsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyLoadOptionsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LazyLoadOptionsConfig] (val x: Self) extends AnyVal {
      
      inline def setFetchMarginPercent(value: Double): Self = StObject.set(x, "fetchMarginPercent", value.asInstanceOf[js.Any])
      
      inline def setFetchMarginPercentUndefined: Self = StObject.set(x, "fetchMarginPercent", js.undefined)
      
      inline def setMobileScaling(value: Double): Self = StObject.set(x, "mobileScaling", value.asInstanceOf[js.Any])
      
      inline def setMobileScalingUndefined: Self = StObject.set(x, "mobileScaling", js.undefined)
      
      inline def setRenderMarginPercent(value: Double): Self = StObject.set(x, "renderMarginPercent", value.asInstanceOf[js.Any])
      
      inline def setRenderMarginPercentUndefined: Self = StObject.set(x, "renderMarginPercent", js.undefined)
    }
  }
  
  type MultiSize = js.Array[SingleSize]
  
  type NamedSize = String | js.Array[String]
  
  @js.native
  trait PassbackSlot extends StObject {
    
    def display(): Unit = js.native
    
    def get(key: String): String = js.native
    
    def set(key: String, value: String): PassbackSlot = js.native
    
    def setClickUrl(url: String): PassbackSlot = js.native
    
    def setForceSafeFrame(forceSafeFrame: Boolean): PassbackSlot = js.native
    
    def setTagForChildDirectedTreatment(value: Double): PassbackSlot = js.native
    
    def setTagForUnderAgeOfConsent(value: Double): PassbackSlot = js.native
    
    def setTargeting(key: String, value: String): PassbackSlot = js.native
    def setTargeting(key: String, value: js.Array[String]): PassbackSlot = js.native
    
    def updateTargetingFromMap(map: js.Object): PassbackSlot = js.native
  }
  
  trait PrivacySettingsConfig extends StObject {
    
    var childDirectedTreatment: js.UndefOr[Boolean | Null] = js.undefined
    
    var limitedAds: js.UndefOr[Boolean | Null] = js.undefined
    
    var restrictDataProcessing: js.UndefOr[Boolean | Null] = js.undefined
    
    var underAgeOfConsent: js.UndefOr[Boolean | Null] = js.undefined
  }
  object PrivacySettingsConfig {
    
    inline def apply(): PrivacySettingsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivacySettingsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivacySettingsConfig] (val x: Self) extends AnyVal {
      
      inline def setChildDirectedTreatment(value: Boolean): Self = StObject.set(x, "childDirectedTreatment", value.asInstanceOf[js.Any])
      
      inline def setChildDirectedTreatmentNull: Self = StObject.set(x, "childDirectedTreatment", null)
      
      inline def setChildDirectedTreatmentUndefined: Self = StObject.set(x, "childDirectedTreatment", js.undefined)
      
      inline def setLimitedAds(value: Boolean): Self = StObject.set(x, "limitedAds", value.asInstanceOf[js.Any])
      
      inline def setLimitedAdsNull: Self = StObject.set(x, "limitedAds", null)
      
      inline def setLimitedAdsUndefined: Self = StObject.set(x, "limitedAds", js.undefined)
      
      inline def setRestrictDataProcessing(value: Boolean): Self = StObject.set(x, "restrictDataProcessing", value.asInstanceOf[js.Any])
      
      inline def setRestrictDataProcessingNull: Self = StObject.set(x, "restrictDataProcessing", null)
      
      inline def setRestrictDataProcessingUndefined: Self = StObject.set(x, "restrictDataProcessing", js.undefined)
      
      inline def setUnderAgeOfConsent(value: Boolean): Self = StObject.set(x, "underAgeOfConsent", value.asInstanceOf[js.Any])
      
      inline def setUnderAgeOfConsentNull: Self = StObject.set(x, "underAgeOfConsent", null)
      
      inline def setUnderAgeOfConsentUndefined: Self = StObject.set(x, "underAgeOfConsent", js.undefined)
    }
  }
  
  @js.native
  trait PubAdsService
    extends StObject
       with Service {
    
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
    def display(adUnitPath: String, size: GeneralSize, opt_div: String): Slot = js.native
    def display(adUnitPath: String, size: GeneralSize, opt_div: String, opt_clickUrl: String): Slot = js.native
    def display(adUnitPath: String, size: GeneralSize, opt_div: Unit, opt_clickUrl: String): Slot = js.native
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
    def refresh(opt_slots: js.Array[Slot]): Unit = js.native
    def refresh(opt_slots: js.Array[Slot], opt_options: ChangeCorrelator): Unit = js.native
    def refresh(opt_slots: Unit, opt_options: ChangeCorrelator): Unit = js.native
    
    def set(key: String, value: String): PubAdsService = js.native
    
    def setCategoryExclusion(categoryExclusion: String): PubAdsService = js.native
    
    def setCentering(centerAds: Boolean): Unit = js.native
    
    def setCookieOptions(cookieOptions: Double): PubAdsService = js.native
    
    def setForceSafeFrame(forceSafeFrame: Boolean): PubAdsService = js.native
    
    def setLocation(latitudeOrAddress: String): PubAdsService = js.native
    def setLocation(latitudeOrAddress: String, opt_longitude: Double): PubAdsService = js.native
    def setLocation(latitudeOrAddress: String, opt_longitude: Double, opt_radius: Double): PubAdsService = js.native
    def setLocation(latitudeOrAddress: String, opt_longitude: Unit, opt_radius: Double): PubAdsService = js.native
    def setLocation(latitudeOrAddress: Double): PubAdsService = js.native
    def setLocation(latitudeOrAddress: Double, opt_longitude: Double): PubAdsService = js.native
    def setLocation(latitudeOrAddress: Double, opt_longitude: Double, opt_radius: Double): PubAdsService = js.native
    def setLocation(latitudeOrAddress: Double, opt_longitude: Unit, opt_radius: Double): PubAdsService = js.native
    
    def setPrivacySettings(settings: PrivacySettingsConfig): Slot = js.native
    
    def setPublisherProvidedId(ppid: String): PubAdsService = js.native
    
    def setRequestNonPersonalizedAds(nonPersonalizedAds: `0` | `1`): PubAdsService = js.native
    
    def setSafeFrameConfig(config: SafeFrameConfig): PubAdsService = js.native
    
    def setTagForChildDirectedTreatment(value: Double): PubAdsService = js.native
    
    def setTagForUnderAgeOfConsent(): PubAdsService = js.native
    def setTagForUnderAgeOfConsent(opt_value: Double): PubAdsService = js.native
    
    def setTargeting(key: String, value: String): PubAdsService = js.native
    def setTargeting(key: String, value: js.Array[String]): PubAdsService = js.native
    
    def setVideoContent(videoContentId: String, videoCmsId: String): Unit = js.native
    
    def updateCorrelator(): PubAdsService = js.native
  }
  
  trait ResponseInformation extends StObject {
    
    var advertiserId: String
    
    var campaignId: String
    
    var creativeId: js.UndefOr[Double] = js.undefined
    
    var creativeTemplateId: js.UndefOr[Double] = js.undefined
    
    var lineItemId: js.UndefOr[Double] = js.undefined
  }
  object ResponseInformation {
    
    inline def apply(advertiserId: String, campaignId: String): ResponseInformation = {
      val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseInformation] (val x: Self) extends AnyVal {
      
      inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
      
      inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      inline def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
      
      inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
      
      inline def setCreativeTemplateId(value: Double): Self = StObject.set(x, "creativeTemplateId", value.asInstanceOf[js.Any])
      
      inline def setCreativeTemplateIdUndefined: Self = StObject.set(x, "creativeTemplateId", js.undefined)
      
      inline def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
      
      inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    }
  }
  
  trait SafeFrameConfig extends StObject {
    
    var allowOverlayExpansion: js.UndefOr[Boolean] = js.undefined
    
    var allowPushExpansion: js.UndefOr[Boolean] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var useUniqueDomain: js.UndefOr[Boolean | Null] = js.undefined
  }
  object SafeFrameConfig {
    
    inline def apply(): SafeFrameConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeFrameConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SafeFrameConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowOverlayExpansion(value: Boolean): Self = StObject.set(x, "allowOverlayExpansion", value.asInstanceOf[js.Any])
      
      inline def setAllowOverlayExpansionUndefined: Self = StObject.set(x, "allowOverlayExpansion", js.undefined)
      
      inline def setAllowPushExpansion(value: Boolean): Self = StObject.set(x, "allowPushExpansion", value.asInstanceOf[js.Any])
      
      inline def setAllowPushExpansionUndefined: Self = StObject.set(x, "allowPushExpansion", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setUseUniqueDomain(value: Boolean): Self = StObject.set(x, "useUniqueDomain", value.asInstanceOf[js.Any])
      
      inline def setUseUniqueDomainNull: Self = StObject.set(x, "useUniqueDomain", null)
      
      inline def setUseUniqueDomainUndefined: Self = StObject.set(x, "useUniqueDomain", js.undefined)
    }
  }
  
  @js.native
  trait Service extends StObject {
    
    def addEventListener(eventType: String, listener: js.Function1[/* event */ Event, Unit]): Service = js.native
    @JSName("addEventListener")
    def addEventListener_slotRenderEnded(eventType: slotRenderEnded, listener: js.Function1[/* event */ SlotRenderEndedEvent, Unit]): Service = js.native
    @JSName("addEventListener")
    def addEventListener_slotRequested(eventType: slotRequested, listener: js.Function1[/* event */ SlotRequestedEvent, Unit]): Service = js.native
    @JSName("addEventListener")
    def addEventListener_slotResponseReceived(eventType: slotResponseReceived, listener: js.Function1[/* event */ SlotResponseReceived, Unit]): Service = js.native
    @JSName("addEventListener")
    def addEventListener_slotVisibilityChanged(
      eventType: slotVisibilityChanged,
      listener: js.Function1[/* event */ SlotVisibilityChangedEvent, Unit]
    ): Service = js.native
    
    def getSlots(): js.Array[Slot] = js.native
    
    def removeEventListener(eventType: String, listener: js.Function1[/* event */ Event, Unit]): Service = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotRenderEnded(eventType: slotRenderEnded, listener: js.Function1[/* event */ SlotRenderEndedEvent, Unit]): Service = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotRequested(eventType: slotRequested, listener: js.Function1[/* event */ SlotRequestedEvent, Unit]): Service = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotResponseReceived(eventType: slotResponseReceived, listener: js.Function1[/* event */ SlotResponseReceived, Unit]): Service = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotVisibilityChanged(
      eventType: slotVisibilityChanged,
      listener: js.Function1[/* event */ SlotVisibilityChangedEvent, Unit]
    ): Service = js.native
  }
  
  type SingleSize = SingleSizeArray | NamedSize
  
  type SingleSizeArray = js.Array[Double]
  
  type SizeMapping = js.Array[GeneralSize]
  
  type SizeMappingArray = js.Array[SizeMapping]
  
  trait SizeMappingBuilder extends StObject {
    
    def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder
    
    def build(): SizeMappingArray
  }
  object SizeMappingBuilder {
    
    inline def apply(addSize: (SingleSizeArray, GeneralSize) => SizeMappingBuilder, build: () => SizeMappingArray): SizeMappingBuilder = {
      val __obj = js.Dynamic.literal(addSize = js.Any.fromFunction2(addSize), build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[SizeMappingBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeMappingBuilder] (val x: Self) extends AnyVal {
      
      inline def setAddSize(value: (SingleSizeArray, GeneralSize) => SizeMappingBuilder): Self = StObject.set(x, "addSize", js.Any.fromFunction2(value))
      
      inline def setBuild(value: () => SizeMappingArray): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Slot extends StObject {
    
    def addService(service: Service): Slot = js.native
    
    def clearCategoryExclusions(): Slot = js.native
    
    def clearTargeting(): Slot = js.native
    def clearTargeting(opt_key: String): Slot = js.native
    
    def defineSizeMapping(sizeMapping: SizeMappingArray): Slot = js.native
    
    def get(key: String): String | Null = js.native
    
    def getAdUnitPath(): String = js.native
    
    def getAttributeKeys(): js.Array[String] = js.native
    
    def getCategoryExclusions(): js.Array[String] = js.native
    
    def getResponseInformation(): ResponseInformation = js.native
    
    def getSlotElementId(): String = js.native
    
    def getTargeting(key: String): js.Array[String] = js.native
    
    def getTargetingKeys(): js.Array[String] = js.native
    
    def set(key: String, value: String): Slot = js.native
    
    def setCategoryExclusion(categoryExclusion: String): Slot = js.native
    
    def setClickUrl(value: String): Slot = js.native
    
    def setCollapseEmptyDiv(collapse: Boolean): Slot = js.native
    def setCollapseEmptyDiv(collapse: Boolean, opt_collapseBeforeAdFetch: Boolean): Slot = js.native
    
    def setForceSafeFrame(forceSafeFrame: Boolean): Slot = js.native
    
    def setSafeFrameConfig(config: SafeFrameConfig): Slot = js.native
    
    def setTargeting(key: String, value: String): Slot = js.native
    def setTargeting(key: String, value: js.Array[String]): Slot = js.native
    
    def updateTargetingFromMap(map: js.Object): Slot = js.native
  }
  
  object events {
    
    trait Event extends StObject {
      
      var serviceName: String
      
      var slot: Slot
    }
    object Event {
      
      inline def apply(serviceName: String, slot: Slot): Event = {
        val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
        
        inline def setSlot(value: Slot): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type ImpressionViewableEvent = Event
    
    // tslint:disable-next-line:no-empty-interface
    type SlotOnloadEvent = Event
    
    trait SlotRenderEndedEvent
      extends StObject
         with Event {
      
      var advertiserId: js.UndefOr[Double] = js.undefined
      
      var campaignId: js.UndefOr[Double] = js.undefined
      
      var creativeId: js.UndefOr[Double] = js.undefined
      
      var isEmpty: Boolean
      
      var lineItemId: js.UndefOr[Double] = js.undefined
      
      var size: js.Array[Double] | String
      
      var sourceAgnosticCreativeId: js.UndefOr[Double] = js.undefined
      
      var sourceAgnosticLineItemId: js.UndefOr[Double] = js.undefined
    }
    object SlotRenderEndedEvent {
      
      inline def apply(isEmpty: Boolean, serviceName: String, size: js.Array[Double] | String, slot: Slot): SlotRenderEndedEvent = {
        val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
        __obj.asInstanceOf[SlotRenderEndedEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SlotRenderEndedEvent] (val x: Self) extends AnyVal {
        
        inline def setAdvertiserId(value: Double): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
        
        inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
        
        inline def setCampaignId(value: Double): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
        
        inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
        
        inline def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
        
        inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
        
        inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
        
        inline def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
        
        inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
        
        inline def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
        
        inline def setSourceAgnosticCreativeId(value: Double): Self = StObject.set(x, "sourceAgnosticCreativeId", value.asInstanceOf[js.Any])
        
        inline def setSourceAgnosticCreativeIdUndefined: Self = StObject.set(x, "sourceAgnosticCreativeId", js.undefined)
        
        inline def setSourceAgnosticLineItemId(value: Double): Self = StObject.set(x, "sourceAgnosticLineItemId", value.asInstanceOf[js.Any])
        
        inline def setSourceAgnosticLineItemIdUndefined: Self = StObject.set(x, "sourceAgnosticLineItemId", js.undefined)
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type SlotRequestedEvent = Event
    
    // tslint:disable-next-line:no-empty-interface
    type SlotResponseReceived = Event
    
    trait SlotVisibilityChangedEvent
      extends StObject
         with Event {
      
      var inViewPercentage: Double
    }
    object SlotVisibilityChangedEvent {
      
      inline def apply(inViewPercentage: Double, serviceName: String, slot: Slot): SlotVisibilityChangedEvent = {
        val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
        __obj.asInstanceOf[SlotVisibilityChangedEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SlotVisibilityChangedEvent] (val x: Self) extends AnyVal {
        
        inline def setInViewPercentage(value: Double): Self = StObject.set(x, "inViewPercentage", value.asInstanceOf[js.Any])
      }
    }
  }
}
