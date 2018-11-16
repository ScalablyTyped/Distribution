package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "LatLonSpherical")
@js.native
class LatLonSpherical protected () extends js.Object {
  def this(lat: scala.Double, lon: scala.Double) = this()
  var lat: scala.Double = js.native
  var lon: scala.Double = js.native
  def bearingTo(point: LatLonSpherical): scala.Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical): scala.Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonSpherical, pathEnd: LatLonSpherical, radius: scala.Double): scala.Double = js.native
  def destinationPoint(distance: scala.Double, bearing: scala.Double): LatLonSpherical = js.native
  def destinationPoint(distance: scala.Double, bearing: scala.Double, radius: scala.Double): LatLonSpherical = js.native
  def distanceTo(point: LatLonSpherical): scala.Double = js.native
  def distanceTo(point: LatLonSpherical, radius: scala.Double): scala.Double = js.native
  def equals(point: LatLonSpherical): scala.Boolean = js.native
  def finalBearingTo(point: LatLonSpherical): scala.Double = js.native
  def intermediatePointTo(point: LatLonSpherical, fraction: scala.Double): LatLonSpherical = js.native
  def maxLatitude(bearing: scala.Double): scala.Double = js.native
  def midpointTo(point: LatLonSpherical): scala.Double = js.native
  def rhumbBearingTo(point: LatLonSpherical): scala.Double = js.native
  def rhumbDestinationPoint(distance: scala.Double, bearing: scala.Double): LatLonSpherical = js.native
  def rhumbDestinationPoint(distance: scala.Double, bearing: scala.Double, radius: scala.Double): LatLonSpherical = js.native
  def rhumbDistanceTo(point: LatLonSpherical): scala.Double = js.native
  def rhumbDistanceTo(point: LatLonSpherical, radius: scala.Double): scala.Double = js.native
  def rhumbMidpointTo(point: LatLonSpherical): LatLonSpherical = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String, dp: scala.Double): java.lang.String = js.native
}

@JSImport("geodesy", "LatLonSpherical")
@js.native
object LatLonSpherical extends js.Object {
  def areaOf(polygon: js.Array[geodesyLib.geodesyMod.LatLonSpherical]): scala.Double = js.native
  def areaOf(polygon: js.Array[geodesyLib.geodesyMod.LatLonSpherical], radius: scala.Double): scala.Double = js.native
  def crossingParallels(
    point1: geodesyLib.geodesyMod.LatLonSpherical,
    point2: geodesyLib.geodesyMod.LatLonSpherical,
    latitude: scala.Double
  ): js.Any = js.native
  def intersection(
    point1: geodesyLib.geodesyMod.LatLonSpherical,
    bearing1: scala.Double,
    point2: geodesyLib.geodesyMod.LatLonSpherical,
    bearing2: scala.Double
  ): geodesyLib.geodesyMod.LatLonSpherical = js.native
}

