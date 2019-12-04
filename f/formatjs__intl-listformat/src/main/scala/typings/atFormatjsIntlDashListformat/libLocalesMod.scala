package typings.atFormatjsIntlDashListformat

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.localeMatcher
import typings.atFormatjsIntlDashListformat.libCoreMod.IntlListFormatOptions
import typings.atFormatjsIntlDashUtils.distListDashTypesMod.ListPatternFieldsData
import typings.atFormatjsIntlDashUtils.distListDashTypesMod.ListPatternLocaleData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-listformat/lib/locales", JSImport.Namespace)
@js.native
object libLocalesMod extends js.Object {
  @js.native
  class default ()
    extends typings.atFormatjsIntlDashListformat.libCoreMod.default {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: IntlListFormatOptions) = this()
    def this(locales: js.Array[String], options: IntlListFormatOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var getDefaultLocale: js.Any = js.native
    var localeData: Record[String, ListPatternFieldsData] = js.native
    var polyfilled: Boolean = js.native
    var relevantExtensionKeys: js.Any = js.native
    def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, options: Pick[IntlListFormatOptions, localeMatcher]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[IntlListFormatOptions, localeMatcher]): js.Array[String] = js.native
  }
  
}

