package typings.googlePublisherTag.googletag

import typings.googlePublisherTag.anon.ChangeCorrelator
import typings.googlePublisherTag.anon.FetchMarginPercent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Publisher Ads service. This service is used to fetch and show ads from your
  * Google Ad Manager account.
  */
@js.native
trait PubAdsService
  extends StObject
     with Service {
  
  /**
    * Removes the ads from the given slots and replaces them with blank
    * content. The slots will be marked as unfetched.
    *
    * In particular, clearing a slot removes the ad from GPT's [long-lived
    * pageview](https://support.google.com/admanager/answer/183281), so future
    * requests will not be influenced by roadblocks or competitive exclusions
    * involving this ad.
    *
    * @example
    *   const slot1 =
    *       googletag.defineSlot('/1234567/sports', [728, 90], 'div-1')!;
    *   googletag.display('div-1');
    *   const slot2 =
    *       googletag.defineSlot('/1234567/news', [160, 600], 'div-2')!;
    *   googletag.display('div-2');
    *
    *   // This call to clear only slot1.
    *   googletag.pubads().clear([slot1]);
    *
    *   // This call to clear both slot1 and slot2.
    *   googletag.pubads().clear([slot1, slot2]);
    *
    *   // This call to clear all slots.
    *   googletag.pubads().clear();
    *
    * @param slots The array of slots to clear. Array is optional; all slots
    *     will be cleared if it is unspecified.
    * @return Returns `true` if slots have been cleared,
    *     `false` otherwise.
    */
  def clear(): Boolean = js.native
  def clear(slots: js.Array[Slot]): Boolean = js.native
  
  /**
    * Clears all page-level ad category exclusion labels. This is useful if you
    * want to refresh the slot.
    *
    * @example
    *   // Set category exclusion to exclude ads with 'AirlineAd' labels.
    *   googletag.pubads().setCategoryExclusion('AirlineAd');
    *
    *   // Make ad requests. No ad with 'AirlineAd' label will be returned.
    *
    *   // Clear category exclusions so all ads can be returned.
    *   googletag.pubads().clearCategoryExclusions();
    *
    *   // Make ad requests. Any ad can be returned.
    *
    * @see [Custom labels to block ads](https://support.google.com/admanager/answer/3238504)
    * @return The service object on which the method was called.
    */
  def clearCategoryExclusions(): PubAdsService = js.native
  
  /**
    * Clears custom targeting parameters for a specific key or for all keys.
    *
    * @example
    *   googletag.pubads().setTargeting('interests', 'sports');
    *   googletag.pubads().setTargeting('colors', 'blue');
    *   googletag.pubads().setTargeting('fruits', 'apple');
    *
    *   googletag.pubads().clearTargeting('interests');
    *   // Targeting 'colors' and 'fruits' are still present, while 'interests'
    *   // was cleared.
    *
    *   googletag.pubads().clearTargeting();
    *   // All targeting has been cleared.
    *
    * @see [Key-value targeting](https://developers.google.com/publisher-tag/guides/key-value-targeting)
    * @param key Targeting parameter key. The key is optional; all targeting
    *     parameters will be cleared if it is unspecified.
    * @return The service object on which the method was called.
    */
  def clearTargeting(): PubAdsService = js.native
  def clearTargeting(key: String): PubAdsService = js.native
  
  /**
    * Enables collapsing of slot divs so that they don't take up any space on
    * the page when there is no ad content to display. This mode must be set
    * before the service is enabled.
    *
    * @see [Collapse empty ad slots](https://developers.google.com/publisher-tag/samples/collapse-empty-ad-slots)
    * @see [Minimize layout shift](https://developers.google.com/publisher-tag/guides/minimize-layout-shift)
    * @param collapseBeforeAdFetch Whether to collapse the slots even before
    *     the ads are fetched. This parameter is optional; if not provided,
    *     `false` will be used as the default value.
    * @return Returns `true` if div collapse mode was enabled and
    *     `false` if it is impossible to enable collapse mode
    *     because the method was called after the service was enabled.
    */
  def collapseEmptyDivs(): Boolean = js.native
  def collapseEmptyDivs(collapseBeforeAdFetch: Boolean): Boolean = js.native
  
  /**
    * Disables requests for ads on page load, but allows ads to be requested
    * with a {@link PubAdsService.refresh} call. This should be set prior to
    * enabling the service. Async mode must be used; otherwise it will be
    * impossible to request ads using `refresh`.
    *
    * @see [Control ad loading and refresh](https://developers.google.com/publisher-tag/guides/control-ad-loading)
    * @see [Control SRA batching](https://developers.google.com/publisher-tag/samples/control-sra-batching)
    */
  def disableInitialLoad(): Unit = js.native
  
  /**
    * Constructs and displays an ad slot with the given ad unit path and size.
    * This method does not work with single request mode.
    *
    * **Note:** When this method is called, a snapshot of the slot and page
    * state is created to ensure consistency when sending the ad request and
    * rendering the response. Any changes that are made to the slot or page
    * state after this method is called (including targeting, privacy settings,
    * force SafeFrame, etc.) will only apply to subsequent
    * `display()` or `refresh()` requests.
    *
    * @example
    *   googletag.pubads().display('/1234567/sports', [728, 90], 'div-1');
    *
    * @see [Display a test ad](https://developers.google.com/publisher-tag/samples/display-test-ad)
    * @see [Control ad loading and refresh](https://developers.google.com/publisher-tag/guides/control-ad-loading)
    * @param adUnitPath The [ad unit
    *     path](https://developers.google.com/publisher-tag/guides/get-started#ad-unit-path)
    *     of slot to be rendered.
    * @param size Width and height of the slot.
    * @param div Either the ID of the div containing the slot or the div
    *     element itself.
    * @param clickUrl The click URL to use on this slot.
    */
  def display(adUnitPath: String, size: GeneralSize): Unit = js.native
  def display(adUnitPath: String, size: GeneralSize, div: String): Unit = js.native
  def display(adUnitPath: String, size: GeneralSize, div: String, clickUrl: String): Unit = js.native
  def display(adUnitPath: String, size: GeneralSize, div: Unit, clickUrl: String): Unit = js.native
  def display(adUnitPath: String, size: GeneralSize, div: Element): Unit = js.native
  def display(adUnitPath: String, size: GeneralSize, div: Element, clickUrl: String): Unit = js.native
  
  /**
    * Enables lazy loading in GPT as defined by the config object. For more
    * detailed examples, see the [Lazy
    * loading](https://developers.google.com/publisher-tag/samples/lazy-loading)
    * sample.
    *
    * **Note:** Lazy fetching in SRA only works if all slots are outside the
    * fetching margin.
    *
    * @example
    *   googletag.pubads().enableLazyLoad({
    *     // Fetch slots within 5 viewports.
    *     fetchMarginPercent: 500,
    *     // Render slots within 2 viewports.
    *     renderMarginPercent: 200,
    *     // Double the above values on mobile.
    *     mobileScaling: 2.0
    *   });
    *
    * @see [Ads best practices: Prioritize &quot;important&quot; ad slots](https://developers.google.com/publisher-tag/guides/ad-best-practices#prioritize_important_ad_slots)
    * @see [Lazy loading](https://developers.google.com/publisher-tag/samples/lazy-loading)
    * @param config Configuration object allows customization of lazy behavior.
    *     Any omitted configurations will use a default set by Google
    *     that will be tuned over time. To disable a particular setting, such
    *     as a fetching margin, set the value to `-1`.
    *
    * - `fetchMarginPercent`
    *
    *     The minimum distance from the current viewport a slot must be before
    *     we fetch the ad as a percentage of viewport size. A value of 0 means
    *     "when the slot enters the viewport", 100 means "when the ad is 1
    *     viewport away", and so on.
    *
    * - `renderMarginPercent`
    *
    *     The minimum distance from the current viewport a slot must be before we
    *     render an ad. This allows for prefetching the ad, but waiting to render
    *     and download other subresources. The value works just like
    *     `fetchMarginPercent` as a percentage of viewport.
    *
    * - `mobileScaling`
    *
    *     A multiplier applied to margins on mobile devices. This allows varying
    *     margins on mobile vs. desktop. For example, a value of 2.0 will
    *     multiply all margins by 2 on mobile devices, increasing the minimum
    *     distance a slot can be before fetching and rendering.
    */
  def enableLazyLoad(): Unit = js.native
  def enableLazyLoad(config: FetchMarginPercent): Unit = js.native
  
  /**
    * Enables single request mode for fetching multiple ads at the same time.
    * This requires all Publisher Ads slots to be defined and added to the
    * PubAdsService prior to enabling the service. Single request mode must be
    * set before the service is enabled.
    *
    * @see [Ads best practices: Use Single Request Architecture correctly](https://developers.google.com/publisher-tag/guides/ad-best-practices#use_single_request_architecture_correctly)
    * @see [Control SRA batching](https://developers.google.com/publisher-tag/samples/control-sra-batching)
    * @return Returns `true` if single request mode was enabled and
    *     `false` if it is impossible to enable single request mode
    *     because the method was called after the service was enabled.
    */
  def enableSingleRequest(): Boolean = js.native
  
  /**
    * Signals to GPT that video ads will be present on the page. This enables
    * competitive exclusion constraints on display and video ads. If the video
    * content is known, call {@link PubAdsService.setVideoContent} in order to be
    * able to use content exclusion for display ads.
    */
  def enableVideoAds(): Unit = js.native
  
  /**
    * Returns the value for the AdSense attribute associated with the given
    * key.
    *
    * @example
    *   googletag.pubads().set('adsense_background_color', '#FFFFFF');
    *   googletag.pubads().get('adsense_background_color');
    *   // Returns '#FFFFFF'.
    *
    * @see [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes)
    * @param key Name of the attribute to look for.
    * @return Current value for the attribute key, or `null` if the
    *     key is not present.
    */
  def get(key: String): String | Null = js.native
  
  /**
    * Returns the attribute keys that have been set on this service.
    *
    * @example
    *   googletag.pubads().set('adsense_background_color', '#FFFFFF');
    *   googletag.pubads().set('adsense_border_color', '#AABBCC');
    *   googletag.pubads().getAttributeKeys();
    *   // Returns ['adsense_background_color', 'adsense_border_color'].
    *
    * @return Array of attribute keys set on this service. Ordering is
    *     undefined.
    */
  def getAttributeKeys(): js.Array[String] = js.native
  
  /**
    * Returns a specific custom service-level targeting parameter that has been
    * set.
    *
    * @example
    *   googletag.pubads().setTargeting('interests', 'sports');
    *
    *   googletag.pubads().getTargeting('interests');
    *   // Returns ['sports'].
    *
    *   googletag.pubads().getTargeting('age');
    *   // Returns [] (empty array).
    *
    * @param key The targeting key to look for.
    * @return The values associated with this key, or an empty array if there
    *     is no such key.
    */
  def getTargeting(key: String): js.Array[String] = js.native
  
  /**
    * Returns the list of all custom service-level targeting keys that have
    * been set.
    *
    * @example
    *   googletag.pubads().setTargeting('interests', 'sports');
    *   googletag.pubads().setTargeting('colors', 'blue');
    *
    *   googletag.pubads().getTargetingKeys();
    *   // Returns ['interests', 'colors'].
    *
    * @return Array of targeting keys. Ordering is undefined.
    */
  def getTargetingKeys(): js.Array[String] = js.native
  
  /**
    * Returns whether or not initial requests for ads was successfully disabled
    * by a previous {@link PubAdsService.disableInitialLoad} call.
    *
    * @return Returns `true` if a previous call to
    *     {@link PubAdsService.disableInitialLoad} was successful, `false`
    *     otherwise.
    */
  def isInitialLoadDisabled(): Boolean = js.native
  
  /**
    * Fetches and displays new ads for specific or all slots on the page. Works
    * only in asynchronous rendering mode.
    *
    * For proper behavior across all browsers, calling `refresh`
    * must be preceded by a call to `display` the ad slot. If the
    * call to `display` is omitted, refresh may behave unexpectedly.
    * If desired, the {@link PubAdsService.disableInitialLoad}
    * method can be used to stop `display` from fetching an ad.
    *
    * Refreshing a slot removes the old ad from GPT's
    * [long-lived pageview](https://support.google.com/admanager/answer/183281),
    * so future requests will not be influenced by roadblocks or competitive
    * exclusions involving that ad.
    *
    * @example
    *   const slot1 =
    *       googletag.defineSlot('/1234567/sports', [728, 90], 'div-1')!;
    *   googletag.display('div-1');
    *   const slot2 =
    *       googletag.defineSlot('/1234567/news', [160, 600], 'div-2')!;
    *   googletag.display('div-2');
    *
    *   // This call to refresh fetches a new ad for slot1 only.
    *   googletag.pubads().refresh([slot1]);
    *
    *   // This call to refresh fetches a new ad for both slot1 and slot2.
    *   googletag.pubads().refresh([slot1, slot2]);
    *
    *   // This call to refresh fetches a new ad for each slot.
    *   googletag.pubads().refresh();
    *
    *   // This call to refresh fetches a new ad for slot1, without changing
    *   // the correlator.
    *   googletag.pubads().refresh([slot1], {changeCorrelator: false});
    *
    *   // This call to refresh fetches a new ad for each slot, without
    *   // changing the correlator.
    *   googletag.pubads().refresh(null, {changeCorrelator: false});
    *
    * @see [Control ad loading and refresh](https://developers.google.com/publisher-tag/guides/control-ad-loading)
    * @see [Refresh ad slots](https://developers.google.com/publisher-tag/samples/refresh)
    * @param  slots The slots to refresh. Array is  optional; all slots
    *     will be refreshed if it is unspecified.
    * @param options Configuration options associated with this refresh
    *     call.
    *
    * - `changeCorrelator`
    *
    *     Specifies whether or not a new correlator is to be generated for
    *     fetching ads. Our ad servers maintain this correlator value briefly
    *     (currently for 30 seconds, but subject to change), such that requests
    *     with the same correlator received close together will be considered
    *     a single page view. By default a new correlator is generated for every
    *     refresh.
    *
    *     **Note:** this option has no effect on GPT's [long-lived
    *     pageview](https://support.google.com/admanager/answer/183281), which
    *     automatically reflects the ads currently on the page and has no
    *     expiration time.
    */
  def refresh(): Unit = js.native
  def refresh(slots: js.Array[Slot]): Unit = js.native
  def refresh(slots: js.Array[Slot], options: ChangeCorrelator): Unit = js.native
  def refresh(slots: Null, options: ChangeCorrelator): Unit = js.native
  def refresh(slots: Unit, options: ChangeCorrelator): Unit = js.native
  
  /**
    * Sets values for AdSense attributes that apply to all ad slots under the
    * Publisher Ads service.
    *
    * Calling this more than once for the same key will override previously set
    * values for that key. All values must be set before calling
    * `display` or `refresh`.
    *
    * @example
    *   googletag.pubads().set('adsense_background_color', '#FFFFFF');
    *
    * @see [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes)
    * @param key The name of the attribute.
    * @param value Attribute value.
    * @return The service object on which the method was called.
    */
  def set(key: String, value: String): PubAdsService = js.native
  
  /**
    * Sets a page-level ad category exclusion for the given label name.
    *
    * @example
    *   // Label = AirlineAd.
    *   googletag.pubads().setCategoryExclusion('AirlineAd');
    *
    * @see [Custom labels to block ads](https://support.google.com/admanager/answer/3238504)
    * @param categoryExclusion The ad category exclusion label to add.
    * @return The service object on which the method was called.
    */
  def setCategoryExclusion(categoryExclusion: String): PubAdsService = js.native
  
  /**
    * Enables and disables horizontal centering of ads. Centering is disabled
    * by default. In legacy gpt_mobile.js, centering is enabled by default.
    *
    * This method should be invoked before calling `display` or
    * `refresh` because only ads that are requested after calling
    * this method will be centered.
    *
    * @example
    *   // Make ads centered.
    *   googletag.pubads().setCentering(true);
    *
    * @param centerAds `true` to center ads, `false` to
    *     left-align them.
    */
  def setCentering(centerAds: Boolean): Unit = js.native
  
  /**
    * Configures whether all ads on the page should be forced to be rendered
    * using a SafeFrame container.
    *
    * Please keep the following things in mind while using this API:
    *
    * - This setting will only take effect for **subsequent** ad requests
    *   made for the respective slots.
    * - The slot level setting, if specified, will always override the page
    *   level setting.
    * - If set to `true` (at slot-level or page level), the ad will always be
    *   rendered using a SafeFrame container independent of the choice made in
    *   the Google Ad Manager UI.
    * - However, if set to `false` or left unspecified, the ad will be rendered
    *   using a SafeFrame container depending on the type of creative and the
    *   selection made in the Google Ad Manager UI.
    * - This API should be used with caution as it could impact the behaviour
    *   of creatives that attempt to break out of their iFrames or rely on
    *   them being rendered directly in a publishers page.
    *
    * @example
    *   googletag.pubads().setForceSafeFrame(true);
    *
    *   // The following slot will be opted-out of the page-level force
    *   // SafeFrame instruction.
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')!
    *            .setForceSafeFrame(false)
    *            .addService(googletag.pubads());
    *
    *   // The following slot will have SafeFrame forced.
    *   googletag.defineSlot('/1234567/news', [160, 600], 'div-2')!
    *            .addService(googletag.pubads());
    *
    *   googletag.display('div-1');
    *   googletag.display('div-2');
    *
    * @see [Render creatives using SafeFrame](https://support.google.com/admanager/answer/6023110)
    * @param forceSafeFrame `true` to force all ads on the page to
    *     be rendered in SafeFrames and `false` to change the
    *     previous setting to false. Setting this to `false` when
    *     unspecified earlier, won't change anything.
    * @return The service object on which the function was called.
    */
  def setForceSafeFrame(forceSafeFrame: Boolean): PubAdsService = js.native
  
  /**
    * Passes location information from websites so you can geo-target line
    * items to specific locations.
    *
    * @example
    *   // Postal code:
    *   googletag.pubads().setLocation("10001,US")
    *
    * @param address Freeform address.
    * @return The service object on which the method was called.
    */
  def setLocation(address: String): PubAdsService = js.native
  
  /**
    * Allows configuration of all privacy settings from a single API using a
    * config object.
    *
    * @example
    *   googletag.pubads().setPrivacySettings({
    *     restrictDataProcessing: true,
    *   });
    *
    *   // Set multiple privacy settings at the same time.
    *   googletag.pubads().setPrivacySettings({
    *     childDirectedTreatment: true,
    *     underAgeOfConsent: true
    *   });
    *
    *   // Clear the configuration for childDirectedTreatment.
    *   googletag.pubads().setPrivacySettings({
    *     childDirectedTreatment: null
    *   });
    *
    * @see [Configure privacy settings](https://developers.google.com/publisher-tag/samples/configure-privacy)
    * @see [Display a limited ad](https://developers.google.com/publisher-tag/samples/display-limited-ad)
    * @param privacySettings Object containing privacy settings config.
    * @return The service object on which the function was called.
    */
  def setPrivacySettings(privacySettings: PrivacySettingsConfig): PubAdsService = js.native
  
  /**
    * Sets the value for the publisher-provided ID.
    *
    * @example
    *   googletag.pubads()
    *            .setPublisherProvidedId('12JD92JD8078S8J29SDOAKC0EF230337');
    *
    * @see [About publisher provided identifiers](https://support.google.com/admanager/answer/2880055)
    * @param ppid An alphanumeric ID provided by the publisher. Must be between
    *     32 and 150 characters.
    * @return The service object on which the method was called.
    */
  def setPublisherProvidedId(ppid: String): PubAdsService = js.native
  
  /**
    * Sets the page-level preferences for SafeFrame configuration. Any
    * unrecognized keys in the config object will be ignored. The entire config
    * will be ignored if an invalid value is passed for a recognized key.
    *
    * These page-level preferences will be overridden by slot-level
    * preferences, if specified.
    *
    * @example
    *   googletag.pubads().setForceSafeFrame(true);
    *
    *   const pageConfig = {
    *     allowOverlayExpansion: true,
    *     allowPushExpansion: true,
    *     sandbox: true
    *   };
    *
    *   const slotConfig = {allowOverlayExpansion: false};
    *
    *   googletag.pubads().setSafeFrameConfig(pageConfig);
    *
    *   // The following slot will not allow for expansion by overlay.
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')!
    *            .setSafeFrameConfig(slotConfig)
    *            .addService(googletag.pubads());
    *
    *   // The following slot will inherit the page level settings, and hence
    *   // would allow for expansion by overlay.
    *   googletag.defineSlot('/1234567/news', [160, 600], 'div-2')!
    *            .addService(googletag.pubads());
    *
    *   googletag.display('div-1');
    *   googletag.display('div-2');
    *
    * @see [Render creatives using SafeFrame](https://support.google.com/admanager/answer/6023110)
    * @param config The configuration object.
    * @return The service object on which the method was called.
    */
  def setSafeFrameConfig(config: SafeFrameConfig): PubAdsService = js.native
  
  /**
    * Sets custom targeting parameters for a given key that apply to all
    * Publisher Ads service ad slots. Calling this multiple times for the same
    * key will overwrite old values. These keys are defined in your Google Ad
    * Manager account.
    *
    * @example
    *   // Example with a single value for a key.
    *   googletag.pubads().setTargeting('interests', 'sports');
    *
    *   // Example with multiple values for a key inside in an array.
    *   googletag.pubads().setTargeting('interests', ['sports', 'music']);
    *
    * @see [Key-value targeting](https://developers.google.com/publisher-tag/guides/key-value-targeting)
    * @param key Targeting parameter key.
    * @param value Targeting parameter value or array of values.
    * @return The service object on which the method was called.
    */
  def setTargeting(key: String, value: String): PubAdsService = js.native
  def setTargeting(key: String, value: js.Array[String]): PubAdsService = js.native
  
  /**
    * Sets the video content information to be sent along with the ad requests
    * for targeting and content exclusion purposes. Video ads will be
    * automatically enabled when this method is called. For
    * `videoContentId` and `videoCmsId`, use the values
    * that are provided to the Google Ad Manager content ingestion service.
    *
    * @see [VAST ad tag URL parameters](https://support.google.com/admanager/answer/1068325)
    * @param videoContentId The video content ID.
    * @param videoCmsId The video CMS ID.
    */
  def setVideoContent(videoContentId: String, videoCmsId: String): Unit = js.native
  
  /**
    * Changes the correlator that is sent with ad requests, effectively
    * starting a new page view. The correlator is the same for all the ad
    * requests coming from one page view, and unique across page views. Only
    * applies to async mode.
    *
    * **Note:** this has no effect on GPT's [long-lived
    * pageview](https://support.google.com/admanager/answer/183281), which
    * automatically reflects the ads actually on the page and has no expiration
    * time.
    *
    * @example
    *   // Assume that the correlator is currently 12345. All ad requests made
    *   // by this page will currently use that value.
    *
    *   // Replace the current correlator with a new correlator.
    *   googletag.pubads().updateCorrelator();
    *
    *   // The correlator will now be a new randomly selected value, different
    *   // from 12345. All subsequent ad requests made by this page will use
    *   // the new value.
    *
    * @return The service object on which the function was called.
    */
  def updateCorrelator(): PubAdsService = js.native
}
