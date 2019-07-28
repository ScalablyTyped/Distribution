package typings.gapiDotClientDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  /** The altitude stored in the image. */
  var altitude: js.UndefOr[Double] = js.undefined
  /** The latitude stored in the image. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude stored in the image. */
  var longitude: js.UndefOr[Double] = js.undefined
}

object Anon_Altitude {
  @scala.inline
  def apply(altitude: Int | Double = null, latitude: Int | Double = null, longitude: Int | Double = null): Anon_Altitude = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Altitude]
  }
}

