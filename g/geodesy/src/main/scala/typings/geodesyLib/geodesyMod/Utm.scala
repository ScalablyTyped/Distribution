package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Utm")
@js.native
class Utm protected () extends js.Object {
  def this(zone: scala.Double, hemisphere: hemisphere, easting: scala.Double, northing: scala.Double) = this()
  def this(zone: scala.Double, hemisphere: hemisphere, easting: scala.Double, northing: scala.Double, datum: datum) = this()
  def this(zone: scala.Double, hemisphere: hemisphere, easting: scala.Double, northing: scala.Double, datum: datum, convergence: scala.Double) = this()
  def this(zone: scala.Double, hemisphere: hemisphere, easting: scala.Double, northing: scala.Double, datum: datum, convergence: scala.Double, scale: scala.Double) = this()
  var convergence: scala.Double = js.native
  var datum: Datum = js.native
  var easting: scala.Double = js.native
  var hemisphere: hemisphere = js.native
  var northing: scala.Double = js.native
  var scale: scala.Double = js.native
  var zone: scala.Double = js.native
  def toLatLonE(): LatLon = js.native
  def toMgrs(): Mgrs = js.native
  def toString(digits: scala.Double): java.lang.String = js.native
}

/* static members */
@JSImport("geodesy", "Utm")
@js.native
object Utm extends js.Object {
  def parse(utmCoord: java.lang.String): geodesyLib.geodesyMod.Utm = js.native
  def parse(utmCoord: java.lang.String, datum: geodesyLib.geodesyMod.datum): geodesyLib.geodesyMod.Utm = js.native
}

