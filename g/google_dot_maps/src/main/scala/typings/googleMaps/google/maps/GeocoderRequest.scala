package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification for a geocoding request to be sent to the
  * <code>Geocoder</code>.
  */
trait GeocoderRequest extends StObject {
  
  /**
    * Address to geocode. One, and only one, of <code>address</code>,
    * <code>location</code> and <code>placeId</code> must be supplied.
    */
  var address: js.UndefOr[Null | String] = js.undefined
  
  /**
    * <code>LatLngBounds</code> within which to search. Optional.
    */
  var bounds: js.UndefOr[Null | LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  /**
    * Components are used to restrict results to a specific area. A filter
    * consists of one or more of: <code>route</code>, <code>locality</code>,
    * <code>administrativeArea</code>, <code>postalCode</code>,
    * <code>country</code>. Only the results that match all the filters will be
    * returned. Filter values support the same methods of spelling correction
    * and partial matching as other geocoding requests. Optional.
    */
  var componentRestrictions: js.UndefOr[Null | GeocoderComponentRestrictions] = js.undefined
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * A language identifier for the language in which results should be
    * returned, when possible. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[Null | String] = js.undefined
  
  /**
    * <code>LatLng</code> (or <code>LatLngLiteral</code>) for which to search.
    * The geocoder performs a reverse geocode. See <a
    * href="https://developers.google.com/maps/documentation/javascript/geocoding#ReverseGeocoding">
    * Reverse Geocoding</a> for more information. One, and only one, of
    * <code>address</code>, <code>location</code> and <code>placeId</code> must
    * be supplied.
    */
  var location: js.UndefOr[Null | LatLng | LatLngLiteral] = js.undefined
  
  /**
    * The place ID associated with the location. Place IDs uniquely identify a
    * place in the Google Places database and on Google Maps. Learn more about
    * <a
    * href="https://developers.google.com/maps/documentation/places/web-service/place-id">place
    * IDs</a> in the Places API developer guide. The geocoder performs a
    * reverse geocode. See <a
    * href="https://developers.google.com/maps/documentation/javascript/geocoding#ReverseGeocoding">Reverse
    * Geocoding</a> for more information. One, and only one, of
    * <code>address</code>, <code>location</code> and <code>placeId</code> must
    * be supplied.
    */
  var placeId: js.UndefOr[Null | String] = js.undefined
  
  /**
    * Country code used to bias the search, specified as a two-character
    * (non-numeric) Unicode region subtag / CLDR identifier. Optional. See <a
    * href="http://developers.google.com/maps/coverage">Google Maps Platform
    * Coverage Details</a> for supported regions.
    */
  var region: js.UndefOr[Null | String] = js.undefined
}
object GeocoderRequest {
  
  inline def apply(): GeocoderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderRequest] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsNull: Self = StObject.set(x, "componentRestrictions", null)
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
