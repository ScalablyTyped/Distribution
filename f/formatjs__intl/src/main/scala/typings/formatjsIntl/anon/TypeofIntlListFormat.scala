package typings.formatjsIntl.anon

import org.scalablytyped.runtime.Instantiable0
import typings.formatjsEcma402Abstract.typesListMod.ListPatternFieldsData
import typings.formatjsEcma402Abstract.typesListMod.ListPatternLocaleData
import typings.formatjsIntlListformat.anon.PickIntlListFormatOptions
import typings.formatjsIntlListformat.mod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIntlListFormat
  extends StObject
     with Instantiable0[default] {
  
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
