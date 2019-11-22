package typings.atFormatjsIntlDashRelativetimeformat.libCoreMod

import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatStrings.localeMatcher
import typings.atFormatjsIntlDashRelativetimeformat.libTypesMod.FormattableUnit
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.RelativeTimeLocaleData
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.UnpackedLocaleFieldsData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-relativetimeformat/lib/core", JSImport.Default)
@js.native
class default () extends RelativeTimeFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: IntlRelativeTimeFormatOptions) = this()
  def this(locales: js.Array[String], options: IntlRelativeTimeFormatOptions) = this()
  /* CompleteClass */
  override def format(value: Double, unit: FormattableUnit): String = js.native
  /* CompleteClass */
  override def formatToParts(value: Double, unit: FormattableUnit): js.Array[Part] = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions = js.native
}

/* static members */
@JSImport("@formatjs/intl-relativetimeformat/lib/core", JSImport.Default)
@js.native
object default extends js.Object {
  val __INTERNAL_SLOT_MAP__ : js.Any = js.native
  var __defaultLocale: js.Any = js.native
  var availableLocales: js.Any = js.native
  var getDefaultLocale: js.Any = js.native
  var localeData: Record[String, UnpackedLocaleFieldsData] = js.native
  var polyfilled: Boolean = js.native
  var relevantExtensionKeys: js.Any = js.native
  def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, options: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
}

