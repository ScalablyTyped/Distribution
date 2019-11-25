package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationInfo extends js.Object {
  /** lat/long location coordinates. */
  var latLng: js.UndefOr[LatLng] = js.undefined
}

object LocationInfo {
  @scala.inline
  def apply(latLng: LatLng = null): LocationInfo = {
    val __obj = js.Dynamic.literal()
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationInfo]
  }
}

