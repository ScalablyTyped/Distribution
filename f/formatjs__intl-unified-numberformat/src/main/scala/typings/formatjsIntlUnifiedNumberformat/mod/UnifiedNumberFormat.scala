package typings.formatjsIntlUnifiedNumberformat.mod

import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.localeMatcher
import typings.formatjsIntlUtils.numberTypesMod.NumberLocaleInternalData
import typings.formatjsIntlUtils.numberTypesMod.RawNumberLocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof std.Intl.NumberFormat, 'formatToParts'> ]: std.Intl.NumberFormat[P]} */ @JSImport("@formatjs/intl-unified-numberformat", "UnifiedNumberFormat")
@js.native
class UnifiedNumberFormat () extends js.Object {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: UnifiedNumberFormatOptions) = this()
  def this(locales: js.Array[String], options: UnifiedNumberFormatOptions) = this()
  def format(num: Double): String = js.native
  def formatToParts(x: Double): js.Array[UnifiedNumberFormatPart] = js.native
  def resolvedOptions(): ResolvedUnifiedNumberFormatOptions = js.native
}

/* static members */
@JSImport("@formatjs/intl-unified-numberformat", "UnifiedNumberFormat")
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

