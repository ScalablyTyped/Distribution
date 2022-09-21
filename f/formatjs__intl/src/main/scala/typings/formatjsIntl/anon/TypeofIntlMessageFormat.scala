package typings.formatjsIntl.anon

import org.scalablytyped.runtime.Instantiable1
import typings.intlMessageformat.mod.IntlMessageFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIntlMessageFormat
  extends StObject
     with Instantiable1[/* message */ String, IntlMessageFormat] {
  
  var __parse: js.UndefOr[typings.intlMessageformat.anon.FnCall] = js.native
  
  def defaultLocale: String = js.native
  
  var formats: typings.intlMessageformat.srcFormattersMod.Formats = js.native
  
  /* private */ var memoizedDefaultLocale: Any = js.native
  
  def resolveLocale(locales: String): js.UndefOr[typings.std.Intl.Locale] = js.native
  def resolveLocale(locales: js.Array[String]): js.UndefOr[typings.std.Intl.Locale] = js.native
}
