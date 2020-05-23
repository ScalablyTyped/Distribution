package typings.ecmarkup

import typings.ecmarkup.anon.Alg
import typings.ecmarkup.anon.Grammar
import typings.ecmarkup.anon.LintingErrors
import typings.ecmarkup.anon.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", JSImport.Namespace)
@js.native
object collectGrammarDiagnosticsMod extends js.Object {
  def collectGrammarDiagnostics(
    dom: js.Any,
    sourceText: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): LintingErrors = js.native
}

