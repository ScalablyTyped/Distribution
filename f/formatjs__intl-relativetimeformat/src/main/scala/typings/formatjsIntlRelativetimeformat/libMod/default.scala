package typings.formatjsIntlRelativetimeformat.libMod

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeLocaleData
import typings.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-relativetimeformat/lib", JSImport.Default)
@js.native
class default () extends RelativeTimeFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: js.UndefOr[scala.Nothing], options: IntlRelativeTimeFormatOptions) = this()
  def this(locales: String, options: IntlRelativeTimeFormatOptions) = this()
  def this(locales: js.Array[String], options: IntlRelativeTimeFormatOptions) = this()
}
/* static members */
@JSImport("@formatjs/intl-relativetimeformat/lib", JSImport.Default)
@js.native
object default extends js.Object {
  
  def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
  
  var __defaultLocale: js.Any = js.native
  
  var availableLocales: js.Any = js.native
  
  var getDefaultLocale: js.Any = js.native
  
  var localeData: Record[String, LocaleFieldsData] = js.native
  
  var polyfilled: Boolean = js.native
  
  var relevantExtensionKeys: js.Any = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
}
