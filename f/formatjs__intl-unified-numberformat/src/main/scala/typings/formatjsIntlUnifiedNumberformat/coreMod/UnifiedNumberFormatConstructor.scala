package typings.formatjsIntlUnifiedNumberformat.coreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.formatjsIntlUnifiedNumberformat.anon.PickUnifiedNumberFormatOp
import typings.formatjsIntlUtils.numberTypesMod.NumberLocaleInternalData
import typings.formatjsIntlUtils.numberTypesMod.RawNumberLocaleData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnifiedNumberFormatConstructor
  extends Instantiable0[UnifiedNumberFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), UnifiedNumberFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ UnifiedNumberFormatOptions, 
      UnifiedNumberFormat
    ] {
  var __defaultLocale: String = js.native
  var availableLocales: js.Array[String] = js.native
  var localeData: Record[String, NumberLocaleInternalData] = js.native
  var polyfilled: Boolean = js.native
  def apply(): UnifiedNumberFormat = js.native
  def apply(locales: String): UnifiedNumberFormat = js.native
  def apply(locales: String, options: UnifiedNumberFormatOptions): UnifiedNumberFormat = js.native
  def apply(locales: js.Array[String]): UnifiedNumberFormat = js.native
  def apply(locales: js.Array[String], options: UnifiedNumberFormatOptions): UnifiedNumberFormat = js.native
  def __addLocaleData(data: RawNumberLocaleData*): Unit = js.native
  def getDefaultLocale(): String = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickUnifiedNumberFormatOp): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickUnifiedNumberFormatOp): js.Array[String] = js.native
}

