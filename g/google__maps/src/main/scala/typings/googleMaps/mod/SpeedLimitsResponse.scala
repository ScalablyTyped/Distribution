package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeedLimitsResponse extends StObject {
  
  /** an array of snapped points. This array is present only if the request contained a path parameter. */
  var snappedPoints: js.Array[SnappedPoint]
  
  /** An array of road metadata. */
  var speedLimits: js.Array[SpeedLimit]
}
object SpeedLimitsResponse {
  
  inline def apply(snappedPoints: js.Array[SnappedPoint], speedLimits: js.Array[SpeedLimit]): SpeedLimitsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any], speedLimits = speedLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimitsResponse]
  }
  
  extension [Self <: SpeedLimitsResponse](x: Self) {
    
    inline def setSnappedPoints(value: js.Array[SnappedPoint]): Self = StObject.set(x, "snappedPoints", value.asInstanceOf[js.Any])
    
    inline def setSnappedPointsVarargs(value: SnappedPoint*): Self = StObject.set(x, "snappedPoints", js.Array(value*))
    
    inline def setSpeedLimits(value: js.Array[SpeedLimit]): Self = StObject.set(x, "speedLimits", value.asInstanceOf[js.Any])
    
    inline def setSpeedLimitsVarargs(value: SpeedLimit*): Self = StObject.set(x, "speedLimits", js.Array(value*))
  }
}
