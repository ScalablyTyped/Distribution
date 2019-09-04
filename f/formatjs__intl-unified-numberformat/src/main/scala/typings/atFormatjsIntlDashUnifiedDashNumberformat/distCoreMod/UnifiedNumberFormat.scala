package typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod

import typings.std.IntlNs.NumberFormat
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Parameters
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/dist/core", "UnifiedNumberFormat")
@js.native
class UnifiedNumberFormat protected () extends NumberFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, hasStyleUnitUnitDisplayOptions: UnifiedNumberFormatOptions) = this()
  def this(locales: js.Array[String], hasStyleUnitUnitDisplayOptions: UnifiedNumberFormatOptions) = this()
  var locale: js.Any = js.native
  var nf: js.Any = js.native
  var patternData: js.UndefOr[js.Any] = js.native
  var pl: js.Any = js.native
  var unit: js.Any = js.native
  var unitDisplay: js.Any = js.native
}

/* static members */
@JSImport("@formatjs/intl-unified-numberformat/dist/core", "UnifiedNumberFormat")
@js.native
object UnifiedNumberFormat extends js.Object {
  var __unitLocaleData__ : Record[String, LocaleData] = js.native
  var polyfilled: Boolean = js.native
  def __addUnitLocaleData(data: Record[String, LocaleData]): Unit = js.native
  def supportedLocalesOf(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<typeof NativeNumberFormat.supportedLocalesOf> is not an array type */ args: Parameters[
      js.Function2[
        /* locales */ String | js.Array[String], 
        /* options */ js.UndefOr[NumberFormatOptions], 
        js.Array[String]
      ]
    ]
  ): js.Array[String] = js.native
}

