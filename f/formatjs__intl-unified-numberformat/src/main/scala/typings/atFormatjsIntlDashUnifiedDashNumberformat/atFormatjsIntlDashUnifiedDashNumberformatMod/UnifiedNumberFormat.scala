package typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod

import typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormatOptions
import typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod.UnifiedNumberFormatLocaleData
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Parameters
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat", "UnifiedNumberFormat")
@js.native
class UnifiedNumberFormat protected ()
  extends typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, hasStyleUnitUnitDisplayOptions: UnifiedNumberFormatOptions) = this()
  def this(locales: js.Array[String], hasStyleUnitUnitDisplayOptions: UnifiedNumberFormatOptions) = this()
}

/* static members */
@JSImport("@formatjs/intl-unified-numberformat", "UnifiedNumberFormat")
@js.native
object UnifiedNumberFormat extends js.Object {
  var __unitLocaleData__ : Record[String, UnifiedNumberFormatLocaleData] = js.native
  var polyfilled: Boolean = js.native
  def __addUnitLocaleData(data: js.Array[UnifiedNumberFormatLocaleData]): Unit = js.native
  def supportedLocalesOf(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<typeof NativeNumberFormat.supportedLocalesOf> is not an array type */ args: Parameters[
      js.Function2[
        /* locales */ String | js.Array[String], 
        /* options */ js.UndefOr[NumberFormatOptions], 
        js.Array[String]
      ]
    ]
  ): js.Array[js.UndefOr[String]] = js.native
}

