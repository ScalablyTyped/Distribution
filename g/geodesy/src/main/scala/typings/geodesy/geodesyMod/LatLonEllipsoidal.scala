package typings.geodesy.geodesyMod

import typings.geodesy.geodesyNumbers.`0`
import typings.geodesy.geodesyNumbers.`2`
import typings.geodesy.geodesyNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "LatLonEllipsoidal")
@js.native
class LatLonEllipsoidal protected () extends js.Object {
  def this(lat: Double, lon: Double) = this()
  def this(lat: Double, lon: Double, datum: Datum) = this()
  var datum: Datum = js.native
  var lat: Double = js.native
  var lon: Double = js.native
  def convertDatum(toDatum: Datum): LatLon = js.native
  def toCartesian(): Vector3d = js.native
  def toString(format: format): String = js.native
  @JSName("toString")
  def toString_0(format: format, dp: `0`): String = js.native
  @JSName("toString")
  def toString_2(format: format, dp: `2`): String = js.native
  @JSName("toString")
  def toString_4(format: format, dp: `4`): String = js.native
  def toUtm(): Utm = js.native
}

/* static members */
@JSImport("geodesy", "LatLonEllipsoidal")
@js.native
object LatLonEllipsoidal extends js.Object {
  var datum: Datums = js.native
  var ellipsoid: Ellipsoids = js.native
}

