package typings.formatjsIntlLocalematcher

import typings.formatjsIntlLocalematcher.libAbstractTypesMod.LookupMatcherResult
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractBestFitMatcherMod {
  
  @JSImport("@formatjs/intl-localematcher/lib/abstract/BestFitMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BestFitMatcher(
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    getDefaultLocale: js.Function0[String]
  ): LookupMatcherResult = (^.asInstanceOf[js.Dynamic].applyDynamic("BestFitMatcher")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any], getDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[LookupMatcherResult]
}
