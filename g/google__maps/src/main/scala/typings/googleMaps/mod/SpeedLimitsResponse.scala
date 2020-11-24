package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeedLimitsResponse extends js.Object {
  
  /** an array of snapped points. This array is present only if the request contained a path parameter. */
  var snappedPoints: js.Array[SnappedPoint] = js.native
  
  /** An array of road metadata. */
  var speedLimits: js.Array[SpeedLimit] = js.native
}
object SpeedLimitsResponse {
  
  @scala.inline
  def apply(snappedPoints: js.Array[SnappedPoint], speedLimits: js.Array[SpeedLimit]): SpeedLimitsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any], speedLimits = speedLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimitsResponse]
  }
  
  @scala.inline
  implicit class SpeedLimitsResponseOps[Self <: SpeedLimitsResponse] (val x: Self) extends AnyVal {
    
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
    def setSnappedPointsVarargs(value: SnappedPoint*): Self = this.set("snappedPoints", js.Array(value :_*))
    
    @scala.inline
    def setSnappedPoints(value: js.Array[SnappedPoint]): Self = this.set("snappedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedLimitsVarargs(value: SpeedLimit*): Self = this.set("speedLimits", js.Array(value :_*))
    
    @scala.inline
    def setSpeedLimits(value: js.Array[SpeedLimit]): Self = this.set("speedLimits", value.asInstanceOf[js.Any])
  }
}
