package typings.ecmarkup.utilsMod

import typings.ecmarkup.anon.Production
import typings.grammarkdown.mod.Grammar
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/utils", "getProductions")
@js.native
object getProductions extends js.Object {
  def apply(grammar: Grammar): Map[String, Production] = js.native
}

