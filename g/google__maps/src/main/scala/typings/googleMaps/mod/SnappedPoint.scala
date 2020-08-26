package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnappedPoint extends js.Object {
  /** contains a `latitude` and `longitude` value. */
  var location: LatLngLiteralVerbose = js.native
  /**
    * An integer that indicates the corresponding value in the original request.
    * Each value in the request should map to a snapped value in the response.
    * These values are indexed from `0`, so a point with an `originalIndex` of `4` will be the snapped value
    * of the 5th latitude/longitude passed to the `path` parameter.
    */
  var originalIndex: Double = js.native
  /**
    * A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments.
    * The `placeId` can be passed in a speed limits request to determine the speed limit along that road segment.
    */
  var placeId: String = js.native
}

object SnappedPoint {
  @scala.inline
  def apply(location: LatLngLiteralVerbose, originalIndex: Double, placeId: String): SnappedPoint = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnappedPoint]
  }
  @scala.inline
  implicit class SnappedPointOps[Self <: SnappedPoint] (val x: Self) extends AnyVal {
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
    def setLocation(value: LatLngLiteralVerbose): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalIndex(value: Double): Self = this.set("originalIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
  }
  
}

