package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "LatLonVectors")
@js.native
class LatLonVectors protected () extends js.Object {
  def this(lat: scala.Double, lon: scala.Double) = this()
  var lat: scala.Double = js.native
  var lon: scala.Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors): scala.Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors, radius: scala.Double): scala.Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: scala.Double): scala.Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: scala.Double, radius: scala.Double): scala.Double = js.native
  def bearingTo(point: LatLonVectors): scala.Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors): scala.Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: LatLonVectors, radius: scala.Double): scala.Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: scala.Double): scala.Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonVectors, pathBrngEnd: scala.Double, radius: scala.Double): scala.Double = js.native
  def destinationPoint(distance: scala.Double, bearing: scala.Double): LatLonVectors = js.native
  def destinationPoint(distance: scala.Double, bearing: scala.Double, radius: scala.Double): LatLonVectors = js.native
  def distanceTo(point: LatLonVectors): scala.Double = js.native
  def distanceTo(point: LatLonVectors, radius: scala.Double): scala.Double = js.native
  def enclosedBy(polygon: js.Array[LatLonVectors]): scala.Boolean = js.native
  def equals(point: LatLonVectors): scala.Boolean = js.native
  def greatCircle(bearing: scala.Double): Vector3d = js.native
  def intermediatePointOnChordTo(point: LatLonVectors, fraction: scala.Double): LatLonVectors = js.native
  def intermediatePointTo(point: LatLonVectors, fraction: scala.Double): LatLonVectors = js.native
  def isBetween(point1: LatLonVectors, point2: LatLonVectors): scala.Boolean = js.native
  def midpointTo(point: LatLonVectors): scala.Double = js.native
  def nearestPointOnSegment(point1: LatLonVectors, point2: LatLonVectors): LatLonVectors = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String, dp: scala.Double): java.lang.String = js.native
  def toVector(): Vector3d = js.native
}

@JSImport("geodesy", "LatLonVectors")
@js.native
object LatLonVectors extends js.Object {
  def areaOf(polygon: js.Array[geodesyLib.geodesyMod.LatLonVectors]): scala.Double = js.native
  def areaOf(polygon: js.Array[geodesyLib.geodesyMod.LatLonVectors], radius: scala.Double): scala.Double = js.native
  def intersection(
    path1start: geodesyLib.geodesyMod.LatLonVectors,
    path1brngEnd: geodesyLib.geodesyMod.LatLonVectors,
    path2start: geodesyLib.geodesyMod.LatLonVectors,
    path2brngEnd: geodesyLib.geodesyMod.LatLonVectors
  ): geodesyLib.geodesyMod.LatLonVectors = js.native
  def intersection(
    path1start: geodesyLib.geodesyMod.LatLonVectors,
    path1brngEnd: geodesyLib.geodesyMod.LatLonVectors,
    path2start: geodesyLib.geodesyMod.LatLonVectors,
    path2brngEnd: scala.Double
  ): geodesyLib.geodesyMod.LatLonVectors = js.native
  def intersection(
    path1start: geodesyLib.geodesyMod.LatLonVectors,
    path1brngEnd: scala.Double,
    path2start: geodesyLib.geodesyMod.LatLonVectors,
    path2brngEnd: geodesyLib.geodesyMod.LatLonVectors
  ): geodesyLib.geodesyMod.LatLonVectors = js.native
  def intersection(
    path1start: geodesyLib.geodesyMod.LatLonVectors,
    path1brngEnd: scala.Double,
    path2start: geodesyLib.geodesyMod.LatLonVectors,
    path2brngEnd: scala.Double
  ): geodesyLib.geodesyMod.LatLonVectors = js.native
  def meanOf(points: js.Array[geodesyLib.geodesyMod.LatLonVectors]): geodesyLib.geodesyMod.LatLonVectors = js.native
}

