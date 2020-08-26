package typings.eslint.mod.ESLint

import typings.eslint.mod.Linter.LintMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResult extends js.Object {
  var errorCount: Double = js.native
  var filePath: String = js.native
  var fixableErrorCount: Double = js.native
  var fixableWarningCount: Double = js.native
  var messages: js.Array[LintMessage] = js.native
  var output: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
  var usedDeprecatedRules: js.Array[DeprecatedRuleUse] = js.native
  var warningCount: Double = js.native
}

object LintResult {
  @scala.inline
  def apply(
    errorCount: Double,
    filePath: String,
    fixableErrorCount: Double,
    fixableWarningCount: Double,
    messages: js.Array[LintMessage],
    usedDeprecatedRules: js.Array[DeprecatedRuleUse],
    warningCount: Double
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fixableErrorCount = fixableErrorCount.asInstanceOf[js.Any], fixableWarningCount = fixableWarningCount.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], usedDeprecatedRules = usedDeprecatedRules.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixableErrorCount(value: Double): Self = this.set("fixableErrorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixableWarningCount(value: Double): Self = this.set("fixableWarningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: LintMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[LintMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedDeprecatedRulesVarargs(value: DeprecatedRuleUse*): Self = this.set("usedDeprecatedRules", js.Array(value :_*))
    @scala.inline
    def setUsedDeprecatedRules(value: js.Array[DeprecatedRuleUse]): Self = this.set("usedDeprecatedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

