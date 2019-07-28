package typings.atGoogleMaps.atGoogleMapsMod

import typings.atGoogleMaps.Anon_Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestRoadsResponse extends js.Object {
  /** An array of snapped points. */
  var snappedPoints: js.Array[Anon_Location]
}

object NearestRoadsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[Anon_Location]): NearestRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints)
  
    __obj.asInstanceOf[NearestRoadsResponse]
  }
}

