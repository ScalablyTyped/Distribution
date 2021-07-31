package typings.formatjsIntl.anon

import org.scalablytyped.runtime.Instantiable2
import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typings.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.formatjsIntlDisplaynames.mod.DisplayNamesOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDisplayNames
  extends StObject
     with Instantiable2[/* locales */ String, /* options */ DisplayNamesOptions, DisplayNames] {
  
  def __addLocaleData(data: DisplayNamesLocaleData*): Unit = js.native
  
  var __defaultLocale: js.Any = js.native
  
  var availableLocales: js.Any = js.native
  
  var getDefaultLocale: js.Any = js.native
  
  var localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
  
  val polyfilled: /* true */ Boolean = js.native
  
  def supportedLocalesOf(): js.Array[String] = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  def supportedLocalesOf(locales: Unit, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
}
