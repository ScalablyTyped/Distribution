package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_CachePolicy extends js.Object {
  /** The boundary of the location as a set of loops containing pairs of latitude, longitude coordinates. */
  var boundary: js.UndefOr[js.Array[js.Array[Anon_Latitude]]] = js.undefined
  /** The cache policy active for this data. EX: UNRESTRICTED, RESTRICTED, NEVER */
  var cachePolicy: js.UndefOr[java.lang.String] = js.undefined
  /** The country code of the location. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** The latitude of the location. */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /** The longitude of the location. */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** The type of map that should be used for this location. EX: HYBRID, ROADMAP, SATELLITE, TERRAIN */
  var mapType: js.UndefOr[java.lang.String] = js.undefined
  /** The viewport for showing this location. This is a latitude, longitude rectangle. */
  var viewport: js.UndefOr[Anon_Lo] = js.undefined
  /**
                   * The Zoom level to use for the map. Zoom levels between 0 (the lowest zoom level, in which the entire world can be seen on one map) to 21+ (down to
                   * individual buildings). See: https://developers.google.com/maps/documentation/staticmaps/#Zoomlevels
                   */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

