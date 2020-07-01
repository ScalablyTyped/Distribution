package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/collect-spelling-diagnostics", JSImport.Namespace)
@js.native
object collectSpellingDiagnosticsMod extends js.Object {
  def collectSpellingDiagnostics(sourceText: String): js.Array[LintingError] = js.native
}

