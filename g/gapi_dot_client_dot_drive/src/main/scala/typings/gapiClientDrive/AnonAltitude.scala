package typings.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitude extends js.Object {
  /** The altitude stored in the image. */
  var altitude: js.UndefOr[Double] = js.undefined
  /** The latitude stored in the image. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude stored in the image. */
  var longitude: js.UndefOr[Double] = js.undefined
}

object AnonAltitude {
  @scala.inline
  def apply(altitude: Int | Double = null, latitude: Int | Double = null, longitude: Int | Double = null): AnonAltitude = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitude]
  }
}

