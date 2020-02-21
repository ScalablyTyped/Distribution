package typings.formatjsIntlDisplaynames.intlDisplaynamesMod

import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesBooleans.`true`
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.localeMatcher
import typings.formatjsIntlUtils.displaynamesTypesMod.DisplayNamesData
import typings.formatjsIntlUtils.displaynamesTypesMod.DisplayNamesLocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-displaynames/lib/intl-displaynames", "DisplayNames")
@js.native
class DisplayNames () extends js.Object {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: DisplayNamesOptions) = this()
  def this(locales: js.Array[String], options: DisplayNamesOptions) = this()
  def of(code: String): js.UndefOr[String] = js.native
  def of(code: js.Object): js.UndefOr[String] = js.native
  def of(code: Double): js.UndefOr[String] = js.native
  def resolvedOptions(): DisplayNamesResolvedOptions = js.native
}

/* static members */
@JSImport("@formatjs/intl-displaynames/lib/intl-displaynames", "DisplayNames")
@js.native
object DisplayNames extends js.Object {
  var __defaultLocale: js.Any = js.native
  var availableLocales: js.Any = js.native
  var getDefaultLocale: js.Any = js.native
  var localeData: Record[String, DisplayNamesData] = js.native
  val polyfilled: `true` = js.native
  def __addLocaleData(data: DisplayNamesLocaleData*): Unit = js.native
  def supportedLocalesOf(): js.Array[String] = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, options: Pick[DisplayNamesOptions, localeMatcher]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[DisplayNamesOptions, localeMatcher]): js.Array[String] = js.native
}

