package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationAlongPathRequest extends StObject {
  
  /**
    * defines a path on the earth for which to return elevation data.
    * This parameter defines a set of two or more ordered {latitude,longitude} pairs defining a path along the surface of the earth.
    */
  var path: js.Array[LatLng] | String
  
  /**
    * specifies the number of sample points along a path for which to return elevation data.
    * The samples parameter divides the given path into an ordered set of equidistant points along the path.
    */
  var samples: Double
}
object ElevationAlongPathRequest {
  
  @scala.inline
  def apply(path: js.Array[LatLng] | String, samples: Double): ElevationAlongPathRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationAlongPathRequest]
  }
  
  @scala.inline
  implicit class ElevationAlongPathRequestMutableBuilder[Self <: ElevationAlongPathRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: js.Array[LatLng] | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LatLng*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
  }
}
