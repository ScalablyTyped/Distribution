package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lat extends js.Object {
  var lat: js.UndefOr[Double] = js.native
  var lng: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var span: js.UndefOr[String] = js.native
}

object Lat {
  @scala.inline
  def apply(
    lat: js.UndefOr[Double] = js.undefined,
    lng: js.UndefOr[Double] = js.undefined,
    name: String = null,
    span: String = null
  ): Lat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lng)) __obj.updateDynamic("lng")(lng.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
}

