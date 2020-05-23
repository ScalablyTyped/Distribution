package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.ecmarkup.anon.Contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/collect-header-diagnostics", JSImport.Namespace)
@js.native
object collectHeaderDiagnosticsMod extends js.Object {
  def collectHeaderDiagnostics(dom: js.Any, headers: js.Array[Contents]): js.Array[LintingError] = js.native
}

