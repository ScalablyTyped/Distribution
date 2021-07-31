package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeedLimit extends StObject {
  
  /** A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments. */
  var placeId: String
  
  /** The speed limit for that road segment. */
  var speedLimit: Double
  
  /** Returns either `KPH` or `MPH`. */
  var units: SpeedLimitUnit
}
object SpeedLimit {
  
  @scala.inline
  def apply(placeId: String, speedLimit: Double, units: SpeedLimitUnit): SpeedLimit = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any], speedLimit = speedLimit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimit]
  }
  
  @scala.inline
  implicit class SpeedLimitMutableBuilder[Self <: SpeedLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedLimit(value: Double): Self = StObject.set(x, "speedLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnits(value: SpeedLimitUnit): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
