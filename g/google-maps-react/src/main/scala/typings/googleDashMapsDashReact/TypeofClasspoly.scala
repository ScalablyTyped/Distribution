package typings.googleDashMapsDashReact

import org.scalablytyped.runtime.Instantiable0
import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.Polygon
import typings.googlemaps.googleNs.mapsNs.Polyline
import typings.googlemaps.googleNs.mapsNs.geometryNs.poly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClasspoly extends Instantiable0[poly] {
  def containsLocation(point: LatLng, polygon: Polygon): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polygon): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polygon, tolerance: Double): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polyline): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polyline, tolerance: Double): Boolean = js.native
}

