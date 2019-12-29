package typings.atFormatjsIntlDashUnifiedDashNumberformat

import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.localeMatcher
import typings.atFormatjsIntlDashUnifiedDashNumberformat.libCoreMod.UnifiedNumberFormat
import typings.atFormatjsIntlDashUnifiedDashNumberformat.libCoreMod.UnifiedNumberFormatOptions
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberLocaleInternalData
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.RawNumberLocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/locales", JSImport.Namespace)
@js.native
object libLocalesMod extends js.Object {
  @js.native
  class default () extends UnifiedNumberFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: UnifiedNumberFormatOptions) = this()
    def this(locales: js.Array[String], options: UnifiedNumberFormatOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var localeData: Record[String, NumberLocaleInternalData] = js.native
    var polyfilled: Boolean = js.native
    def __addLocaleData(data: RawNumberLocaleData*): Unit = js.native
    def getDefaultLocale(): String = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, options: Pick[UnifiedNumberFormatOptions, localeMatcher]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[UnifiedNumberFormatOptions, localeMatcher]): js.Array[String] = js.native
  }
  
}

