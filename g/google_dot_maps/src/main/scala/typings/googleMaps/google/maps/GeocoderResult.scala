package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.places.PlacePlusCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single geocoder result retrieved from the geocode server. A geocode
  * request may return multiple result objects. Note that though this result is
  * &quot;JSON-like,&quot; it is not strictly JSON, as it indirectly includes a
  * <code>LatLng</code> object.
  */
trait GeocoderResult extends StObject {
  
  /**
    * An array of <code>GeocoderAddressComponent</code>s
    */
  var address_components: js.Array[GeocoderAddressComponent]
  
  /**
    * A string containing the human-readable address of this location.
    */
  var formatted_address: String
  
  /**
    * A <code>GeocoderGeometry</code> object
    */
  var geometry: GeocoderGeometry
  
  /**
    * Whether the geocoder did not return an exact match for the original
    * request, though it was able to match part of the requested address. If an
    * exact match, the value will be <code>undefined</code>.
    */
  var partial_match: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The place ID associated with the location. Place IDs uniquely identify a
    * place in the Google Places database and on Google Maps. Learn more about
    * <a
    * href="https://developers.google.com/maps/documentation/places/web-service/place-id">Place
    * IDs</a> in the Places API developer guide.
    */
  var place_id: String
  
  /**
    * The plus code associated with the location.
    */
  var plus_code: js.UndefOr[PlacePlusCode] = js.undefined
  
  /**
    * An array of strings denoting all the localities contained in a postal
    * code. This is only present when the result is a postal code that contains
    * multiple localities.
    */
  var postcode_localities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of strings denoting the type of the returned geocoded element.
    * For a list of possible strings, refer to the <a href=
    * "https://developers.google.com/maps/documentation/javascript/geocoding#GeocodingAddressTypes">
    * Address Component Types</a> section of the Developer&#39;s Guide.
    */
  var types: js.Array[String]
}
object GeocoderResult {
  
  inline def apply(
    address_components: js.Array[GeocoderAddressComponent],
    formatted_address: String,
    geometry: GeocoderGeometry,
    place_id: String,
    types: js.Array[String]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderResult] (val x: Self) extends AnyVal {
    
    inline def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value*))
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: GeocoderGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setPartial_match(value: Boolean): Self = StObject.set(x, "partial_match", value.asInstanceOf[js.Any])
    
    inline def setPartial_matchUndefined: Self = StObject.set(x, "partial_match", js.undefined)
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlus_code(value: PlacePlusCode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
    
    inline def setPlus_codeUndefined: Self = StObject.set(x, "plus_code", js.undefined)
    
    inline def setPostcode_localities(value: js.Array[String]): Self = StObject.set(x, "postcode_localities", value.asInstanceOf[js.Any])
    
    inline def setPostcode_localitiesUndefined: Self = StObject.set(x, "postcode_localities", js.undefined)
    
    inline def setPostcode_localitiesVarargs(value: String*): Self = StObject.set(x, "postcode_localities", js.Array(value*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
