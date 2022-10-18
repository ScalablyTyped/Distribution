package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.LocaleMatcher
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSupportedLocalesMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/SupportedLocales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("SupportedLocales")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def SupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String], options: LocaleMatcher): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("SupportedLocales")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
