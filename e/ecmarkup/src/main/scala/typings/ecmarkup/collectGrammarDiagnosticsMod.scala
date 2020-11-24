package typings.ecmarkup

import typings.ecmarkup.anon.Alg
import typings.ecmarkup.anon.Grammar
import typings.ecmarkup.anon.OneOffGrammars
import typings.ecmarkup.anon.Source
import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", JSImport.Namespace)
@js.native
object collectGrammarDiagnosticsMod extends js.Object {
  
  def collectGrammarDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): OneOffGrammars = js.native
}
