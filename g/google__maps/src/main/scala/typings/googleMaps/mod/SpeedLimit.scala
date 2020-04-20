package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedLimit extends js.Object {
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
}

