package typings.googlePublisherTag.googletag

import org.scalablytyped.runtime.StringDictionary
import typings.googlePublisherTag.googletag.config.SlotSettingsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Slot is an object representing a single ad slot on a page. */
@js.native
trait Slot extends StObject {
  
  /**
    * Adds a {@link Service} to this slot.
    *
    * @example
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *            .addService(googletag.pubads());
    *
    * @see [Get Started with Google Publisher Tags](https://developers.google.com/publisher-tag/guides/get-started)
    * @see [Display a test ad](https://developers.google.com/publisher-tag/samples/display-test-ad)
    * @param service The service to be added.
    * @return The slot object on which the method was called.
    */
  def addService(service: Service): Slot = js.native
  
  /**
    * Clears all slot-level ad category exclusion labels for this slot.
    *
    * @example
    *   // Set category exclusion to exclude ads with 'AirlineAd' labels.
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .setCategoryExclusion('AirlineAd')
    *                         .addService(googletag.pubads());
    *
    *   // Make an ad request. No ad with 'AirlineAd' label will be returned
    *   // for the slot.
    *
    *   // Clear category exclusions so all ads can be returned.
    *   slot.clearCategoryExclusions();
    *
    *   // Make an ad request. Any ad can be returned for the slot.
    *
    * @return The slot object on which the method was called.
    */
  def clearCategoryExclusions(): Slot = js.native
  
  /**
    * Clears specific or all custom slot-level targeting parameters for this
    * slot.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .setTargeting('allow_expandable', 'true')
    *                         .setTargeting('interests', ['sports', 'music'])
    *                         .setTargeting('color', 'red')
    *                         .addService(googletag.pubads());
    *
    *   slot.clearTargeting('color');
    *   // Targeting 'allow_expandable' and 'interests' are still present,
    *   // while 'color' was cleared.
    *
    *   slot.clearTargeting();
    *   // All targeting has been cleared.
    *
    * @see [Key-value targeting](https://developers.google.com/publisher-tag/guides/key-value-targeting)
    * @param key Targeting parameter key. The key is optional; all
    *     targeting parameters will be cleared if it is unspecified.
    * @return The slot object on which the method was called.
    */
  def clearTargeting(): Slot = js.native
  def clearTargeting(key: String): Slot = js.native
  
  /**
    * Sets an array of mappings from a minimum viewport size to slot size
    * for this slot.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .addService(googletag.pubads());
    *
    *   const mapping = googletag.sizeMapping()
    *                            .addSize([100, 100], [88, 31])
    *                            .addSize([320, 400], [[320, 50], [300, 50]])
    *                            .build();
    *
    *   slot.defineSizeMapping(mapping!);
    *
    * @see [Ad sizes: Responsive ads](https://developers.google.com/publisher-tag/guides/ad-sizes#responsive_ads)
    * @param sizeMapping Array of size mappings. You can use
    *     {@link SizeMappingBuilder} to create it. Each size mapping is an array
    *     of two elements: {@link SingleSizeArray} and {@link GeneralSize}.
    * @return The slot object on which the method was called.
    */
  def defineSizeMapping(sizeMapping: SizeMappingArray): Slot = js.native
  
  /**
    * Returns the value for the AdSense attribute associated with the given
    * key for this slot. To see service-level attributes inherited by
    * this slot, use {@link PubAdsService.get}.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .set('adsense_background_color', '#FFFFFF')
    *                         .addService(googletag.pubads());
    *
    *   slot.get('adsense_background_color');
    *   // Returns '#FFFFFF'.
    *
    * @see [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes)
    * @param key Name of the attribute to look for.
    * @return Current value for the attribute key, or `null` if the
    *     key is not present.
    */
  def get(key: String): String | Null = js.native
  
  /**
    * Returns the full path of the ad unit, with the network code and ad unit
    * path.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .addService(googletag.pubads());
    *
    *   slot.getAdUnitPath();
    *   // Returns '/1234567/sports'.
    *
    * @return Ad unit path.
    */
  def getAdUnitPath(): String = js.native
  
  /**
    * Returns the list of attribute keys set on this slot. To see the keys of
    * service-level attributes inherited by this slot, use
    * {@link PubAdsService.getAttributeKeys}.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .set('adsense_background_color', '#FFFFFF')
    *                         .set('adsense_border_color', '#AABBCC')
    *                         .addService(googletag.pubads());
    *
    *   slot.getAttributeKeys();
    *   // Returns ['adsense_background_color', 'adsense_border_color'].
    *
    * @return Array of attribute keys. Ordering is undefined.
    */
  def getAttributeKeys(): js.Array[String] = js.native
  
  /**
    * Returns the ad category exclusion labels for this slot.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .setCategoryExclusion('AirlineAd')
    *                         .setCategoryExclusion('TrainAd')
    *                         .addService(googletag.pubads());
    *
    *   slot.getCategoryExclusions();
    *   // Returns ['AirlineAd', 'TrainAd'].
    *
    * @return The ad category exclusion labels for this slot, or an empty array
    *     if none have been set.
    */
  def getCategoryExclusions(): js.Array[String] = js.native
  
  /**
    * Returns the ad response information. This is based on the last ad
    * response for the slot. If this is called when the slot has no ad,
    * `null` will be returned.
    *
    * @return The latest ad response information, or `null` if the
    *     slot has no ad.
    */
  def getResponseInformation(): ResponseInformation | Null = js.native
  
  /**
    * Returns the ID of the slot `div` provided when the slot was
    * defined.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .addService(googletag.pubads());
    *
    *   slot.getSlotElementId();
    *   // Returns 'div-1'.
    *
    * @return Slot `div` ID.
    */
  def getSlotElementId(): String = js.native
  
  /**
    * Returns a specific custom targeting parameter set on this slot.
    * Service-level targeting parameters are not included.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .setTargeting('allow_expandable', 'true')
    *                         .addService(googletag.pubads());
    *
    *   slot.getTargeting('allow_expandable');
    *   // Returns ['true'].
    *
    *   slot.getTargeting('age');
    *   // Returns [] (empty array).
    *
    * @param key The targeting key to look for.
    * @return The values associated with this key, or an empty array if there
    *     is no such key.
    */
  def getTargeting(key: String): js.Array[String] = js.native
  
  /**
    * Returns the list of all custom targeting keys set on this slot.
    * Service-level targeting keys are not included.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .setTargeting('allow_expandable', 'true')
    *                         .setTargeting('interests', ['sports', 'music'])
    *                         .addService(googletag.pubads());
    *
    *   slot.getTargetingKeys();
    *   // Returns ['interests', 'allow_expandable'].
    *
    * @return Array of targeting keys. Ordering is undefined.
    */
  def getTargetingKeys(): js.Array[String] = js.native
  
  /**
    * Sets a value for an AdSense attribute on this ad slot. This will override
    * any values set at the service level for this key.
    *
    * Calling this method more than once for the same key will override
    * previously set values for that key. All values must be set before calling
    * `display` or `refresh`.
    *
    * @example
    *   // Setting an attribute on a single ad slot.
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *            .set('adsense_background_color', '#FFFFFF')
    *            .addService(googletag.pubads());
    *
    * @see [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes)
    * @param key The name of the attribute.
    * @param value Attribute value.
    * @return The slot object on which the method was called.
    */
  def set(key: String, value: String): Slot = js.native
  
  /**
    * Sets a slot-level ad category exclusion label on this slot.
    *
    * @example
    *   // Label = AirlineAd
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *            .setCategoryExclusion('AirlineAd')
    *            .addService(googletag.pubads());
    *
    * @see [Custom labels to block ads](https://support.google.com/admanager/answer/3238504)
    * @param categoryExclusion The ad category exclusion label to add.
    * @return The slot object on which the method was called.
    */
  def setCategoryExclusion(categoryExclusion: String): Slot = js.native
  
  /**
    * Sets the click URL to which users will be redirected after clicking on
    * the ad.
    *
    * The Google Ad Manager servers still record a click even if the
    * click URL is replaced. Any landing page URL associated with the creative
    * that is served is appended to the provided value. Subsequent calls
    * overwrite the value. This works only for non-SRA requests.
    *
    * @example
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *            .setClickUrl('http://www.example.com?original_click_url=')
    *            .addService(googletag.pubads());
    *
    * @param value The click URL to set.
    * @return The slot object on which the method was called.
    */
  def setClickUrl(value: String): Slot = js.native
  
  /**
    * Sets whether the slot `div` should be hidden when there is no
    * ad in the slot. This overrides the service-level settings.
    *
    * @example
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')!
    *            .setCollapseEmptyDiv(true, true)
    *            .addService(googletag.pubads());
    *   // The above will cause the div for this slot to be collapsed
    *   // when the page is loaded, before ads are requested.
    *
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div-2')!
    *            .setCollapseEmptyDiv(true)
    *            .addService(googletag.pubads());
    *   // The above will cause the div for this slot to be collapsed
    *   // only after GPT detects that no ads are available for the slot.
    *
    * @see [Collapse empty ad slots](https://developers.google.com/publisher-tag/samples/collapse-empty-ad-slots)
    * @see [Minimize layout shift](https://developers.google.com/publisher-tag/guides/minimize-layout-shift)
    * @param collapse Whether to collapse the slot if no ad is returned.
    * @param collapseBeforeAdFetch Whether to collapse the slot even before an
    *     ad is fetched. Ignored if collapse is not `true`.
    * @return The slot object on which the method was called.
    */
  def setCollapseEmptyDiv(collapse: Boolean): Slot = js.native
  def setCollapseEmptyDiv(collapse: Boolean, collapseBeforeAdFetch: Boolean): Slot = js.native
  
  /**
    * Sets general configuration options for this slot.
    *
    * @param slotConfig The configuration object.
    */
  def setConfig(slotConfig: SlotSettingsConfig): Unit = js.native
  
  /**
    * Configures whether ads in this slot should be forced to be rendered using
    * a SafeFrame container.
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
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *            .setForceSafeFrame(true)
    *            .addService(googletag.pubads());
    *
    * @see [Render creatives using SafeFrame](https://support.google.com/admanager/answer/6023110)
    * @param forceSafeFrame `true` to force all ads in this slot to
    *     be rendered in SafeFrames and `false` to opt-out of a
    *     page-level setting (if present). Setting this to `false`
    *     when not specified at the page-level won't change anything.
    * @return The slot object on which the method was called.
    */
  def setForceSafeFrame(forceSafeFrame: Boolean): Slot = js.native
  
  /**
    * Sets the slot-level preferences for SafeFrame configuration. Any
    * unrecognized keys in the config object will be ignored. The entire config
    * will be ignored if an invalid value is passed for a recognized key.
    *
    * These slot-level preferences, if specified, will override any page-level
    * preferences.
    *
    * @example
    *   googletag.pubads().setForceSafeFrame(true);
    *
    *   // The following slot will have a sandboxed safeframe that only
    *   // disallows top-level navigation.
    *   googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')!
    *            .setSafeFrameConfig({sandbox: true})
    *            .addService(googletag.pubads());
    *
    *   // The following slot will inherit page-level settings.
    *   googletag.defineSlot('/1234567/news', [160, 600], 'div-2')!
    *            .addService(googletag.pubads());
    *
    *   googletag.display('div-1');
    *   googletag.display('div-2');
    *
    * @see [Render creatives using SafeFrame](https://support.google.com/admanager/answer/6023110)
    * @param config The configuration object.
    * @return The slot object on which the method was called.
    */
  def setSafeFrameConfig(): Slot = js.native
  def setSafeFrameConfig(config: SafeFrameConfig): Slot = js.native
  
  /**
    * Sets a custom targeting parameter for this slot. Calling this method
    * multiple times for the same key will overwrite old values. Values set
    * here will overwrite targeting parameters set at the service-level. These
    * keys are defined in your Google Ad Manager account.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!
    *                         .addService(googletag.pubads());
    *
    *   // Example with a single value for a key.
    *   slot.setTargeting('allow_expandable', 'true');
    *
    *   // Example with multiple values for a key inside in an array.
    *   slot.setTargeting('interests', ['sports', 'music']);
    *
    * @see [Key-value targeting](https://developers.google.com/publisher-tag/guides/key-value-targeting)
    * @param key Targeting parameter key.
    * @param value Targeting parameter value or array of values.
    * @return The slot object on which the method was called.
    */
  def setTargeting(key: String, value: String): Slot = js.native
  def setTargeting(key: String, value: js.Array[String]): Slot = js.native
  
  /**
    * Sets custom targeting parameters for this slot, from a key:value map
    * in a JSON object. This is the same as calling {@link Slot.setTargeting}
    * for all the key values of the object. These keys are defined in your
    * Google Ad Manager account.
    *
    * **Notes:**
    *
    * - In case of overwriting, only the last value will be kept.
    * - If the value is an array, any previous value will be overwritten, not
    *   merged.
    * - Values set here will overwrite targeting parameters set at the
    *   service-level.
    *
    * @example
    *   const slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div')!;
    *
    *   slot.updateTargetingFromMap({
    *     'color': 'red',
    *     'interests': ['sports','music','movies']
    *   });
    *
    * @param map Targeting parameter key:value map.
    * @return The slot object on which the method was called.
    */
  def updateTargetingFromMap(map: StringDictionary[String | js.Array[String]]): Slot = js.native
}
