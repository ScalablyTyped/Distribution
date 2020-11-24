package typings.formatjsIntl.anon

import org.scalablytyped.runtime.Instantiable0
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeLocaleData
import typings.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typings.formatjsIntlRelativetimeformat.mod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIntlRelativeTimeFor extends Instantiable0[default] {
  
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
