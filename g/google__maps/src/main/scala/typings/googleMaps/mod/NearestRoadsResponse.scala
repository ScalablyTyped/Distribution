package typings.googleMaps.mod

import typings.googleMaps.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestRoadsResponse extends js.Object {
  /** An array of snapped points. */
  var snappedPoints: js.Array[Location]
}

object NearestRoadsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[Location]): NearestRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestRoadsResponse]
  }
}

