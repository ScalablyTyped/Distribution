package typings.googlePublisherTag

import typings.googlePublisherTag.googletag.CommandArray
import typings.googlePublisherTag.googletag.CompanionAdsService
import typings.googlePublisherTag.googletag.GeneralSize
import typings.googlePublisherTag.googletag.PubAdsService
import typings.googlePublisherTag.googletag.SizeMappingBuilder
import typings.googlePublisherTag.googletag.Slot
import typings.googlePublisherTag.googletag.enums.OutOfPageFormat
import typings.googlePublisherTag.googletag.secureSignals.SecureSignalProvider
import typings.googlePublisherTag.googletag.secureSignals.SecureSignalProvidersArray
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object googletag {
    
    @JSGlobal("googletag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Flag indicating that the GPT API is loaded and ready to be called.
      * This property will be simply `undefined` until the API is ready.
      *
      * Note that the recommended way of handling async is to use
      * {@link cmd | googletag.cmd} to queue callbacks for when GPT is ready. These
      * callbacks do not have to check googletag.apiReady as they are guaranteed to
      * execute once the API is set up.
      *
      * @example
      *  &lt;script&gt;
      *    if (window.googletag && googletag.apiReady) {
      *      // GPT API can be called safely.
      *    }
      *  &lt;/script&gt;
      */
    @JSGlobal("googletag.apiReady")
    @js.native
    val apiReady: js.UndefOr[Boolean] = js.native
    
    /**
      * Reference to the global command queue for asynchronous execution of
      * GPT-related calls.
      *
      * The `googletag.cmd` variable is initialized to an empty
      * JavaScript array by the GPT tag syntax on the page, and
      * `cmd.push` is the standard `Array.push` method that
      * adds an element to the end of the array. When the GPT JavaScript is loaded,
      * it looks through the array and executes all the functions in order. The
      * script then replaces `cmd` with a {@link CommandArray} object
      * whose push method is defined to execute the function argument passed to it.
      * This mechanism allows GPT to reduce perceived latency by fetching the
      * JavaScript asynchronously while allowing the browser to continue rendering
      * the page.
      *
      * @example
      *   googletag.cmd.push(() => {
      *     googletag.defineSlot('/1234567/sports', [160, 600])!
      *              .addService(googletag.pubads());
      *   });
      */
    @JSGlobal("googletag.cmd")
    @js.native
    val cmd: (js.Array[js.ThisFunction0[/* globalThis */ /* this */ Any, Unit]]) | CommandArray = js.native
    
    /**
      * Returns a reference to the {@link CompanionAdsService}.
      *
      * @return The Companion Ads service.
      */
    inline def companionAds(): CompanionAdsService = ^.asInstanceOf[js.Dynamic].applyDynamic("companionAds")().asInstanceOf[CompanionAdsService]
    
    /**
      * Constructs an out-of-page ad slot with the given ad unit path.
      *
      * For custom out-of-page ads, `div` is the ID
      * of the div element that will contain the ad. See the article on
      * [out-of-page
      * creatives](https://support.google.com/admanager/answer/6088046) for more
      * details.
      *
      * For GPT managed out-of-page ads, `div` is a
      * supported {@link enums.OutOfPageFormat | OutOfPageFormat}.
      *
      * @example
      *   // Define a custom out-of-page ad slot.
      *   googletag.defineOutOfPageSlot('/1234567/sports', 'div-1');
      *
      *   // Define a GPT managed web interstitial ad slot.
      *   googletag.defineOutOfPageSlot('/1234567/sports',
      *                                 googletag.enums.OutOfPageFormat.INTERSTITIAL);
      *
      * @see [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
      * @see [Display a web interstitial ad](https://developers.google.com/publisher-tag/samples/display-web-interstitial-ad)
      * @see [Display an anchor ad](https://developers.google.com/publisher-tag/samples/display-anchor-ad)
      * @see [Display an out-of-page ad](https://developers.google.com/publisher-tag/samples/display-out-of-page-ad)
      * @param adUnitPath Full [ad unit
      *     path](https://developers.google.com/publisher-tag/guides/get-started#ad-unit-path)
      *     with the network code and ad unit code.
      * @param div ID of the div that  will contain this ad unit or
      *     OutOfPageFormat.
      * @return The newly created slot, or `null` if a slot cannot be
      *     created.
      */
    inline def defineOutOfPageSlot(adUnitPath: String): Slot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defineOutOfPageSlot")(adUnitPath.asInstanceOf[js.Any]).asInstanceOf[Slot | Null]
    inline def defineOutOfPageSlot(adUnitPath: String, div: String): Slot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOutOfPageSlot")(adUnitPath.asInstanceOf[js.Any], div.asInstanceOf[js.Any])).asInstanceOf[Slot | Null]
    inline def defineOutOfPageSlot(adUnitPath: String, div: OutOfPageFormat): Slot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOutOfPageSlot")(adUnitPath.asInstanceOf[js.Any], div.asInstanceOf[js.Any])).asInstanceOf[Slot | Null]
    
    /**
      * Constructs an ad slot with a given ad unit path and size and associates it
      * with the ID of a div element on the page that will contain the ad.
      *
      * @example
      *   googletag.defineSlot('/1234567/sports', [728, 90], 'div-1');
      *
      * @see [Get Started with Google Publisher Tags](https://developers.google.com/publisher-tag/guides/get-started)
      * @param adUnitPath Full [ad unit
      *     path](https://developers.google.com/publisher-tag/guides/get-started#ad-unit-path)
      *     with the network code and unit code.
      * @param  size Width and height of the added slot.
      *     This is the size that is used in the ad request if no responsive size
      *     mapping is provided or the size of the viewport is smaller than the
      *     smallest size provided in the mapping.
      * @param div ID of the div that will contain this ad unit.
      * @return The newly created slot, or `null` if a slot cannot be
      *     created.
      */
    inline def defineSlot(adUnitPath: String, size: GeneralSize): Slot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defineSlot")(adUnitPath.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Slot | Null]
    inline def defineSlot(adUnitPath: String, size: GeneralSize, div: String): Slot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defineSlot")(adUnitPath.asInstanceOf[js.Any], size.asInstanceOf[js.Any], div.asInstanceOf[js.Any])).asInstanceOf[Slot | Null]
    
    /**
      * Destroys the given slots, removing all related objects and references of
      * those slots from GPT. This API does not support passback slots and
      * companion slots.
      *
      * Calling this API on a slot clears the ad and removes the slot object from
      * the internal state maintained by GPT. Calling any more functions on the
      * slot object will result in undefined behavior. Note the browser may still
      * not free the memory associated with that slot if a reference to it is
      * maintained by the publisher page. Calling this API makes the div associated
      * with that slot available for reuse.
      *
      * In particular, destroying a slot removes the ad from GPT's
      * [long-lived pageview](https://support.google.com/admanager/answer/183281),
      * so future requests will not be influenced by roadblocks or competitive
      * exclusions involving this ad. Failure to call this function before removing
      * a slot's div from the page will result in undefined behavior.
      *
      * @example
      *   // The calls to construct an ad and display contents.
      *   const slot1 =
      *       googletag.defineSlot('/1234567/sports', [728, 90], 'div-1')!;
      *   googletag.display('div-1');
      *   const slot2 =
      *       googletag.defineSlot('/1234567/news', [160, 600], 'div-2')!;
      *   googletag.display('div-2');
      *
      *   // This call to destroy only slot1.
      *   googletag.destroySlots([slot1]);
      *
      *   // This call to destroy both slot1 and slot2.
      *   googletag.destroySlots([slot1, slot2]);
      *
      *   // This call to destroy all slots.
      *   googletag.destroySlots();
      *
      * @param slots The array of slots to destroy. Array is optional; all slots
      *     will be destroyed if it is unspecified.
      * @return `true` if slots have been destroyed, `false`
      *     otherwise.
      */
    inline def destroySlots(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("destroySlots")().asInstanceOf[Boolean]
    inline def destroySlots(slots: js.Array[Slot]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("destroySlots")(slots.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Disables the Google Publisher Console.
      *
      * @see [Google Publisher Console](https://developers.google.com/publisher-tag/guides/publisher-console)
      */
    inline def disablePublisherConsole(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disablePublisherConsole")().asInstanceOf[Unit]
    
    /**
      * Instructs slot services to render the slot. Each ad slot should only be
      * displayed once per page. All slots must be defined and have a service
      * associated with them before being displayed. The display call must not
      * happen until the element is present in the DOM. The usual way to achieve
      * that is to place it within a script block within the div element named in
      * the method call.
      *
      * If single request architecture (SRA) is being used, all unfetched
      * ad slots at the time this method is called will be fetched at once. To
      * force an ad slot not to display, the entire div must be removed.
      *
      * @example
      *   &lt;div id="div-1" style="width: 728px; height: 90px"&gt;
      *     &lt;script type="text/javascript"&gt;
      *       googletag.cmd.push(() => {
      *         googletag.display('div-1');
      *       });
      *     &lt;/script&gt;
      *   &lt;/div&gt;
      *
      * @see [Get Started with Google Publisher Tags](https://developers.google.com/publisher-tag/guides/get-started)
      * @see [Display a test ad](https://developers.google.com/publisher-tag/samples/display-test-ad)
      * @see [Control ad loading and refresh](https://developers.google.com/publisher-tag/guides/control-ad-loading)
      * @param  divOrSlot Either the ID of the div element containing the ad slot
      *     or the div element, or the slot object. If a div element is provided,
      *     it must have an 'id' attribute which matches the ID passed into
      *     {@link defineSlot}.
      */
    inline def display(divOrSlot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(divOrSlot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def display(divOrSlot: Slot): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(divOrSlot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def display(divOrSlot: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(divOrSlot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Enables all GPT services that have been defined for ad slots
      * on the page.
      */
    inline def enableServices(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableServices")().asInstanceOf[Unit]
    
    /**
      * This is the namespace that GPT uses for enum types.
      */
    object enums {
      
      /**
        * Out-of-page formats supported by GPT.
        *
        * @see {@link defineOutOfPageSlot}
        */
      @JSGlobal("googletag.enums.OutOfPageFormat")
      @js.native
      object OutOfPageFormat extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.googlePublisherTag.googletag.enums.OutOfPageFormat & Double] = js.native
        
        /* 1 */ val BOTTOM_ANCHOR: typings.googlePublisherTag.googletag.enums.OutOfPageFormat.BOTTOM_ANCHOR & Double = js.native
        
        /* 2 */ val INTERSTITIAL: typings.googlePublisherTag.googletag.enums.OutOfPageFormat.INTERSTITIAL & Double = js.native
        
        /* 3 */ val REWARDED: typings.googlePublisherTag.googletag.enums.OutOfPageFormat.REWARDED & Double = js.native
        
        /* 0 */ val TOP_ANCHOR: typings.googlePublisherTag.googletag.enums.OutOfPageFormat.TOP_ANCHOR & Double = js.native
      }
      
      /**
        * [Traffic sources](https://support.google.com/admanager/answer/11233407)
        * supported by GPT.
        *
        * @see {@link PrivacySettingsConfig.trafficSource}
        */
      @JSGlobal("googletag.enums.TrafficSource")
      @js.native
      object TrafficSource extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.googlePublisherTag.googletag.enums.TrafficSource & Double] = js.native
        
        /* 1 */ val ORGANIC: typings.googlePublisherTag.googletag.enums.TrafficSource.ORGANIC & Double = js.native
        
        /* 0 */ val PURCHASED: typings.googlePublisherTag.googletag.enums.TrafficSource.PURCHASED & Double = js.native
      }
    }
    
    /**
      * Returns the current version of GPT.
      *
      * @see [GPT version history](https://developers.google.com/publisher-tag/versions)
      * @return The currently executing GPT version string.
      */
    inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
    
    /**
      * Opens the Google Publisher Console.
      *
      * @example
      *   // Calling with div ID.
      *   googletag.openConsole('div-1');
      *
      *   // Calling without div ID.
      *   googletag.openConsole();
      *
      * @see [Google Publisher Console](https://developers.google.com/publisher-tag/guides/publisher-console)
      * @param div An ad slot div ID. This value is optional. When provided, the
      * Publisher Console will attempt to open with details of the specified ad
      * slot in view.
      */
    inline def openConsole(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openConsole")().asInstanceOf[Unit]
    inline def openConsole(div: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openConsole")(div.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Returns a reference to the {@link PubAdsService}.
      *
      * @return The Publisher Ads service.
      */
    inline def pubads(): PubAdsService = ^.asInstanceOf[js.Dynamic].applyDynamic("pubads")().asInstanceOf[PubAdsService]
    
    /**
      * Flag indicating that
      * {@link PubAdsService} is enabled, loaded and fully operational. This
      * property will be simply `undefined` until {@link enableServices}
      * is called and {@link PubAdsService} is loaded and initialized.
      */
    @JSGlobal("googletag.pubadsReady")
    @js.native
    val pubadsReady: js.UndefOr[Boolean] = js.native
    
    /**
      * Reference to the secure signal providers array.
      *
      * The secure signal providers array accepts a sequence of signal-generating
      * functions and invokes them in order. It is intended to replace a standard
      * array that is used to enqueue signal-generating functions to be invoked
      * once GPT is loaded.
      *
      * @example
      *   window.googletag = window.googletag || {cmd: []};
      *   googletag.secureSignalProviders = googletag.secureSignalProviders || [];
      *   googletag.secureSignalProviders.push({
      *     id: 'collector123',
      *     collectorFunction: () => { return Promise.resolve('signal'); }
      *   });
      *
      * @see [Share secure signals with bidders](https://support.google.com/admanager/answer/10488752)
      */
    @JSGlobal("googletag.secureSignalProviders")
    @js.native
    def secureSignalProviders: js.UndefOr[js.Array[SecureSignalProvider] | SecureSignalProvidersArray] = js.native
    inline def secureSignalProviders_=(x: js.UndefOr[js.Array[SecureSignalProvider] | SecureSignalProvidersArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secureSignalProviders")(x.asInstanceOf[js.Any])
    
    /**
      * Sets the title for all ad container iframes created by
      * {@link PubAdsService}, from this point onwards.
      *
      * @example
      *   googletag.setAdIframeTitle('title');
      *
      * @param title The new title for all ad container iframes.
      */
    inline def setAdIframeTitle(title: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdIframeTitle")(title.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Creates a new {@link SizeMappingBuilder}.
      *
      * @see [Ad sizes: Responsive ads](https://developers.google.com/publisher-tag/guides/ad-sizes#responsive_ads)
      * @return A new builder.
      */
    inline def sizeMapping(): SizeMappingBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeMapping")().asInstanceOf[SizeMappingBuilder]
  }
}
