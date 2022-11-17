package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal which represents a circle.
  */
trait CircleLiteral
  extends StObject
     with CircleOptions {
  
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
  
  extension [Self <: CircleLiteral](x: Self) {
    
    inline def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
