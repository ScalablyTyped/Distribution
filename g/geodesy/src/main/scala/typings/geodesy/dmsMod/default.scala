package typings.geodesy.dmsMod

import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("geodesy/dms", JSImport.Default)
@js.native
class default () extends Dms

/* static members */
@JSImport("geodesy/dms", JSImport.Default)
@js.native
object default extends js.Object {
  def compassPoint(bearing: Double): String = js.native
  def compassPoint(bearing: Double, precision: Precision): String = js.native
  def fromLocale(str: String): String = js.native
  def parse(dms: String): Double = js.native
  def parse(dms: Double): Double = js.native
  def separator(): String = js.native
  def separator(char: String): js.Any = js.native
  def toBrng(deg: Double): String = js.native
  def toBrng(deg: Double, format: Format): String = js.native
  def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
  def toDms(deg: Double): String = js.native
  def toDms(deg: Double, format: Format): String = js.native
  def toDms(deg: Double, format: Format, dp: Dp): String = js.native
  def toLat(deg: Double): String = js.native
  def toLat(deg: Double, format: Format): String = js.native
  def toLat(deg: Double, format: Format, dp: Dp): String = js.native
  def toLocale(str: String): String = js.native
  def toLon(deg: Double): String = js.native
  def toLon(deg: Double, format: Format): String = js.native
  def toLon(deg: Double, format: Format, dp: Dp): String = js.native
  def wrap360(degrees: Double): String = js.native
  def wrap90(degrees: Double): String = js.native
}

