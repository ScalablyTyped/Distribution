package typings.formatjsIntlNumberformat

import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-numberformat/src/to_locale_string", JSImport.Namespace)
@js.native
object toLocaleStringMod extends js.Object {
  def toLocaleString(x: Double): String = js.native
  def toLocaleString(x: Double, locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): String = js.native
  def toLocaleString(x: Double, locales: String): String = js.native
  def toLocaleString(x: Double, locales: String, options: NumberFormatOptions): String = js.native
  def toLocaleString(x: Double, locales: js.Array[String]): String = js.native
  def toLocaleString(x: Double, locales: js.Array[String], options: NumberFormatOptions): String = js.native
}

