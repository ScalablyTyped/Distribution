package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.LocaleMatcher
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/SupportedLocales", JSImport.Namespace)
@js.native
object supportedLocalesMod extends js.Object {
  
  def SupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def SupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
}
