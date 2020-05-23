package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLocation extends js.Object {
  /** @name MapLocation.lat */
  var lat: js.UndefOr[Double] = js.undefined
  /** @name MapLocation.lng */
  var lng: js.UndefOr[Double] = js.undefined
}

object MapLocation {
  @scala.inline
  def apply(lat: js.UndefOr[Double] = js.undefined, lng: js.UndefOr[Double] = js.undefined): MapLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lng)) __obj.updateDynamic("lng")(lng.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocation]
  }
}

