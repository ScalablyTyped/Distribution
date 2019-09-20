package typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod

import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatStrings.localeMatcher
import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.RelativeTimeLocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-relativetimeformat", JSImport.Default)
@js.native
class default ()
  extends typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.default {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: IntlRelativeTimeFormatOptions) = this()
  def this(locales: js.Array[String], options: IntlRelativeTimeFormatOptions) = this()
}

/* static members */
@JSImport("@formatjs/intl-relativetimeformat", JSImport.Default)
@js.native
object default extends js.Object {
  var __localeData__ : Record[String, RelativeTimeLocaleData] = js.native
  var polyfilled: Boolean = js.native
  def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[js.UndefOr[String]] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[js.UndefOr[String]] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, opts: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], opts: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
}

