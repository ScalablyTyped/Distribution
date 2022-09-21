package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literals are accepted in place of <code>LatLng</code> objects, as a
  * convenience, in many places. These are converted to <code>LatLng</code>
  * objects when the Maps API encounters them. <p> Examples: <pre>
  * map.setCenter({lat: -34, lng: 151});<br> new
  * google.maps.Marker({position: {lat: -34, lng: 151}, map: map}); </pre> <p
  * class="note">LatLng object literals are not supported in the Geometry
  * library.</p>
  */
trait LatLngLiteral
  extends StObject
     with _LocationBias {
  
  /**
    * Latitude in degrees. Values will be clamped to the range [-90, 90]. This
    * means that if the value specified is less than -90, it will be set to
    * -90. And if the value is greater than 90, it will be set to 90.
    */
  var lat: Double
  
  /**
    * Longitude in degrees. Values outside the range [-180, 180] will be
    * wrapped so that they fall within the range. For example, a value of -190
    * will be converted to 170. A value of 190 will be converted to -170. This
    * reflects the fact that longitudes wrap around the globe.
    */
  var lng: Double
}
object LatLngLiteral {
  
  inline def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
  
  extension [Self <: LatLngLiteral](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
