package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocationPolygon extends js.Object {
  /**
    * When the geolocation describes a region, the exterior field refers to a list of latitude/longitude points that represent the vertices of a polygon. The
    * first and last points must be the same. Thus, a minimum of four points is required. The following polygon restrictions from RFC5491 apply:
    * - A connecting line shall not cross another connecting line of the same polygon.
    * - The vertices must be defined in a counterclockwise order.
    * - The edges of a polygon are defined by the shortest path between two points in space (not a geodesic curve). Consequently, the length between two
    * adjacent vertices should be restricted to a maximum of 130 km.
    * - All vertices are assumed to be at the same altitude.
    * - Polygon shapes should be restricted to a maximum of 15 vertices (16 points that include the repeated vertex).
    */
  var exterior: js.UndefOr[js.Array[GeoLocationPoint]] = js.undefined
}

object GeoLocationPolygon {
  @scala.inline
  def apply(exterior: js.Array[GeoLocationPoint] = null): GeoLocationPolygon = {
    val __obj = js.Dynamic.literal()
    if (exterior != null) __obj.updateDynamic("exterior")(exterior)
    __obj.asInstanceOf[GeoLocationPolygon]
  }
}

