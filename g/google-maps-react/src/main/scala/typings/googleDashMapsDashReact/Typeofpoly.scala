package typings.googleDashMapsDashReact

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Polygon
import typings.googlemaps.google.maps.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpoly extends js.Object {
  def containsLocation(point: LatLng, polygon: Polygon): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polygon): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polygon, tolerance: Double): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polyline): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polyline, tolerance: Double): Boolean = js.native
}

