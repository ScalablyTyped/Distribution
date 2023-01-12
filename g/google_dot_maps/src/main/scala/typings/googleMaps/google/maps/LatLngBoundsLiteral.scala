package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.places.LocationRestriction
import typings.googleMaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literals are accepted in place of <code>LatLngBounds</code> objects
  * throughout the API. These are automatically converted to
  * <code>LatLngBounds</code> objects. All <code>south</code>,
  * <code>west</code>, <code>north</code> and <code>east</code> must be set,
  * otherwise an exception is thrown.
  */
trait LatLngBoundsLiteral
  extends StObject
     with LocationRestriction
     with _LocationBias {
  
  /**
    * East longitude in degrees. Values outside the range [-180, 180] will be
    * wrapped to the range [-180, 180). For example, a value of -190 will be
    * converted to 170. A value of 190 will be converted to -170. This reflects
    * the fact that longitudes wrap around the globe.
    */
  var east: Double
  
  /**
    * North latitude in degrees. Values will be clamped to the range [-90, 90].
    * This means that if the value specified is less than -90, it will be set
    * to -90. And if the value is greater than 90, it will be set to 90.
    */
  var north: Double
  
  /**
    * South latitude in degrees. Values will be clamped to the range [-90, 90].
    * This means that if the value specified is less than -90, it will be set
    * to -90. And if the value is greater than 90, it will be set to 90.
    */
  var south: Double
  
  /**
    * West longitude in degrees. Values outside the range [-180, 180] will be
    * wrapped to the range [-180, 180). For example, a value of -190 will be
    * converted to 170. A value of 190 will be converted to -170. This reflects
    * the fact that longitudes wrap around the globe.
    */
  var west: Double
}
object LatLngBoundsLiteral {
  
  inline def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsLiteral = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBoundsLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLngBoundsLiteral] (val x: Self) extends AnyVal {
    
    inline def setEast(value: Double): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
    
    inline def setNorth(value: Double): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
    
    inline def setSouth(value: Double): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
    
    inline def setWest(value: Double): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
  }
}
