package typings.googleMaps.mod

import typings.googleMaps.anon.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearestRoadsResponse extends StObject {
  
  /** An array of snapped points. */
  var snappedPoints: js.Array[Location]
}
object NearestRoadsResponse {
  
  inline def apply(snappedPoints: js.Array[Location]): NearestRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestRoadsResponse]
  }
  
  extension [Self <: NearestRoadsResponse](x: Self) {
    
    inline def setSnappedPoints(value: js.Array[Location]): Self = StObject.set(x, "snappedPoints", value.asInstanceOf[js.Any])
    
    inline def setSnappedPointsVarargs(value: Location*): Self = StObject.set(x, "snappedPoints", js.Array(value*))
  }
}
