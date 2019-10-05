package typings.geodesy.geodesyMod

import typings.geodesy.geodesyNumbers.`0`
import typings.geodesy.geodesyNumbers.`1`
import typings.geodesy.geodesyNumbers.`2`
import typings.geodesy.geodesyNumbers.`3`
import typings.geodesy.geodesyNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Dms")
@js.native
object Dms extends js.Object {
  var separator: String = js.native
  def compassPoint(bearing: Double): String = js.native
  @JSName("compassPoint")
  def compassPoint_1(bearing: Double, precision: `1`): String = js.native
  @JSName("compassPoint")
  def compassPoint_2(bearing: Double, precision: `2`): String = js.native
  @JSName("compassPoint")
  def compassPoint_3(bearing: Double, precision: `3`): String = js.native
  def parseDMS(dmsStr: String): Double = js.native
  def toBrng(deg: Double): String = js.native
  def toBrng(deg: Double, format: format): String = js.native
  @JSName("toBrng")
  def toBrng_0(deg: Double, format: format, dp: `0`): String = js.native
  @JSName("toBrng")
  def toBrng_2(deg: Double, format: format, dp: `2`): String = js.native
  @JSName("toBrng")
  def toBrng_4(deg: Double, format: format, dp: `4`): String = js.native
  def toDMS(deg: Double): String = js.native
  def toDMS(deg: Double, format: format): String = js.native
  @JSName("toDMS")
  def toDMS_0(deg: Double, format: format, dp: `0`): String = js.native
  @JSName("toDMS")
  def toDMS_2(deg: Double, format: format, dp: `2`): String = js.native
  @JSName("toDMS")
  def toDMS_4(deg: Double, format: format, dp: `4`): String = js.native
  def toLat(deg: Double): String = js.native
  def toLat(deg: Double, format: format): String = js.native
  @JSName("toLat")
  def toLat_0(deg: Double, format: format, dp: `0`): String = js.native
  @JSName("toLat")
  def toLat_2(deg: Double, format: format, dp: `2`): String = js.native
  @JSName("toLat")
  def toLat_4(deg: Double, format: format, dp: `4`): String = js.native
  def toLon(deg: Double): String = js.native
  def toLon(deg: Double, format: format): String = js.native
  @JSName("toLon")
  def toLon_0(deg: Double, format: format, dp: `0`): String = js.native
  @JSName("toLon")
  def toLon_2(deg: Double, format: format, dp: `2`): String = js.native
  @JSName("toLon")
  def toLon_4(deg: Double, format: format, dp: `4`): String = js.native
}

