package typings.formatjsIntlLocalematcher

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractLookupSupportedLocalesMod {
  
  @JSImport("@formatjs/intl-localematcher/lib/abstract/LookupSupportedLocales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LookupSupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("LookupSupportedLocales")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
