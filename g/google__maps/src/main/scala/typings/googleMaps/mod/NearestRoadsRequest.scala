package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestRoadsRequest extends js.Object {
  
  /**
    * A list of latitude/longitude pairs. Latitude and longitude values should be separated by commas.
    * Coordinates should be separated by the pipe character: "|".
    * For example: `points=60.170880,24.942795|60.170879,24.942796|60.170877,24.942796`.
    */
  var points: js.Array[LatLng] = js.native
}
object NearestRoadsRequest {
  
  @scala.inline
  def apply(points: js.Array[LatLng]): NearestRoadsRequest = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestRoadsRequest]
  }
  
  @scala.inline
  implicit class NearestRoadsRequestOps[Self <: NearestRoadsRequest] (val x: Self) extends AnyVal {
    
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
    def setPointsVarargs(value: LatLng*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[LatLng]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
}
