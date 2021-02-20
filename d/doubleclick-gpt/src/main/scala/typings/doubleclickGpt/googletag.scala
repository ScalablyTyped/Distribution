package typings.doubleclickGpt

import typings.doubleclickGpt.anon.ChangeCorrelator
import typings.doubleclickGpt.anon.RestrictDataProcessing
import typings.doubleclickGpt.doubleclickGptNumbers.`0`
import typings.doubleclickGpt.doubleclickGptNumbers.`1`
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googletag {
  
  @js.native
  trait CommandArray extends StObject {
    
    def push(f: js.Function0[Unit]): Double = js.native
  }
  object CommandArray {
    
    @scala.inline
    def apply(push: js.Function0[Unit] => Double): CommandArray = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[CommandArray]
    }
    
    @scala.inline
    implicit class CommandArrayMutableBuilder[Self <: CommandArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: js.Function0[Unit] => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CompanionAdsService extends Service {
    
    def enableSyncLoading(): Unit = js.native
    
    def setRefreshUnfilledSlots(value: Boolean): Unit = js.native
  }
  
  @js.native
  trait ContentService extends Service {
    
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
  
  @js.native
  trait LazyLoadOptionsConfig extends StObject {
    
    var fetchMarginPercent: js.UndefOr[Double] = js.native
    
    var mobileScaling: js.UndefOr[Double] = js.native
    
    var renderMarginPercent: js.UndefOr[Double] = js.native
  }
  object LazyLoadOptionsConfig {
    
    @scala.inline
    def apply(): LazyLoadOptionsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyLoadOptionsConfig]
    }
    
    @scala.inline
    implicit class LazyLoadOptionsConfigMutableBuilder[Self <: LazyLoadOptionsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchMarginPercent(value: Double): Self = StObject.set(x, "fetchMarginPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchMarginPercentUndefined: Self = StObject.set(x, "fetchMarginPercent", js.undefined)
      
      @scala.inline
      def setMobileScaling(value: Double): Self = StObject.set(x, "mobileScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileScalingUndefined: Self = StObject.set(x, "mobileScaling", js.undefined)
      
      @scala.inline
      def setRenderMarginPercent(value: Double): Self = StObject.set(x, "renderMarginPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderMarginPercentUndefined: Self = StObject.set(x, "renderMarginPercent", js.undefined)
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
  
  @js.native
  trait ResponseInformation extends StObject {
    
    var advertiserId: String = js.native
    
    var campaignId: String = js.native
    
    var creativeId: js.UndefOr[Double] = js.native
    
    var creativeTemplateId: js.UndefOr[Double] = js.native
    
    var lineItemId: js.UndefOr[Double] = js.native
  }
  object ResponseInformation {
    
    @scala.inline
    def apply(advertiserId: String, campaignId: String): ResponseInformation = {
      val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseInformation]
    }
    
    @scala.inline
    implicit class ResponseInformationMutableBuilder[Self <: ResponseInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
      
      @scala.inline
      def setCreativeTemplateId(value: Double): Self = StObject.set(x, "creativeTemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreativeTemplateIdUndefined: Self = StObject.set(x, "creativeTemplateId", js.undefined)
      
      @scala.inline
      def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    }
  }
  
  @js.native
  trait SafeFrameConfig extends StObject {
    
    var allowOverlayExpansion: js.UndefOr[Boolean] = js.native
    
    var allowPushExpansion: js.UndefOr[Boolean] = js.native
    
    var sandbox: js.UndefOr[Boolean] = js.native
    
    var useUniqueDomain: js.UndefOr[Boolean | Null] = js.native
  }
  object SafeFrameConfig {
    
    @scala.inline
    def apply(): SafeFrameConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeFrameConfig]
    }
    
    @scala.inline
    implicit class SafeFrameConfigMutableBuilder[Self <: SafeFrameConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOverlayExpansion(value: Boolean): Self = StObject.set(x, "allowOverlayExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOverlayExpansionUndefined: Self = StObject.set(x, "allowOverlayExpansion", js.undefined)
      
      @scala.inline
      def setAllowPushExpansion(value: Boolean): Self = StObject.set(x, "allowPushExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPushExpansionUndefined: Self = StObject.set(x, "allowPushExpansion", js.undefined)
      
      @scala.inline
      def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setUseUniqueDomain(value: Boolean): Self = StObject.set(x, "useUniqueDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUniqueDomainNull: Self = StObject.set(x, "useUniqueDomain", null)
      
      @scala.inline
      def setUseUniqueDomainUndefined: Self = StObject.set(x, "useUniqueDomain", js.undefined)
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
  }
  
  type SingleSize = SingleSizeArray | NamedSize
  
  type SingleSizeArray = js.Array[Double]
  
  type SizeMapping = js.Array[GeneralSize]
  
  type SizeMappingArray = js.Array[SizeMapping]
  
  @js.native
  trait SizeMappingBuilder extends StObject {
    
    def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder = js.native
    
    def build(): SizeMappingArray = js.native
  }
  object SizeMappingBuilder {
    
    @scala.inline
    def apply(addSize: (SingleSizeArray, GeneralSize) => SizeMappingBuilder, build: () => SizeMappingArray): SizeMappingBuilder = {
      val __obj = js.Dynamic.literal(addSize = js.Any.fromFunction2(addSize), build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[SizeMappingBuilder]
    }
    
    @scala.inline
    implicit class SizeMappingBuilderMutableBuilder[Self <: SizeMappingBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSize(value: (SingleSizeArray, GeneralSize) => SizeMappingBuilder): Self = StObject.set(x, "addSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBuild(value: () => SizeMappingArray): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
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
  }
  
  object events {
    
    @js.native
    trait Event extends StObject {
      
      var serviceName: String = js.native
      
      var slot: Slot = js.native
    }
    object Event {
      
      @scala.inline
      def apply(serviceName: String, slot: Slot): Event = {
        val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlot(value: Slot): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type ImpressionViewableEvent = Event
    
    // tslint:disable-next-line:no-empty-interface
    type SlotOnloadEvent = Event
    
    @js.native
    trait SlotRenderEndedEvent extends Event {
      
      var advertiserId: js.UndefOr[Double] = js.native
      
      var campaignId: js.UndefOr[Double] = js.native
      
      var creativeId: js.UndefOr[Double] = js.native
      
      var isEmpty: Boolean = js.native
      
      var lineItemId: js.UndefOr[Double] = js.native
      
      var size: js.Array[Double] | String = js.native
      
      var sourceAgnosticCreativeId: js.UndefOr[Double] = js.native
      
      var sourceAgnosticLineItemId: js.UndefOr[Double] = js.native
    }
    object SlotRenderEndedEvent {
      
      @scala.inline
      def apply(isEmpty: Boolean, serviceName: String, size: js.Array[Double] | String, slot: Slot): SlotRenderEndedEvent = {
        val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
        __obj.asInstanceOf[SlotRenderEndedEvent]
      }
      
      @scala.inline
      implicit class SlotRenderEndedEventMutableBuilder[Self <: SlotRenderEndedEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdvertiserId(value: Double): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
        
        @scala.inline
        def setCampaignId(value: Double): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
        
        @scala.inline
        def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
        
        @scala.inline
        def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
        
        @scala.inline
        def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
        
        @scala.inline
        def setSourceAgnosticCreativeId(value: Double): Self = StObject.set(x, "sourceAgnosticCreativeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceAgnosticCreativeIdUndefined: Self = StObject.set(x, "sourceAgnosticCreativeId", js.undefined)
        
        @scala.inline
        def setSourceAgnosticLineItemId(value: Double): Self = StObject.set(x, "sourceAgnosticLineItemId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceAgnosticLineItemIdUndefined: Self = StObject.set(x, "sourceAgnosticLineItemId", js.undefined)
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type SlotRequestedEvent = Event
    
    // tslint:disable-next-line:no-empty-interface
    type SlotResponseReceived = Event
    
    @js.native
    trait SlotVisibilityChangedEvent extends Event {
      
      var inViewPercentage: Double = js.native
    }
    object SlotVisibilityChangedEvent {
      
      @scala.inline
      def apply(inViewPercentage: Double, serviceName: String, slot: Slot): SlotVisibilityChangedEvent = {
        val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
        __obj.asInstanceOf[SlotVisibilityChangedEvent]
      }
      
      @scala.inline
      implicit class SlotVisibilityChangedEventMutableBuilder[Self <: SlotVisibilityChangedEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInViewPercentage(value: Double): Self = StObject.set(x, "inViewPercentage", value.asInstanceOf[js.Any])
      }
    }
  }
}
