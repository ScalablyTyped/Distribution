package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationResult extends js.Object {
  /** An `elevation` element indicating the elevation of the location in meters. */
  var elevation: scala.Double
  /**
    * A `location` element (containing `lat` and `lng` elements) of the position for which elevation data is being computed.
    * Note that for path requests, the set of `location` elements will contain the sampled points along the path.
    */
  var location: LatLngLiteral
  /**
    * A `resolution` value, indicating the maximum distance between data points from which the elevation was interpolated, in meters.
    * This property will be missing if the resolution is not known.
    * Note that elevation data becomes more coarse (larger `resolution` values) when multiple points are passed.
    * To obtain the most accurate elevation value for a point, it should be queried independently.
    */
  var resolution: scala.Double
}

object ElevationResult {
  @scala.inline
  def apply(elevation: scala.Double, location: LatLngLiteral, resolution: scala.Double): ElevationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elevation")(elevation)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("resolution")(resolution)
    __obj.asInstanceOf[ElevationResult]
  }
}

