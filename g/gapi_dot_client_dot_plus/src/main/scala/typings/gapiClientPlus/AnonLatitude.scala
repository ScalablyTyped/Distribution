package typings.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitude extends js.Object {
  /** The latitude of this position. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude of this position. */
  var longitude: js.UndefOr[Double] = js.undefined
}

object AnonLatitude {
  @scala.inline
  def apply(latitude: Int | Double = null, longitude: Int | Double = null): AnonLatitude = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLatitude]
  }
}

