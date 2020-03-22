package typings.formatjsIntlListformat.coreMod

import typings.formatjsIntlListformat.PickIntlListFormatOptions
import typings.formatjsIntlUtils.listTypesMod.ListPatternFieldsData
import typings.formatjsIntlUtils.listTypesMod.ListPatternLocaleData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-listformat/lib/core", JSImport.Default)
@js.native
class default () extends ListFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: IntlListFormatOptions) = this()
  def this(locales: js.Array[String], options: IntlListFormatOptions) = this()
  /* CompleteClass */
  override def format(elements: js.Array[String]): String = js.native
  /* CompleteClass */
  override def formatToParts(elements: js.Array[String]): js.Array[Part] = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedIntlListFormatOptions = js.native
}

/* static members */
@JSImport("@formatjs/intl-listformat/lib/core", JSImport.Default)
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
  def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
}

