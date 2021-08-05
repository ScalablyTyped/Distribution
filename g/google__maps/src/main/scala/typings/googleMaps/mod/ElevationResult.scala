package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationResult extends StObject {
  
  /** An `elevation` element indicating the elevation of the location in meters. */
  var elevation: Double
  
  /**
    * A `location` element (containing `lat` and `lng` elements) of the position for which elevation data is being computed.
    * Note that for path requests, the set of `location` elements will contain the sampled points along the path.
    */
  var location: LatLngLiteral
  
  /**
    * A `resolution` value, indicating the maximum distance between data points from which the elevation was interpolated, in meters.
    * This property will be missing if the resolution is not known.
    * Note that elevation data becomes more coarse (larger `resolution` values) when multiple points are passed.
    * To obtain the most accurate elevation value for a point, it should be queried independently.
    */
  var resolution: Double
}
object ElevationResult {
  
  inline def apply(elevation: Double, location: LatLngLiteral, resolution: Double): ElevationResult = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationResult]
  }
  
  extension [Self <: ElevationResult](x: Self) {
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
