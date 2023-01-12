package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnappedSpeedLimitsRequest extends StObject {
  
  /**
    * A list of latitude/longitude pairs representing a path. Latitude and longitude values must be separated by commas.
    * Latitude/longitude pairs must be separated by the pipe character: "|".
    * When you supply the `path` parameter, the API first snaps the path to the most likely road traveled by a vehicle
    * (as it does for the [snapToRoads](https://developers.google.com/maps/documentation/roads/snap) request),
    * then determines the speed limit for the relevant road segment.
    * If you don't want the API to snap the path, you must pass a `placeId` parameter as explained below.
    * The following example shows the `path` parameter with three latitude/longitude pairs:
    * `path=60.170880,24.942795|60.170879,24.942796|60.170877,24.942796`.
    */
  var path: js.Array[LatLng]
  
  /**
    * Whether to return speed limits in kilometers or miles per hour. This can be set to either `KPH` or `MPH`.
    *
    * @default SpeedLimitUnit.KPH
    */
  var units: js.UndefOr[SpeedLimitUnit] = js.undefined
}
object SnappedSpeedLimitsRequest {
  
  inline def apply(path: js.Array[LatLng]): SnappedSpeedLimitsRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnappedSpeedLimitsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnappedSpeedLimitsRequest] (val x: Self) extends AnyVal {
    
    inline def setPath(value: js.Array[LatLng]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: LatLng*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setUnits(value: SpeedLimitUnit): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
