package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLocation extends js.Object {
  /** The latitude location of the widget. */
  var lat: js.UndefOr[Double] = js.undefined
  /** The longitude location of the widget. */
  var lng: js.UndefOr[Double] = js.undefined
}

object MapLocation {
  @scala.inline
  def apply(lat: Int | Double = null, lng: Int | Double = null): MapLocation = {
    val __obj = js.Dynamic.literal()
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocation]
  }
}

