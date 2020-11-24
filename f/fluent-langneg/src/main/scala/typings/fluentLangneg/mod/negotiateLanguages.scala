package typings.fluentLangneg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluent-langneg", "negotiateLanguages")
@js.native
object negotiateLanguages extends js.Object {
  
  def apply(requestedLocales: js.Array[String], availableLocales: js.Array[String]): js.Array[String] = js.native
  def apply(
    requestedLocales: js.Array[String],
    availableLocales: js.Array[String],
    options: LanguageNegotiationOptions
  ): js.Array[String] = js.native
}
