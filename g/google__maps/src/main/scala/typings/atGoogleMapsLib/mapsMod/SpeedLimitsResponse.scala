package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedLimitsResponse extends js.Object {
  /** an array of snapped points. This array is present only if the request contained a path parameter. */
  var snappedPoints: js.Array[SnappedPoint]
  /** An array of road metadata. */
  var speedLimits: js.Array[SpeedLimit]
}

