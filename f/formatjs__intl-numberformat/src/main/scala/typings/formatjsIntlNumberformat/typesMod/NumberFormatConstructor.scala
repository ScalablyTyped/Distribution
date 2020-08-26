package typings.formatjsIntlNumberformat.typesMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.formatjsIntlNumberformat.anon.PickNumberFormatOptionslo
import typings.formatjsIntlUtils.mod.NumberFormatLocaleInternalData
import typings.formatjsIntlUtils.mod.RawNumberLocaleData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatConstructor
  extends Instantiable0[NumberFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), NumberFormat]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ] {
  var __defaultLocale: String = js.native
  var availableLocales: js.Array[String] = js.native
  var localeData: Record[String, NumberFormatLocaleInternalData] = js.native
  var polyfilled: Boolean = js.native
  def apply(): NumberFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: String): NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: js.Array[String]): NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
  def __addLocaleData(data: RawNumberLocaleData*): Unit = js.native
  def getDefaultLocale(): String = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickNumberFormatOptionslo): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickNumberFormatOptionslo): js.Array[String] = js.native
}

