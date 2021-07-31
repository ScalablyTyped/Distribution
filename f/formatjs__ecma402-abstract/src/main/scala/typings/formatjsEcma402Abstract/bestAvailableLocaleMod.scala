package typings.formatjsEcma402Abstract

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bestAvailableLocaleMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/BestAvailableLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def BestAvailableLocale(availableLocales: Set[String], locale: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("BestAvailableLocale")(availableLocales.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
