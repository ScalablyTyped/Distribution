package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An elevation query sent by the <code>ElevationService</code> containing the
  * path along which to return sampled data. This request defines a continuous
  * path along the earth along which elevation samples should be taken at
  * evenly-spaced distances. All paths from vertex to vertex use segments of
  * the great circle between those two points.
  */
trait PathElevationRequest extends StObject {
  
  /**
    * The path along which to collect elevation values.
    */
  var path: js.UndefOr[Null | (js.Array[LatLng | LatLngLiteral])] = js.undefined
  
  /**
    * Required. The number of equidistant points along the given path for which
    * to retrieve elevation data, including the endpoints. The number of
    * samples must be a value between 2 and 512 inclusive.
    */
  var samples: Double
}
object PathElevationRequest {
  
  inline def apply(samples: Double): PathElevationRequest = {
    val __obj = js.Dynamic.literal(samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathElevationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathElevationRequest] (val x: Self) extends AnyVal {
    
    inline def setPath(value: js.Array[LatLng | LatLngLiteral]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: (LatLng | LatLngLiteral)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
  }
}
