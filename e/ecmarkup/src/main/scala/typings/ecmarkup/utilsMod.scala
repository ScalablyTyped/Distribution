package typings.ecmarkup

import typings.ecmarkup.anon.Column
import typings.ecmarkup.anon.Production
import typings.grammarkdown.mod.Grammar
import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import typings.std.Element
import typings.std.Map
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getLocation(dom: js.Any, node: Element): js.Any = js.native
  def getProductions(grammar: Grammar): Map[String, Production] = js.native
  def grammarkdownLocationToTrueLocation(
    elementLoc: ReturnType[js.Function2[/* dom */ _, /* node */ Element, _]],
    gmdLine: Double,
    gmdCharacter: Double
  ): Column = js.native
  def rhsMatches(a: OneOfList, b: OneOfList): Boolean = js.native
  def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = js.native
  def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = js.native
  def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = js.native
}

