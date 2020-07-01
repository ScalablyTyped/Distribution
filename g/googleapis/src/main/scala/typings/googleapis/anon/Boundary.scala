package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boundary extends js.Object {
  var boundary: js.UndefOr[js.Array[js.Array[Latitude]]] = js.native
  var cachePolicy: js.UndefOr[String] = js.native
  var countryCode: js.UndefOr[String] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var mapType: js.UndefOr[String] = js.native
  var viewport: js.UndefOr[Hi] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Boundary {
  @scala.inline
  def apply(
    boundary: js.Array[js.Array[Latitude]] = null,
    cachePolicy: String = null,
    countryCode: String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    mapType: String = null,
    viewport: Hi = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): Boundary = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (cachePolicy != null) __obj.updateDynamic("cachePolicy")(cachePolicy.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundary]
  }
}

