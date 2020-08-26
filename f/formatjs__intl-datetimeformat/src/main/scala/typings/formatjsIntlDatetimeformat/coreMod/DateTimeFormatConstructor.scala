package typings.formatjsIntlDatetimeformat.coreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.formatjsIntlDatetimeformat.anon.PickDateTimeFormatOptions
import typings.formatjsIntlDatetimeformat.typesMod.DateTimeFormatLocaleInternalData
import typings.formatjsIntlDatetimeformat.typesMod.DateTimeFormatOptions
import typings.formatjsIntlDatetimeformat.typesMod.PackedData
import typings.formatjsIntlDatetimeformat.typesMod.RawDateTimeLocaleData
import typings.formatjsIntlDatetimeformat.typesMod.UnpackedZoneData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormatConstructor
  extends Instantiable0[DateTimeFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), DateTimeFormat]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ] {
  var __defaultLocale: String = js.native
  var __defaultTimeZone: String = js.native
  var availableLocales: js.Array[String] = js.native
  var localeData: Record[String, DateTimeFormatLocaleInternalData] = js.native
  var polyfilled: Boolean = js.native
  var tzData: Record[String, js.Array[UnpackedZoneData]] = js.native
  def apply(): DateTimeFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: String): DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: js.Array[String]): DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def __addLocaleData(data: RawDateTimeLocaleData*): Unit = js.native
  def __addTZData(d: PackedData): Unit = js.native
  def getDefaultLocale(): String = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickDateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickDateTimeFormatOptions): js.Array[String] = js.native
}

