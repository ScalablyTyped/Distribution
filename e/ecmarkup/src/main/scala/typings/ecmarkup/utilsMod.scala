package typings.ecmarkup

import typings.ecmarkup.anon.Production
import typings.grammarkdown.mod.Grammar
import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ecmarkup/lib/lint/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProductions(grammar: Grammar): Map[String, Production] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductions")(grammar.asInstanceOf[js.Any]).asInstanceOf[Map[String, Production]]
  
  inline def rhsMatches(a: OneOfList, b: OneOfList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
