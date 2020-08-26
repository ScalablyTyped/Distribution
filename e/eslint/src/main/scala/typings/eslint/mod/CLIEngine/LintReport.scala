package typings.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintReport extends js.Object {
  var errorCount: Double = js.native
  var fixableErrorCount: Double = js.native
  var fixableWarningCount: Double = js.native
  var results: js.Array[LintResult] = js.native
  var usedDeprecatedRules: js.Array[DeprecatedRuleUse] = js.native
  var warningCount: Double = js.native
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
  @scala.inline
  implicit class LintReportOps[Self <: LintReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixableErrorCount(value: Double): Self = this.set("fixableErrorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixableWarningCount(value: Double): Self = this.set("fixableWarningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: LintResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[LintResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedDeprecatedRulesVarargs(value: DeprecatedRuleUse*): Self = this.set("usedDeprecatedRules", js.Array(value :_*))
    @scala.inline
    def setUsedDeprecatedRules(value: js.Array[DeprecatedRuleUse]): Self = this.set("usedDeprecatedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
  }
  
}

