package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
  /** The altitude stored in the image. */
  var altitude: js.UndefOr[Double] = js.undefined
  /** The latitude stored in the image. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude stored in the image. */
  var longitude: js.UndefOr[Double] = js.undefined
}

object Altitude {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined
  ): Altitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

