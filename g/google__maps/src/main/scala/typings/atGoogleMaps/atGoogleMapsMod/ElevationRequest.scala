package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationRequest extends js.Object {
  /**
    * defines the location(s) on the earth from which to return elevation data.
    * This parameter takes either a single location as a comma-separated {latitude,longitude} pair (e.g. "40.714728,-73.998672")
    * or multiple latitude/longitude pairs passed as an array or as an encoded polyline.
    */
  var locations: js.Array[LatLng]
}

object ElevationRequest {
  @scala.inline
  def apply(locations: js.Array[LatLng]): ElevationRequest = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElevationRequest]
  }
}

