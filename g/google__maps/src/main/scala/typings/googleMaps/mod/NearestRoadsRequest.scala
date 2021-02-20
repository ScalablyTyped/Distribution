package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestRoadsRequest extends StObject {
  
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
  implicit class NearestRoadsRequestMutableBuilder[Self <: NearestRoadsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[LatLng]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: LatLng*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
