package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** Position of the location on the map. */
  var latlng: js.UndefOr[LatLng] = js.undefined
  /** Name of the location to be displayed. */
  var locationName: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(latlng: LatLng = null, locationName: String = null): Location = {
    val __obj = js.Dynamic.literal()
    if (latlng != null) __obj.updateDynamic("latlng")(latlng.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

