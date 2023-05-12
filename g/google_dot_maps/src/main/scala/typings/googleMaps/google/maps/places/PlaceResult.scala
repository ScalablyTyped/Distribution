package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.GeocoderAddressComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceResult extends StObject {
  
  /**
    * The collection of address components for this Place’s location. Only
    * available with {@link google.maps.places.PlacesService.getDetails}.
    */
  var address_components: js.UndefOr[js.Array[GeocoderAddressComponent]] = js.undefined
  
  /**
    * The representation of the Place’s address in the <a
    * href="http://microformats.org/wiki/adr">adr microformat</a>. Only
    * available with {@link google.maps.places.PlacesService.getDetails}.
    */
  var adr_address: js.UndefOr[String] = js.undefined
  
  /**
    * The rated aspects of this Place, based on Google and Zagat user reviews.
    * The ratings are on a scale of 0 to 30.
    */
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.undefined
  
  /**
    * A flag indicating the operational status of the Place, if it is a
    * business (indicates whether the place is operational, or closed either
    * temporarily or permanently). If no data is available, the flag is not
    * present in search or details responses.
    */
  var business_status: js.UndefOr[BusinessStatus] = js.undefined
  
  /**
    * The Place’s full address.
    */
  var formatted_address: js.UndefOr[String] = js.undefined
  
  /**
    * The Place’s phone number, formatted according to the <a
    * href="http://en.wikipedia.org/wiki/Local_conventions_for_writing_telephone_numbers">
    * number&#39;s regional convention</a>. Only available with {@link
    * google.maps.places.PlacesService.getDetails}.
    */
  var formatted_phone_number: js.UndefOr[String] = js.undefined
  
  /**
    * The Place’s geometry-related information.
    */
  var geometry: js.UndefOr[PlaceGeometry] = js.undefined
  
  /**
    * Attribution text to be displayed for this Place result. Available
    * <code>html_attributions</code> are always returned regardless of what
    * <code>fields</code> have been requested, and must be displayed.
    */
  var html_attributions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * URL to an image resource that can be used to represent this Place’s
    * category.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Background color for use with a Place&#39;s icon. See also {@link
    * google.maps.places.PlaceResult.icon_mask_base_uri}.
    */
  var icon_background_color: js.UndefOr[String] = js.undefined
  
  /**
    * A truncated URL to an icon mask. Access different icon types by appending
    * a file extension to the end (i.e. <code>.svg</code> or
    * <code>.png</code>).
    */
  var icon_mask_base_uri: js.UndefOr[String] = js.undefined
  
  /**
    * The Place’s phone number in international format. International format
    * includes the country code, and is prefixed with the plus (+) sign. Only
    * available with {@link google.maps.places.PlacesService.getDetails}.
    */
  var international_phone_number: js.UndefOr[String] = js.undefined
  
  /**
    * The Place’s name. Note: In the case of user entered Places, this is the
    * raw text, as typed by the user. Please exercise caution when using this
    * data, as malicious users may try to use it as a vector for code injection
    * attacks (See <a href="http://en.wikipedia.org/wiki/Code_injection">
    * http://en.wikipedia.org/wiki/Code_injection</a>).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Defines when the Place opens or closes.
    */
  var opening_hours: js.UndefOr[PlaceOpeningHours] = js.undefined
  
  /**
    * A flag indicating whether the Place is closed, either permanently or
    * temporarily. If the place is operational, or if no data is available, the
    * flag is absent from the response.
    * @deprecated <code>permanently_closed</code> is deprecated as of May 2020
    *     and will be turned off in May 2021. Use {@link
    *     google.maps.places.PlaceResult.business_status} instead as
    *     <code>permanently_closed</code> does not distinguish between
    *     temporary and permanent closures.
    */
  var permanently_closed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Photos of this Place. The collection will contain up to ten {@link
    * google.maps.places.PlacePhoto} objects.
    */
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.undefined
  
  /**
    * A unique identifier for the Place.
    */
  var place_id: js.UndefOr[String] = js.undefined
  
  /**
    * Defines Open Location Codes or &quot;<a href="https://plus.codes/">plus
    * codes</a>&quot; for the Place.
    */
  var plus_code: js.UndefOr[PlacePlusCode] = js.undefined
  
  /**
    * The price level of the Place, on a scale of 0 to 4. Price levels are
    * interpreted as follows: <ul style="list-style-type: none;">
    * <li><code>0</code>: Free <li><code>1</code>: Inexpensive
    * <li><code>2</code>: Moderate <li><code>3</code>: Expensive
    * <li><code>4</code>: Very Expensive
    * </ul>
    */
  var price_level: js.UndefOr[Double] = js.undefined
  
  /**
    * A rating, between 1.0 to 5.0, based on user reviews of this Place.
    */
  var rating: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of reviews of this Place. Only available with {@link
    * google.maps.places.PlacesService.getDetails}.
    */
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.undefined
  
  /**
    * An array of <a
    * href="https://developers.google.com/maps/documentation/places/web-service/supported_types">
    * types for this Place</a> (for example, <code>["political",
    * "locality"]</code> or <code>["restaurant", "establishment"]</code>).
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * URL of the official Google page for this place. This is the Google-owned
    * page that contains the best available information about the Place. Only
    * available with {@link google.maps.places.PlacesService.getDetails}.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The number of user ratings which contributed to this Place’s {@link
    * google.maps.places.PlaceResult.rating}.
    */
  var user_ratings_total: js.UndefOr[Double] = js.undefined
  
  /**
    * The offset from UTC of the Place’s current timezone, in minutes. For
    * example, Sydney, Australia in daylight savings is 11 hours ahead of UTC,
    * so the <code>utc_offset</code> will be <code>660</code>. For timezones
    * behind UTC, the offset is negative. For example, the
    * <code>utc_offset</code> is <code>-60</code> for Cape Verde. Only
    * available with {@link google.maps.places.PlacesService.getDetails}.
    * @deprecated <code>utc_offset</code> is deprecated as of November 2019.
    *     Use {@link google.maps.places.PlaceResult.utc_offset_minutes}
    *     instead. See <a
    *     href="https://goo.gle/js-open-now">https://goo.gle/js-open-now</a>
    */
  var utc_offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The offset from UTC of the Place’s current timezone, in minutes. For
    * example, Sydney, Australia in daylight savings is 11 hours ahead of UTC,
    * so the <code>utc_offset_minutes</code> will be <code>660</code>. For
    * timezones behind UTC, the offset is negative. For example, the
    * <code>utc_offset_minutes</code> is <code>-60</code> for Cape Verde. Only
    * available with {@link google.maps.places.PlacesService.getDetails}.
    */
  var utc_offset_minutes: js.UndefOr[Double] = js.undefined
  
  /**
    * The simplified address for the Place, including the street name, street
    * number, and locality, but not the province/state, postal code, or
    * country. For example, Google&#39;s Sydney, Australia office has a
    * vicinity value of <code>"48 Pirrama Road, Pyrmont"</code>. Only available
    * with {@link google.maps.places.PlacesService.getDetails}.
    */
  var vicinity: js.UndefOr[String] = js.undefined
  
  /**
    * The authoritative website for this Place, such as a business&#39;
    * homepage. Only available with {@link
    * google.maps.places.PlacesService.getDetails}.
    */
  var website: js.UndefOr[String] = js.undefined
}
object PlaceResult {
  
  inline def apply(): PlaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceResult] (val x: Self) extends AnyVal {
    
    inline def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsUndefined: Self = StObject.set(x, "address_components", js.undefined)
    
    inline def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value*))
    
    inline def setAdr_address(value: String): Self = StObject.set(x, "adr_address", value.asInstanceOf[js.Any])
    
    inline def setAdr_addressUndefined: Self = StObject.set(x, "adr_address", js.undefined)
    
    inline def setAspects(value: js.Array[PlaceAspectRating]): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
    
    inline def setAspectsUndefined: Self = StObject.set(x, "aspects", js.undefined)
    
    inline def setAspectsVarargs(value: PlaceAspectRating*): Self = StObject.set(x, "aspects", js.Array(value*))
    
    inline def setBusiness_status(value: BusinessStatus): Self = StObject.set(x, "business_status", value.asInstanceOf[js.Any])
    
    inline def setBusiness_statusUndefined: Self = StObject.set(x, "business_status", js.undefined)
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setFormatted_addressUndefined: Self = StObject.set(x, "formatted_address", js.undefined)
    
    inline def setFormatted_phone_number(value: String): Self = StObject.set(x, "formatted_phone_number", value.asInstanceOf[js.Any])
    
    inline def setFormatted_phone_numberUndefined: Self = StObject.set(x, "formatted_phone_number", js.undefined)
    
    inline def setGeometry(value: PlaceGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setHtml_attributions(value: js.Array[String]): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    inline def setHtml_attributionsUndefined: Self = StObject.set(x, "html_attributions", js.undefined)
    
    inline def setHtml_attributionsVarargs(value: String*): Self = StObject.set(x, "html_attributions", js.Array(value*))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIcon_background_color(value: String): Self = StObject.set(x, "icon_background_color", value.asInstanceOf[js.Any])
    
    inline def setIcon_background_colorUndefined: Self = StObject.set(x, "icon_background_color", js.undefined)
    
    inline def setIcon_mask_base_uri(value: String): Self = StObject.set(x, "icon_mask_base_uri", value.asInstanceOf[js.Any])
    
    inline def setIcon_mask_base_uriUndefined: Self = StObject.set(x, "icon_mask_base_uri", js.undefined)
    
    inline def setInternational_phone_number(value: String): Self = StObject.set(x, "international_phone_number", value.asInstanceOf[js.Any])
    
    inline def setInternational_phone_numberUndefined: Self = StObject.set(x, "international_phone_number", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpening_hours(value: PlaceOpeningHours): Self = StObject.set(x, "opening_hours", value.asInstanceOf[js.Any])
    
    inline def setOpening_hoursUndefined: Self = StObject.set(x, "opening_hours", js.undefined)
    
    inline def setPermanently_closed(value: Boolean): Self = StObject.set(x, "permanently_closed", value.asInstanceOf[js.Any])
    
    inline def setPermanently_closedUndefined: Self = StObject.set(x, "permanently_closed", js.undefined)
    
    inline def setPhotos(value: js.Array[PlacePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: PlacePhoto*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
    
    inline def setPlus_code(value: PlacePlusCode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
    
    inline def setPlus_codeUndefined: Self = StObject.set(x, "plus_code", js.undefined)
    
    inline def setPrice_level(value: Double): Self = StObject.set(x, "price_level", value.asInstanceOf[js.Any])
    
    inline def setPrice_levelUndefined: Self = StObject.set(x, "price_level", js.undefined)
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setReviews(value: js.Array[PlaceReview]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    inline def setReviewsVarargs(value: PlaceReview*): Self = StObject.set(x, "reviews", js.Array(value*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser_ratings_total(value: Double): Self = StObject.set(x, "user_ratings_total", value.asInstanceOf[js.Any])
    
    inline def setUser_ratings_totalUndefined: Self = StObject.set(x, "user_ratings_total", js.undefined)
    
    inline def setUtc_offset(value: Double): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
    
    inline def setUtc_offsetUndefined: Self = StObject.set(x, "utc_offset", js.undefined)
    
    inline def setUtc_offset_minutes(value: Double): Self = StObject.set(x, "utc_offset_minutes", value.asInstanceOf[js.Any])
    
    inline def setUtc_offset_minutesUndefined: Self = StObject.set(x, "utc_offset_minutes", js.undefined)
    
    inline def setVicinity(value: String): Self = StObject.set(x, "vicinity", value.asInstanceOf[js.Any])
    
    inline def setVicinityUndefined: Self = StObject.set(x, "vicinity", js.undefined)
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
