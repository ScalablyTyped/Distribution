package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boundary extends js.Object {
  /** The boundary of the location as a set of loops containing pairs of latitude, longitude coordinates. */
  var boundary: js.UndefOr[js.Array[js.Array[Latitude]]] = js.undefined
  /** The cache policy active for this data. EX: UNRESTRICTED, RESTRICTED, NEVER */
  var cachePolicy: js.UndefOr[String] = js.undefined
  /** The country code of the location. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** The latitude of the location. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude of the location. */
  var longitude: js.UndefOr[Double] = js.undefined
  /** The type of map that should be used for this location. EX: HYBRID, ROADMAP, SATELLITE, TERRAIN */
  var mapType: js.UndefOr[String] = js.undefined
  /** The viewport for showing this location. This is a latitude, longitude rectangle. */
  var viewport: js.UndefOr[Hi] = js.undefined
  /**
    * The Zoom level to use for the map. Zoom levels between 0 (the lowest zoom level, in which the entire world can be seen on one map) to 21+ (down to
    * individual buildings). See: https://developers.google.com/maps/documentation/staticmaps/#Zoomlevels
    */
  var zoom: js.UndefOr[Double] = js.undefined
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

