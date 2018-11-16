package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Dms")
@js.native
object DmsNs extends js.Object {
  var separator: java.lang.String = js.native
  def compassPoint(bearing: scala.Double): java.lang.String = js.native
  def compassPoint(bearing: scala.Double, precision: geodesyLib.geodesyLibNumbers.`1`): java.lang.String = js.native
  def compassPoint(bearing: scala.Double, precision: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def compassPoint(bearing: scala.Double, precision: geodesyLib.geodesyLibNumbers.`3`): java.lang.String = js.native
  def parseDMS(dmsStr: java.lang.String): scala.Double = js.native
  def toBrng(deg: scala.Double): java.lang.String = js.native
  def toBrng(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  def toBrng(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  def toBrng(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def toBrng(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toDMS(deg: scala.Double): java.lang.String = js.native
  def toDMS(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  def toDMS(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  def toDMS(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def toDMS(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toLat(deg: scala.Double): java.lang.String = js.native
  def toLat(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  def toLat(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  def toLat(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def toLat(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toLon(deg: scala.Double): java.lang.String = js.native
  def toLon(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  def toLon(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  def toLon(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  def toLon(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
}

