package typings.geodesy.geodesyMod

import typings.geodesy.geodesyNumbers.`10`
import typings.geodesy.geodesyNumbers.`2`
import typings.geodesy.geodesyNumbers.`4`
import typings.geodesy.geodesyNumbers.`6`
import typings.geodesy.geodesyNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Mgrs")
@js.native
class Mgrs protected () extends js.Object {
  def this(zone: Double, band: String, e100k: String, n100k: String, easting: Double, northing: Double) = this()
  def this(
    zone: Double,
    band: String,
    e100k: String,
    n100k: String,
    easting: Double,
    northing: Double,
    datum: datum
  ) = this()
  var band: String = js.native
  var datum: typings.geodesy.geodesyMod.datum = js.native
  var e100k: String = js.native
  var e100kLetters: String = js.native
  var easting: Double = js.native
  var latBands: String = js.native
  var n100k: String = js.native
  var n100kLetters: String = js.native
  var northing: Double = js.native
  var zone: Double = js.native
  @JSName("toString")
  def toString_10(digits: `10`): String = js.native
  @JSName("toString")
  def toString_2(digits: `2`): String = js.native
  @JSName("toString")
  def toString_4(digits: `4`): String = js.native
  @JSName("toString")
  def toString_6(digits: `6`): String = js.native
  @JSName("toString")
  def toString_8(digits: `8`): String = js.native
  def toUtm(): Utm = js.native
}

/* static members */
@JSImport("geodesy", "Mgrs")
@js.native
object Mgrs extends js.Object {
  def parse(mgrsGridRef: String): Mgrs = js.native
}

