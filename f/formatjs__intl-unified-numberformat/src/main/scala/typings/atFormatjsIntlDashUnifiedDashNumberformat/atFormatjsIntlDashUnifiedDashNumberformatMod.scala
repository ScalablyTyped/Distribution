package typings.atFormatjsIntlDashUnifiedDashNumberformat

import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.localeMatcher
import typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormatOptions
import typings.atFormatjsIntlDashUnifiedDashNumberformat.distUnitsDashConstantsMod.Unit
import typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod.UnifiedNumberFormatLocaleData
import typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod.UnitData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat", JSImport.Namespace)
@js.native
object atFormatjsIntlDashUnifiedDashNumberformatMod extends js.Object {
  @js.native
  class UnifiedNumberFormat protected ()
    extends typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: UnifiedNumberFormatOptions) = this()
    def this(locales: js.Array[String], options: UnifiedNumberFormatOptions) = this()
  }
  
  def isUnitSupported(unit: Unit): Boolean = js.native
  /* static members */
  @js.native
  object UnifiedNumberFormat extends js.Object {
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var getDefaultLocale: js.Any = js.native
    var localeData: Record[String, Record[String, UnitData]] = js.native
    var polyfilled: Boolean = js.native
    var relevantExtensionKeys: js.Any = js.native
    def __addLocaleData(data: UnifiedNumberFormatLocaleData*): scala.Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, options: Pick[UnifiedNumberFormatOptions, localeMatcher]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[UnifiedNumberFormatOptions, localeMatcher]): js.Array[String] = js.native
  }
  
}

