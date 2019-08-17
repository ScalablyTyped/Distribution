package typings.atFormatjsIntlDashRelativetimeformat.distCoreMod

import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatStrings.localeMatcher
import typings.atFormatjsIntlDashRelativetimeformat.distTypesMod.LocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-relativetimeformat/dist/core", JSImport.Default)
@js.native
class default protected () extends RelativeTimeFormat {
  def this(/* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param hasLocalesOptions because its type [string | Array<string> | undefined, IntlRelativeTimeFormatOptions | undefined] is not an array type */ hasLocalesOptions: js.Tuple2[js.UndefOr[String | js.Array[String]], js.UndefOr[IntlRelativeTimeFormatOptions]]) = this()
}

/* static members */
@JSImport("@formatjs/intl-relativetimeformat/dist/core", JSImport.Default)
@js.native
object default extends js.Object {
  var __languageAliases__ : Record[String, String] = js.native
  var __localeData__ : Record[String, LocaleData] = js.native
  var polyfilled: Boolean = js.native
  def __addLocaleData(data: LocaleData*): Unit = js.native
  def __setLanguageAliases(aliases: Record[String, String]): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
}

