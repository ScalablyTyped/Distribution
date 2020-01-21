package typings.formatjsIntlUnifiedNumberformat

import typings.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormatOptions
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.localeMatcher
import typings.formatjsIntlUnifiedNumberformat.unitsConstantsMod.Unit
import typings.formatjsIntlUtils.numberTypesMod.NumberLocaleInternalData
import typings.formatjsIntlUtils.numberTypesMod.RawNumberLocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class UnifiedNumberFormat ()
    extends typings.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: UnifiedNumberFormatOptions) = this()
    def this(locales: js.Array[String], options: UnifiedNumberFormatOptions) = this()
  }
  
  def isUnitSupported(unit: Unit): Boolean = js.native
  /* static members */
  @js.native
  object UnifiedNumberFormat extends js.Object {
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var localeData: Record[String, NumberLocaleInternalData] = js.native
    var polyfilled: Boolean = js.native
    def __addLocaleData(data: RawNumberLocaleData*): scala.Unit = js.native
    def getDefaultLocale(): String = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, options: Pick[UnifiedNumberFormatOptions, localeMatcher]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[UnifiedNumberFormatOptions, localeMatcher]): js.Array[String] = js.native
  }
  
}

