package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLat extends js.Object {
  var lat: js.UndefOr[Double] = js.native
  var lng: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var span: js.UndefOr[String] = js.native
}

object AnonLat {
  @scala.inline
  def apply(lat: Int | Double = null, lng: Int | Double = null, name: String = null, span: String = null): AnonLat = {
    val __obj = js.Dynamic.literal()
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLat]
  }
}

