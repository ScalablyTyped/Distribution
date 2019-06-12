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
  @JSName("compassPoint")
  def compassPoint_1(bearing: scala.Double, precision: geodesyLib.geodesyLibNumbers.`1`): java.lang.String = js.native
  @JSName("compassPoint")
  def compassPoint_2(bearing: scala.Double, precision: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  @JSName("compassPoint")
  def compassPoint_3(bearing: scala.Double, precision: geodesyLib.geodesyLibNumbers.`3`): java.lang.String = js.native
  def parseDMS(dmsStr: java.lang.String): scala.Double = js.native
  def toBrng(deg: scala.Double): java.lang.String = js.native
  def toBrng(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  @JSName("toBrng")
  def toBrng_0(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  @JSName("toBrng")
  def toBrng_2(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  @JSName("toBrng")
  def toBrng_4(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toDMS(deg: scala.Double): java.lang.String = js.native
  def toDMS(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  @JSName("toDMS")
  def toDMS_0(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  @JSName("toDMS")
  def toDMS_2(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  @JSName("toDMS")
  def toDMS_4(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toLat(deg: scala.Double): java.lang.String = js.native
  def toLat(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  @JSName("toLat")
  def toLat_0(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  @JSName("toLat")
  def toLat_2(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  @JSName("toLat")
  def toLat_4(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
  def toLon(deg: scala.Double): java.lang.String = js.native
  def toLon(deg: scala.Double, format: geodesyLib.geodesyMod.format): java.lang.String = js.native
  @JSName("toLon")
  def toLon_0(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`0`): java.lang.String = js.native
  @JSName("toLon")
  def toLon_2(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`2`): java.lang.String = js.native
  @JSName("toLon")
  def toLon_4(deg: scala.Double, format: geodesyLib.geodesyMod.format, dp: geodesyLib.geodesyLibNumbers.`4`): java.lang.String = js.native
}

