package typings.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine")
@js.native
object ^ extends js.Object {
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  def outputFixes(report: LintReport): Unit = js.native
}

