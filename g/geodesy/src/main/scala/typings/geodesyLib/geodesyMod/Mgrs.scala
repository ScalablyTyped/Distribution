package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Mgrs")
@js.native
class Mgrs protected () extends js.Object {
  def this(zone: scala.Double, band: java.lang.String, e100k: java.lang.String, n100k: java.lang.String, easting: scala.Double, northing: scala.Double) = this()
  def this(zone: scala.Double, band: java.lang.String, e100k: java.lang.String, n100k: java.lang.String, easting: scala.Double, northing: scala.Double, datum: datum) = this()
  var band: java.lang.String = js.native
  var datum: datum = js.native
  var e100k: java.lang.String = js.native
  var e100kLetters: java.lang.String = js.native
  var easting: scala.Double = js.native
  var latBands: java.lang.String = js.native
  var n100k: java.lang.String = js.native
  var n100kLetters: java.lang.String = js.native
  var northing: scala.Double = js.native
  var zone: scala.Double = js.native
  def toString(digits: geodesyLib.geodesyLibNumbers.`10`): java.lang.String = js.native
  def toString(digits: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def toString(digits: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toString(digits: geodesyLib.geodesyLibNumbers.`6`): java.lang.String = js.native
  def toString(digits: geodesyLib.geodesyLibNumbers.`8`): java.lang.String = js.native
  def toUtm(): Utm = js.native
}

@JSImport("geodesy", "Mgrs")
@js.native
object Mgrs extends js.Object {
  def parse(mgrsGridRef: java.lang.String): geodesyLib.geodesyMod.Mgrs = js.native
}

