package typings.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintReport extends js.Object {
  var errorCount: Double
  var fixableErrorCount: Double
  var fixableWarningCount: Double
  var results: js.Array[LintResult]
  var usedDeprecatedRules: js.Array[DeprecatedRuleUse]
  var warningCount: Double
}

object LintReport {
  @scala.inline
  def apply(
    errorCount: Double,
    fixableErrorCount: Double,
    fixableWarningCount: Double,
    results: js.Array[LintResult],
    usedDeprecatedRules: js.Array[DeprecatedRuleUse],
    warningCount: Double
  ): LintReport = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], fixableErrorCount = fixableErrorCount.asInstanceOf[js.Any], fixableWarningCount = fixableWarningCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], usedDeprecatedRules = usedDeprecatedRules.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LintReport]
  }
}

