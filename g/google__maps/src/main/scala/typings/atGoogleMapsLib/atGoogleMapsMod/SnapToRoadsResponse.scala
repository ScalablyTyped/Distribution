package typings
package atGoogleMapsLib.atGoogleMapsMod

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
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints)
  
    __obj.asInstanceOf[SnapToRoadsResponse]
  }
}

