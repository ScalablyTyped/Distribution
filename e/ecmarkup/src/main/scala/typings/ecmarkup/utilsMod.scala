package typings.ecmarkup

import typings.ecmarkup.anon.Production
import typings.grammarkdown.mod.Grammar
import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ecmarkup/lib/lint/utils", "getProductions")
  @js.native
  def getProductions(grammar: Grammar): Map[String, Production] = js.native
  
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: OneOfList, b: OneOfList): Boolean = js.native
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = js.native
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = js.native
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = js.native
}
