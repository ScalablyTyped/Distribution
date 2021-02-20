package typings.ecmarkup

import typings.ecmarkup.anon.Alg
import typings.ecmarkup.anon.Grammar
import typings.ecmarkup.anon.OneOffGrammars
import typings.ecmarkup.anon.Source
import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectGrammarDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", "collectGrammarDiagnostics")
  @js.native
  def collectGrammarDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): OneOffGrammars = js.native
}
