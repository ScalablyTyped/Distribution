package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapToRoadsResponse extends StObject {
  
  /** An array of snapped points. */
  var snappedPoints: js.Array[SnappedPoint]
}
object SnapToRoadsResponse {
  
  inline def apply(snappedPoints: js.Array[SnappedPoint]): SnapToRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapToRoadsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapToRoadsResponse] (val x: Self) extends AnyVal {
    
    inline def setSnappedPoints(value: js.Array[SnappedPoint]): Self = StObject.set(x, "snappedPoints", value.asInstanceOf[js.Any])
    
    inline def setSnappedPointsVarargs(value: SnappedPoint*): Self = StObject.set(x, "snappedPoints", js.Array(value*))
  }
}
