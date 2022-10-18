package typings.ecmarkup

import typings.ecmarkup.anon.Line
import typings.ecmarkup.anon.Loc
import typings.ecmarkup.anon.Production
import typings.grammarkdown.mod.Grammar
import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import typings.grammarkdown.mod.SourceFile
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintUtilsMod {
  
  @JSImport("ecmarkup/lib/lint/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectNonterminalsFromEmd(
    emdNode: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ Any
    ]
  ): js.Array[Loc] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectNonterminalsFromEmd")(emdNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[Loc]]
  inline def collectNonterminalsFromEmd(
    emdNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ Any
  ): js.Array[Loc] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectNonterminalsFromEmd")(emdNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[Loc]]
  
  inline def collectNonterminalsFromGrammar(grammar: Grammar): js.Array[Loc] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectNonterminalsFromGrammar")(grammar.asInstanceOf[js.Any]).asInstanceOf[js.Array[Loc]]
  
  inline def getLocationInGrammarFile(file: SourceFile, pos: Double): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationInGrammarFile")(file.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def getProductions(sourceFiles: js.Array[SourceFile]): Map[String, Production] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductions")(sourceFiles.asInstanceOf[js.Any]).asInstanceOf[Map[String, Production]]
  
  inline def rhsMatches(a: OneOfList, b: OneOfList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rhsMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
