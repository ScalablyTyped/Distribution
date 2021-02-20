package typings.googleMaps.mod

import typings.googleMaps.anon.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestRoadsResponse extends StObject {
  
  /** An array of snapped points. */
  var snappedPoints: js.Array[Location] = js.native
}
object NearestRoadsResponse {
  
  @scala.inline
  def apply(snappedPoints: js.Array[Location]): NearestRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestRoadsResponse]
  }
  
  @scala.inline
  implicit class NearestRoadsResponseMutableBuilder[Self <: NearestRoadsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnappedPoints(value: js.Array[Location]): Self = StObject.set(x, "snappedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnappedPointsVarargs(value: Location*): Self = StObject.set(x, "snappedPoints", js.Array(value :_*))
  }
}
