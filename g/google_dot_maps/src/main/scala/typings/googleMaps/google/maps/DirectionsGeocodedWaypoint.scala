package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single geocoded waypoint.
  */
trait DirectionsGeocodedWaypoint extends StObject {
  
  /**
    * Whether the geocoder did not return an exact match for the original
    * waypoint, though it was able to match part of the requested address.
    */
  var partial_match: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The place ID associated with the waypoint. Place IDs uniquely identify a
    * place in the Google Places database and on Google Maps. Learn more about
    * <a
    * href="https://developers.google.com/maps/documentation/places/web-service/place-id">Place
    * IDs</a> in the Places API developer guide.
    */
  var place_id: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings denoting the type of the returned geocoded element.
    * For a list of possible strings, refer to the <a href=
    * "https://developers.google.com/maps/documentation/javascript/geocoding#GeocodingAddressTypes">
    * Address Component Types</a> section of the Developer&#39;s Guide.
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object DirectionsGeocodedWaypoint {
  
  inline def apply(): DirectionsGeocodedWaypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsGeocodedWaypoint]
  }
  
  extension [Self <: DirectionsGeocodedWaypoint](x: Self) {
    
    inline def setPartial_match(value: Boolean): Self = StObject.set(x, "partial_match", value.asInstanceOf[js.Any])
    
    inline def setPartial_matchUndefined: Self = StObject.set(x, "partial_match", js.undefined)
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
