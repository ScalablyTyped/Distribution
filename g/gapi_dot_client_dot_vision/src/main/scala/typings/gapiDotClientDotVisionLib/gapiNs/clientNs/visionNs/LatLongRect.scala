package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLongRect extends js.Object {
  /** Max lat/long pair. */
  var maxLatLng: js.UndefOr[LatLng] = js.undefined
  /** Min lat/long pair. */
  var minLatLng: js.UndefOr[LatLng] = js.undefined
}

object LatLongRect {
  @scala.inline
  def apply(maxLatLng: LatLng = null, minLatLng: LatLng = null): LatLongRect = {
    val __obj = js.Dynamic.literal()
    if (maxLatLng != null) __obj.updateDynamic("maxLatLng")(maxLatLng)
    if (minLatLng != null) __obj.updateDynamic("minLatLng")(minLatLng)
    __obj.asInstanceOf[LatLongRect]
  }
}

