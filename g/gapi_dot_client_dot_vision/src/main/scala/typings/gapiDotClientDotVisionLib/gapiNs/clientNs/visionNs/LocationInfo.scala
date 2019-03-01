package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

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
    if (latLng != null) __obj.updateDynamic("latLng")(latLng)
    __obj.asInstanceOf[LocationInfo]
  }
}

