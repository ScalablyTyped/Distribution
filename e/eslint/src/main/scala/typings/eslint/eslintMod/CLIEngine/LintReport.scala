package typings.eslint.eslintMod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintReport extends js.Object {
  var errorCount: Double
  var fixableErrorCount: Double
  var fixableWarningCount: Double
  var results: js.Array[LintResult]
  var warningCount: Double
}

object LintReport {
  @scala.inline
  def apply(
    errorCount: Double,
    fixableErrorCount: Double,
    fixableWarningCount: Double,
    results: js.Array[LintResult],
    warningCount: Double
  ): LintReport = {
    val __obj = js.Dynamic.literal(errorCount = errorCount, fixableErrorCount = fixableErrorCount, fixableWarningCount = fixableWarningCount, results = results, warningCount = warningCount)
  
    __obj.asInstanceOf[LintReport]
  }
}

