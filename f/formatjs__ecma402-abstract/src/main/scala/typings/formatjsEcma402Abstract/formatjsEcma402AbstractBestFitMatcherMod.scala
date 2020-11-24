package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.typesCoreMod.LookupMatcherResult
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/BestFitMatcher", JSImport.Namespace)
@js.native
object formatjsEcma402AbstractBestFitMatcherMod extends js.Object {
  
  def BestFitMatcher(
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    getDefaultLocale: js.Function0[String]
  ): LookupMatcherResult = js.native
}
