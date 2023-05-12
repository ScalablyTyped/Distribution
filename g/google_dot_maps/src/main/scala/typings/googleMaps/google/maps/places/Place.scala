package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Place extends StObject {
  
  /**
    * The collection of address components for this Place’s location. Empty
    * object if there is no known address data. <code>undefined</code> if the
    * address data has not been called for from the server.
    */
  var addressComponents: js.UndefOr[js.Array[AddressComponent]] = js.native
  
  /**
    * The representation of the Place’s address in the <a
    * href="http://microformats.org/wiki/adr">adr microformat</a>.
    */
  var adrFormatAddress: js.UndefOr[String | Null] = js.native
  
  /**
    * Attribution text to be displayed for this Place result.
    */
  var attributions: js.UndefOr[js.Array[Attribution]] = js.native
  
  /**
    * The location&#39;s operational status. <code>null</code> if there is no
    * known status. <code>undefined</code> if the status data has not been
    * loaded from the server.
    */
  var businessStatus: js.UndefOr[BusinessStatus | Null] = js.native
  
  /**
    * The location&#39;s display name. <code>null</code> if there is no name.
    * <code>undefined</code> if the name data has not been loaded from the
    * server.
    */
  var displayName: js.UndefOr[String | Null] = js.native
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    */
  def fetchFields(options: FetchFieldsRequest): js.Promise[typings.googleMaps.anon.Place] = js.native
  
  /**
    * The locations’s full address.
    */
  var formattedAddress: js.UndefOr[String | Null] = js.native
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Calculates the timestamp (as milliseconds since the epoch, suitable for
    * use with <code>new Date()</code>) representing the next OpeningHoursTime.
    * Returns undefined if the data is insufficient to calculate the result, or
    * this place is not operational.
    */
  def getNextOpeningTime(): js.Promise[js.UndefOr[js.Date]] = js.native
  def getNextOpeningTime(date: js.Date): js.Promise[js.UndefOr[js.Date]] = js.native
  
  /**
    * URL of the official Google page for this place. This is the Google-owned
    * page that contains the best available information about the Place.
    */
  var googleMapsURI: js.UndefOr[String | Null] = js.native
  
  /**
    * Whether a place has curbside pickup. Returns &#39;true&#39; or
    * &#39;false&#39; if the value is known. Returns &#39;null&#39; if the
    * value is unknown. Returns &#39;undefined&#39; if this field has not yet
    * been requested.
    */
  var hasCurbsidePickup: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place has delivery. Returns &#39;true&#39; or &#39;false&#39;
    * if the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var hasDelivery: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place has dine in. Returns &#39;true&#39; or &#39;false&#39; if
    * the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var hasDineIn: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place has takeout. Returns &#39;true&#39; or &#39;false&#39; if
    * the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var hasTakeout: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place has a wheelchair accessible entrance. Returns
    * &#39;true&#39; or &#39;false&#39; if the value is known. Returns
    * &#39;null&#39; if the value is unknown. Returns &#39;undefined&#39; if
    * this field has not yet been requested.
    */
  var hasWheelchairAccessibleEntrance: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * The default HEX color code for the place&#39;s category.
    */
  var iconBackgroundColor: js.UndefOr[String | Null] = js.native
  
  /**
    * The unique place id.
    */
  var id: String = js.native
  
  /**
    * The Place’s phone number in international format. International format
    * includes the country code, and is prefixed with the plus (+) sign.
    */
  var internationalPhoneNumber: js.UndefOr[String | Null] = js.native
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Check if the place is open at the given datetime. Resolves with
    * <code>undefined</code> if the known data for the location is insufficient
    * to calculate this, e.g. if the opening hours are unregistered.
    * @param date Defaults to now.
    */
  def isOpen(): js.Promise[js.UndefOr[Boolean]] = js.native
  def isOpen(date: js.Date): js.Promise[js.UndefOr[Boolean]] = js.native
  
  /**
    * Whether a place is reservable. Returns &#39;true&#39; or &#39;false&#39;
    * if the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var isReservable: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * The Place’s position.
    */
  var location: js.UndefOr[LatLng | Null] = js.native
  
  /**
    * The Place’s phone number, formatted according to the <a
    * href="http://en.wikipedia.org/wiki/Local_conventions_for_writing_telephone_numbers">number&#39;s
    * regional convention</a>.
    */
  var nationalPhoneNumber: js.UndefOr[String | Null] = js.native
  
  var openingHours: js.UndefOr[OpeningHours | Null] = js.native
  
  /**
    * Photos of this Place. The collection will contain up to ten {@link
    * google.maps.places.Photo} objects.
    */
  var photos: js.UndefOr[js.Array[Photo]] = js.native
  
  var plusCode: js.UndefOr[PlusCode | Null] = js.native
  
  /**
    * The price level of the Place. This property can return any of the
    * following values <ul style="list-style-type: none;">
    * <li><code>Free</code></li> <li><code>Inexpensive</code></li>
    * <li><code>Moderate</code></li> <li><code>Expensive</code></li>
    * <li><code>Very Expensive</code></li> </ul>
    */
  var priceLevel: js.UndefOr[PriceLevel | Null] = js.native
  
  /**
    * A rating, between 1.0 to 5.0, based on user reviews of this Place.
    */
  var rating: js.UndefOr[Double | Null] = js.native
  
  /**
    * The requested language for this place.
    */
  var requestedLanguage: js.UndefOr[String | Null] = js.native
  
  /**
    * The requested region for this place.
    */
  var requestedRegion: js.UndefOr[String | Null] = js.native
  
  /**
    * A list of reviews for this Place.
    */
  var reviews: js.UndefOr[js.Array[Review]] = js.native
  
  /**
    * Whether a place serves beer. Returns &#39;true&#39; or &#39;false&#39; if
    * the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var servesBeer: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place serves breakfast. Returns &#39;true&#39; or
    * &#39;false&#39; if the value is known. Returns &#39;null&#39; if the
    * value is unknown. Returns &#39;undefined&#39; if this field has not yet
    * been requested.
    */
  var servesBreakfast: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place serves brunch. Returns &#39;true&#39; or &#39;false&#39;
    * if the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var servesBrunch: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place serves dinner. Returns &#39;true&#39; or &#39;false&#39;
    * if the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var servesDinner: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place serves lunch. Returns &#39;true&#39; or &#39;false&#39;
    * if the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var servesLunch: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place serves vegetarian food. Returns &#39;true&#39; or
    * &#39;false&#39; if the value is known. Returns &#39;null&#39; if the
    * value is unknown. Returns &#39;undefined&#39; if this field has not yet
    * been requested.
    */
  var servesVegetarianFood: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether a place serves wine. Returns &#39;true&#39; or &#39;false&#39; if
    * the value is known. Returns &#39;null&#39; if the value is unknown.
    * Returns
    * &#39;undefined&#39; if this field has not yet been requested.
    */
  var servesWine: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * URI to the svg image mask resource that can be used to represent a
    * place’s category.
    */
  var svgIconMaskURI: js.UndefOr[String | Null] = js.native
  
  def toJSON(): js.Object = js.native
  
  /**
    * An array of <a
    * href="https://developers.google.com/maps/documentation/places/web-service/supported_types">types
    * for this Place</a> (for example, <code>[&quot;political&quot;,
    * &quot;locality&quot;]</code> or <code>[&quot;restaurant&quot;,
    * &quot;establishment&quot;]</code>).
    */
  var types: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The number of user ratings which contributed to this Place’s {@link
    * google.maps.places.Place.rating}.
    */
  var userRatingCount: js.UndefOr[Double | Null] = js.native
  
  /**
    * The offset from UTC of the Place’s current timezone, in minutes. For
    * example, Austrialian Eastern Standard Time (GMT+10) in daylight savings
    * is 11 hours ahead of UTC, so the <code>utc_offset_minutes</code> will be
    * <code>660</code>. For timezones behind UTC, the offset is negative. For
    * example, the <code>utc_offset_minutes</code> is <code>-60</code> for Cape
    * Verde.
    */
  var utcOffsetMinutes: js.UndefOr[Double | Null] = js.native
  
  /**
    * The preferred viewport when displaying this Place on a map.
    */
  var viewport: js.UndefOr[LatLngBounds | Null] = js.native
  
  /**
    * The authoritative website for this Place, such as a business&#39;
    * homepage.
    */
  var websiteURI: js.UndefOr[String | Null] = js.native
}
