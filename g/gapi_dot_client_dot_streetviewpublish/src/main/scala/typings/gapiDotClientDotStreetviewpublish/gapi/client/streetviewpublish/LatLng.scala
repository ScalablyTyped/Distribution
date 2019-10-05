package typings.gapiDotClientDotStreetviewpublish.gapi.client.streetviewpublish

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
  def apply(latitude: Int | Double = null, longitude: Int | Double = null): LatLng = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLng]
  }
}

