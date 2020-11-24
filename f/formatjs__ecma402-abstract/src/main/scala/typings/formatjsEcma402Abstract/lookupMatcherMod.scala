package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.coreMod.LookupMatcherResult
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/LookupMatcher", JSImport.Namespace)
@js.native
object lookupMatcherMod extends js.Object {
  
  def LookupMatcher(
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    getDefaultLocale: js.Function0[String]
  ): LookupMatcherResult = js.native
}
