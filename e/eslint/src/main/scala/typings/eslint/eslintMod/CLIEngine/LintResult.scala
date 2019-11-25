package typings.eslint.eslintMod.CLIEngine

import typings.eslint.eslintMod.Linter.LintMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var errorCount: Double
  var filePath: String
  var fixableErrorCount: Double
  var fixableWarningCount: Double
  var messages: js.Array[LintMessage]
  var output: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var warningCount: Double
}

object LintResult {
  @scala.inline
  def apply(
    errorCount: Double,
    filePath: String,
    fixableErrorCount: Double,
    fixableWarningCount: Double,
    messages: js.Array[LintMessage],
    warningCount: Double,
    output: String = null,
    source: String = null
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fixableErrorCount = fixableErrorCount.asInstanceOf[js.Any], fixableWarningCount = fixableWarningCount.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
}

