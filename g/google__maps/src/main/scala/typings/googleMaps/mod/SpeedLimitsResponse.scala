package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedLimitsResponse extends js.Object {
  /** an array of snapped points. This array is present only if the request contained a path parameter. */
  var snappedPoints: js.Array[SnappedPoint]
  /** An array of road metadata. */
  var speedLimits: js.Array[SpeedLimit]
}

object SpeedLimitsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[SnappedPoint], speedLimits: js.Array[SpeedLimit]): SpeedLimitsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any], speedLimits = speedLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimitsResponse]
  }
}

