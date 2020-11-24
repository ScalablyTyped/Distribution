package typings.formatjsIntlListformat.libMod

import typings.formatjsEcma402Abstract.typesListMod.ListPatternFieldsData
import typings.formatjsEcma402Abstract.typesListMod.ListPatternLocaleData
import typings.formatjsIntlListformat.anon.PickIntlListFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-listformat/lib", JSImport.Default)
@js.native
class default () extends ListFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: js.UndefOr[scala.Nothing], options: IntlListFormatOptions) = this()
  def this(locales: String, options: IntlListFormatOptions) = this()
  def this(locales: js.Array[String], options: IntlListFormatOptions) = this()
}
/* static members */
@JSImport("@formatjs/intl-listformat/lib", JSImport.Default)
@js.native
object default extends js.Object {
  
  val __INTERNAL_SLOT_MAP__ : js.Any = js.native
  
  def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
  
  var __defaultLocale: js.Any = js.native
  
  var availableLocales: js.Any = js.native
  
  var getDefaultLocale: js.Any = js.native
  
  var localeData: Record[String, js.UndefOr[ListPatternFieldsData]] = js.native
  
  var polyfilled: Boolean = js.native
  
  var relevantExtensionKeys: js.Any = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
}
