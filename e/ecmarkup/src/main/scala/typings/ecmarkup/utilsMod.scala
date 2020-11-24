package typings.ecmarkup

import typings.ecmarkup.anon.Production
import typings.grammarkdown.mod.Grammar
import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getProductions(grammar: Grammar): Map[String, Production] = js.native
  
  def rhsMatches(a: OneOfList, b: OneOfList): Boolean = js.native
  def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = js.native
  def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = js.native
  def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = js.native
}
