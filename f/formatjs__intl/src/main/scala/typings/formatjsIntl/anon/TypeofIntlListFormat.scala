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
  
  /* private */ val __INTERNAL_SLOT_MAP__ : Any = js.native
  
  def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
  
  /* private */ var __defaultLocale: Any = js.native
  
  /* private */ var availableLocales: Any = js.native
  
  /* private */ var getDefaultLocale: Any = js.native
  
  var localeData: Record[String, js.UndefOr[ListPatternFieldsData]] = js.native
  
  var polyfilled: Boolean = js.native
  
  /* private */ var relevantExtensionKeys: Any = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
}
