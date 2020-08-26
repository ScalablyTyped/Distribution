package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeedLimit extends js.Object {
  /** A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments. */
  var placeId: String = js.native
  /** The speed limit for that road segment. */
  var speedLimit: Double = js.native
  /** Returns either `KPH` or `MPH`. */
  var units: SpeedLimitUnit = js.native
}

object SpeedLimit {
  @scala.inline
  def apply(placeId: String, speedLimit: Double, units: SpeedLimitUnit): SpeedLimit = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any], speedLimit = speedLimit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimit]
  }
  @scala.inline
  implicit class SpeedLimitOps[Self <: SpeedLimit] (val x: Self) extends AnyVal {
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
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeedLimit(value: Double): Self = this.set("speedLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnits(value: SpeedLimitUnit): Self = this.set("units", value.asInstanceOf[js.Any])
  }
  
}

