package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodingResponse[STATUSES] extends js.Object {
  /**
    * When the geocoder returns a status code other than `OK`, there may be an additional `error_message` field
    * within the Geocoding response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: java.lang.String
  /**
    * contains an array of geocoded address information and geometry information.
    *
    * Generally, only one entry in the `"results"` array is returned for address lookups,though the geocoder may return several results
    * when address queries are ambiguous.
    */
  var results: js.Array[GeocodingResult]
  /** contains metadata on the request. */
  var status: STATUSES
}

object GeocodingResponse {
  @scala.inline
  def apply[STATUSES](error_message: java.lang.String, results: js.Array[GeocodingResult], status: STATUSES): GeocodingResponse[STATUSES] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error_message")(error_message)
    __obj.updateDynamic("results")(results)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodingResponse[STATUSES]]
  }
}

