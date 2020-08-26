package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnappedSpeedLimitsRequest extends js.Object {
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
  var path: js.Array[LatLng] = js.native
  /**
    * Whether to return speed limits in kilometers or miles per hour. This can be set to either `KPH` or `MPH`.
    *
    * @default SpeedLimitUnit.KPH
    */
  var units: js.UndefOr[SpeedLimitUnit] = js.native
}

object SnappedSpeedLimitsRequest {
  @scala.inline
  def apply(path: js.Array[LatLng]): SnappedSpeedLimitsRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnappedSpeedLimitsRequest]
  }
  @scala.inline
  implicit class SnappedSpeedLimitsRequestOps[Self <: SnappedSpeedLimitsRequest] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: LatLng*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[LatLng]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnits(value: SpeedLimitUnit): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
  
}

