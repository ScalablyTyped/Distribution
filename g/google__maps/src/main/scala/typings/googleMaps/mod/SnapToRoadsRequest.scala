package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapToRoadsRequest extends js.Object {
  /**
    * Whether to interpolate a path to include all points forming the full road-geometry.
    * When true, additional interpolated points will also be returned, resulting in a path that smoothly follows
    * the geometry of the road, even around corners and through tunnels.
    * Interpolated paths will most likely contain more points than the original path.
    *
    * @default false
    */
  var interpolate: js.UndefOr[Boolean] = js.undefined
  /**
    * The path to be snapped. The `path` parameter accepts a list of latitude/longitude pairs.
    * Latitude and longitude values should be separated by commas. Coordinates should be separated by the pipe character: `"|"`.
    * For example: `path=60.170880,24.942795|60.170879,24.942796|60.170877,24.942796`.
    *
    * **Note:** The snapping algorithm works best for points that are not too far apart.
    * If you observe odd snapping behavior, try creating paths that have points closer together.
    * To ensure the best snap-to-road quality, you should aim to provide paths on which consecutive pairs
    *  of points are within 300m of each other. This will also help in handling any isolated, long jumps between
    * consecutive points caused by GPS signal loss, or noise.
    */
  var path: js.Array[LatLng]
}

object SnapToRoadsRequest {
  @scala.inline
  def apply(path: js.Array[LatLng], interpolate: js.UndefOr[Boolean] = js.undefined): SnapToRoadsRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolate)) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapToRoadsRequest]
  }
}

