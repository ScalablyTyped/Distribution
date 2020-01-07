package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Boundary extends js.Object {
  var boundary: js.UndefOr[js.Array[js.Array[Anon_Latitude]]] = js.native
  var cachePolicy: js.UndefOr[String] = js.native
  var countryCode: js.UndefOr[String] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var mapType: js.UndefOr[String] = js.native
  var viewport: js.UndefOr[Anon_Hi] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Anon_Boundary {
  @scala.inline
  def apply(
    boundary: js.Array[js.Array[Anon_Latitude]] = null,
    cachePolicy: String = null,
    countryCode: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    mapType: String = null,
    viewport: Anon_Hi = null,
    zoom: Int | Double = null
  ): Anon_Boundary = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (cachePolicy != null) __obj.updateDynamic("cachePolicy")(cachePolicy.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Boundary]
  }
}

