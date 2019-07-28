package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "LatLonSpherical")
@js.native
class LatLonSpherical protected () extends js.Object {
  def this(lat: Double, lon: Double) = this()
  var lat: Double = js.native
  var lon: Double = js.native
  def bearingTo(point: LatLonSpherical): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical, radius: Double): Double = js.native
  def destinationPoint(distance: Double, bearing: Double): LatLonSpherical = js.native
  def destinationPoint(distance: Double, bearing: Double, radius: Double): LatLonSpherical = js.native
  def distanceTo(point: LatLonSpherical): Double = js.native
  def distanceTo(point: LatLonSpherical, radius: Double): Double = js.native
  def equals(point: LatLonSpherical): Boolean = js.native
  def finalBearingTo(point: LatLonSpherical): Double = js.native
  def intermediatePointTo(point: LatLonSpherical, fraction: Double): LatLonSpherical = js.native
  def maxLatitude(bearing: Double): Double = js.native
  def midpointTo(point: LatLonSpherical): Double = js.native
  def rhumbBearingTo(point: LatLonSpherical): Double = js.native
  def rhumbDestinationPoint(distance: Double, bearing: Double): LatLonSpherical = js.native
  def rhumbDestinationPoint(distance: Double, bearing: Double, radius: Double): LatLonSpherical = js.native
  def rhumbDistanceTo(point: LatLonSpherical): Double = js.native
  def rhumbDistanceTo(point: LatLonSpherical, radius: Double): Double = js.native
  def rhumbMidpointTo(point: LatLonSpherical): LatLonSpherical = js.native
  def toString(format: String): String = js.native
  def toString(format: String, dp: Double): String = js.native
}

/* static members */
@JSImport("geodesy", "LatLonSpherical")
@js.native
object LatLonSpherical extends js.Object {
  def areaOf(polygon: js.Array[LatLonSpherical]): Double = js.native
  def areaOf(polygon: js.Array[LatLonSpherical], radius: Double): Double = js.native
  def crossingParallels(point1: LatLonSpherical, point2: LatLonSpherical, latitude: Double): js.Any = js.native
  def intersection(point1: LatLonSpherical, bearing1: Double, point2: LatLonSpherical, bearing2: Double): LatLonSpherical = js.native
}

