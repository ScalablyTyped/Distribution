package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLng extends js.Object {
  /** The latitude in degrees. It must be in the range [-90.0, +90.0]. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude in degrees. It must be in the range [-180.0, +180.0]. */
  var longitude: js.UndefOr[Double] = js.undefined
}

object LatLng {
  @scala.inline
  def apply(latitude: js.UndefOr[Double] = js.undefined, longitude: js.UndefOr[Double] = js.undefined): LatLng = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLng]
  }
}

