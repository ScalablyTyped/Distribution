package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationAlongPathRequest extends js.Object {
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
}

