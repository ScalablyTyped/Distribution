package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Utm")
@js.native
class Utm protected () extends js.Object {
  def this(zone: Double, hemisphere: hemisphere, easting: Double, northing: Double) = this()
  def this(zone: Double, hemisphere: hemisphere, easting: Double, northing: Double, datum: datum) = this()
  def this(
    zone: Double,
    hemisphere: hemisphere,
    easting: Double,
    northing: Double,
    datum: datum,
    convergence: Double
  ) = this()
  def this(
    zone: Double,
    hemisphere: hemisphere,
    easting: Double,
    northing: Double,
    datum: datum,
    convergence: Double,
    scale: Double
  ) = this()
  var convergence: Double = js.native
  var datum: Datum = js.native
  var easting: Double = js.native
  var hemisphere: typings.geodesy.geodesyMod.hemisphere = js.native
  var northing: Double = js.native
  var scale: Double = js.native
  var zone: Double = js.native
  def toLatLonE(): LatLon = js.native
  def toMgrs(): Mgrs = js.native
  def toString(digits: Double): String = js.native
}

/* static members */
@JSImport("geodesy", "Utm")
@js.native
object Utm extends js.Object {
  def parse(utmCoord: String): Utm = js.native
  def parse(utmCoord: String, datum: datum): Utm = js.native
}

