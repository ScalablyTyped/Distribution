package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.ecmarkup.anon.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/collect-algorithm-diagnostics", JSImport.Namespace)
@js.native
object collectAlgorithmDiagnosticsMod extends js.Object {
  def collectAlgorithmDiagnostics(dom: js.Any, sourceText: String, algorithms: js.Array[Element]): js.Array[LintingError] = js.native
}

