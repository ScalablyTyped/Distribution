package typings.formatjsIntlDisplaynames.mod

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typings.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-displaynames", "DisplayNames")
@js.native
class DisplayNames protected () extends js.Object {
  def this(locales: js.UndefOr[scala.Nothing], options: DisplayNamesOptions) = this()
  def this(locales: String, options: DisplayNamesOptions) = this()
  def this(locales: js.Array[String], options: DisplayNamesOptions) = this()
  
  def of(code: String): js.UndefOr[String] = js.native
  def of(code: js.Object): js.UndefOr[String] = js.native
  def of(code: Double): js.UndefOr[String] = js.native
  
  def resolvedOptions(): DisplayNamesResolvedOptions = js.native
}
/* static members */
@JSImport("@formatjs/intl-displaynames", "DisplayNames")
@js.native
object DisplayNames extends js.Object {
  
  def __addLocaleData(data: DisplayNamesLocaleData*): Unit = js.native
  
  var __defaultLocale: js.Any = js.native
  
  var availableLocales: js.Any = js.native
  
  var getDefaultLocale: js.Any = js.native
  
  var localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
  
  val polyfilled: /* true */ Boolean = js.native
  
  def supportedLocalesOf(): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.UndefOr[scala.Nothing], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
}
