package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var exterior: js.UndefOr[js.Array[GeoLocationPoint]] = js.native
}

object GeoLocationPolygon {
  @scala.inline
  def apply(): GeoLocationPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationPolygon]
  }
  @scala.inline
  implicit class GeoLocationPolygonOps[Self <: GeoLocationPolygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExteriorVarargs(value: GeoLocationPoint*): Self = this.set("exterior", js.Array(value :_*))
    @scala.inline
    def setExterior(value: js.Array[GeoLocationPoint]): Self = this.set("exterior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExterior: Self = this.set("exterior", js.undefined)
  }
  
}

