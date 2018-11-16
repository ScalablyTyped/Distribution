package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "LatLonEllipsoidal")
@js.native
class LatLonEllipsoidal protected () extends js.Object {
  def this(lat: scala.Double, lon: scala.Double) = this()
  def this(lat: scala.Double, lon: scala.Double, datum: Datum) = this()
  var datum: Datum = js.native
  var lat: scala.Double = js.native
  var lon: scala.Double = js.native
  def convertDatum(toDatum: Datum): LatLon = js.native
  def toCartesian(): Vector3d = js.native
  def toString(format: format): java.lang.String = js.native
  def toString(format: format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  def toString(format: format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def toString(format: format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toUtm(): Utm = js.native
}

@JSImport("geodesy", "LatLonEllipsoidal")
@js.native
object LatLonEllipsoidal extends js.Object {
  var datum: geodesyLib.geodesyMod.Datums = js.native
  var ellipsoid: geodesyLib.geodesyMod.Ellipsoids = js.native
}

