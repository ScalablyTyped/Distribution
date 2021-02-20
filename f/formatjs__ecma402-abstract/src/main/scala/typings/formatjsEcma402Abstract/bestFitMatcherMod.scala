package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.coreMod.LookupMatcherResult
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bestFitMatcherMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/BestFitMatcher", "BestFitMatcher")
  @js.native
  def BestFitMatcher(
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    getDefaultLocale: js.Function0[String]
  ): LookupMatcherResult = js.native
}
