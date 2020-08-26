package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationAlongPathRequest extends js.Object {
  /**
    * defines a path on the earth for which to return elevation data.
    * This parameter defines a set of two or more ordered {latitude,longitude} pairs defining a path along the surface of the earth.
    */
  var path: js.Array[LatLng] | String = js.native
  /**
    * specifies the number of sample points along a path for which to return elevation data.
    * The samples parameter divides the given path into an ordered set of equidistant points along the path.
    */
  var samples: Double = js.native
}

object ElevationAlongPathRequest {
  @scala.inline
  def apply(path: js.Array[LatLng] | String, samples: Double): ElevationAlongPathRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationAlongPathRequest]
  }
  @scala.inline
  implicit class ElevationAlongPathRequestOps[Self <: ElevationAlongPathRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathVarargs(value: LatLng*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[LatLng] | String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSamples(value: Double): Self = this.set("samples", value.asInstanceOf[js.Any])
  }
  
}

