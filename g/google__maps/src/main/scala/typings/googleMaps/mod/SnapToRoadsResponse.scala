package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapToRoadsResponse extends js.Object {
  /** An array of snapped points. */
  var snappedPoints: js.Array[SnappedPoint]
}

object SnapToRoadsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[SnappedPoint]): SnapToRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapToRoadsResponse]
  }
}

