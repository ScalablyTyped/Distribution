package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing a <code>points</code> property to describe the
  * polyline of a {@link google.maps.DirectionsStep}.
  */
trait DirectionsPolyline extends StObject {
  
  /**
    * An <a
    * href="https://developers.google.com/maps/documentation/utilities/polylinealgorithm">encoded
    * polyline</a>.
    */
  var points: String
}
object DirectionsPolyline {
  
  inline def apply(points: String): DirectionsPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsPolyline]
  }
  
  extension [Self <: DirectionsPolyline](x: Self) {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
