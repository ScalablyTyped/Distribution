package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLiteral
  extends StObject
     with CircleOptions
     with _LocationBias {
  
  /**
    * The center of the Circle.
    */
  @JSName("center")
  var center_CircleLiteral: LatLng | LatLngLiteral
  
  /**
    * The radius in meters on the Earth&#39;s surface.
    */
  @JSName("radius")
  var radius_CircleLiteral: Double
}
object CircleLiteral {
  
  inline def apply(center: LatLng | LatLngLiteral, radius: Double): CircleLiteral = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleLiteral] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
