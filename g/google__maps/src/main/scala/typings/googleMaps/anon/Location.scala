package typings.googleMaps.anon

import typings.googleMaps.mod.LatLngLiteralVerbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /** Contains a `latitude` and `longitude` value. */
  var location: LatLngLiteralVerbose = js.native
  /**
    * An integer that indicates the corresponding value in the original request.
    * Each point in the request maps to at most two segmentsin the response:
    *  - If there are no nearby roads, no segment is returned.
    *  - If the nearest road is one-way, one segment is returned.
    *  - If the nearest road is bidirectional, two segments are returned.
    */
  var originalIndex: Double = js.native
  /**
    * A unique identifier for a place. All place IDs returned by the Roads API correspond to road segments.
    * Place IDs can be used with other Google APIs, including the Places SDK and the Maps JavaScript API.
    * For example, if you need to get road names for the snapped points returned by the Roads API,
    * you can pass the `placeId` to the Places SDK or the Geocoding API. Within the Roads API,
    * you can pass the `placeId` in a speed limits request to determine the speed limit along that road segment.
    */
  var placeId: String = js.native
}

object Location {
  @scala.inline
  def apply(location: LatLngLiteralVerbose, originalIndex: Double, placeId: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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

