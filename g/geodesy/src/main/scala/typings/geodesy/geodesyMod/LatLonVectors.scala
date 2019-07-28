package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "LatLonVectors")
@js.native
class LatLonVectors protected () extends js.Object {
  def this(lat: Double, lon: Double) = this()
  var lat: Double = js.native
  var lon: Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: Double): Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: Double, radius: Double): Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors): Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors, radius: Double): Double = js.native
  def bearingTo(point: LatLonVectors): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: Double): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: Double, radius: Double): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors, radius: Double): Double = js.native
  def destinationPoint(distance: Double, bearing: Double): LatLonVectors = js.native
  def destinationPoint(distance: Double, bearing: Double, radius: Double): LatLonVectors = js.native
  def distanceTo(point: LatLonVectors): Double = js.native
  def distanceTo(point: LatLonVectors, radius: Double): Double = js.native
  def enclosedBy(polygon: js.Array[LatLonVectors]): Boolean = js.native
  def equals(point: LatLonVectors): Boolean = js.native
  def greatCircle(bearing: Double): Vector3d = js.native
  def intermediatePointOnChordTo(point: LatLonVectors, fraction: Double): LatLonVectors = js.native
  def intermediatePointTo(point: LatLonVectors, fraction: Double): LatLonVectors = js.native
  def isBetween(point1: LatLonVectors, point2: LatLonVectors): Boolean = js.native
  def midpointTo(point: LatLonVectors): Double = js.native
  def nearestPointOnSegment(point1: LatLonVectors, point2: LatLonVectors): LatLonVectors = js.native
  def toString(format: String): String = js.native
  def toString(format: String, dp: Double): String = js.native
  def toVector(): Vector3d = js.native
}

/* static members */
@JSImport("geodesy", "LatLonVectors")
@js.native
object LatLonVectors extends js.Object {
  def areaOf(polygon: js.Array[LatLonVectors]): Double = js.native
  def areaOf(polygon: js.Array[LatLonVectors], radius: Double): Double = js.native
  def intersection(path1start: LatLonVectors, path1brngEnd: Double, path2start: LatLonVectors, path2brngEnd: Double): LatLonVectors = js.native
  def intersection(
    path1start: LatLonVectors,
    path1brngEnd: Double,
    path2start: LatLonVectors,
    path2brngEnd: LatLonVectors
  ): LatLonVectors = js.native
  def intersection(
    path1start: LatLonVectors,
    path1brngEnd: LatLonVectors,
    path2start: LatLonVectors,
    path2brngEnd: Double
  ): LatLonVectors = js.native
  def intersection(
    path1start: LatLonVectors,
    path1brngEnd: LatLonVectors,
    path2start: LatLonVectors,
    path2brngEnd: LatLonVectors
  ): LatLonVectors = js.native
  def meanOf(points: js.Array[LatLonVectors]): LatLonVectors = js.native
}

