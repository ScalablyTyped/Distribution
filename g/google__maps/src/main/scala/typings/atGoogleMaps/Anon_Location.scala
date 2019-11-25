package typings.atGoogleMaps

import typings.atGoogleMaps.atGoogleMapsMod.LatLngLiteralVerbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  /** Contains a `latitude` and `longitude` value. */
  var location: LatLngLiteralVerbose
  /**
    * An integer that indicates the corresponding value in the original request.
    * Each point in the request maps to at most two segmentsin the response:
    *  - If there are no nearby roads, no segment is returned.
    *  - If the nearest road is one-way, one segment is returned.
    *  - If the nearest road is bidirectional, two segments are returned.
    */
  var originalIndex: Double
  /**
    * A unique identifier for a place. All place IDs returned by the Roads API correspond to road segments.
    * Place IDs can be used with other Google APIs, including the Places SDK and the Maps JavaScript API.
    * For example, if you need to get road names for the snapped points returned by the Roads API,
    * you can pass the `placeId` to the Places SDK or the Geocoding API. Within the Roads API,
    * you can pass the `placeId` in a speed limits request to determine the speed limit along that road segment.
    */
  var placeId: String
}

object Anon_Location {
  @scala.inline
  def apply(location: LatLngLiteralVerbose, originalIndex: Double, placeId: String): Anon_Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Location]
  }
}

