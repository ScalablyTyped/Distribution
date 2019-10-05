package typings.eslint.eslintMod.Linter

import typings.eslint.eslintMod.Rule.Fix
import typings.eslint.eslintNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintMessage extends js.Object {
  var column: Double
  var endColumn: js.UndefOr[Double] = js.undefined
  var endLine: js.UndefOr[Double] = js.undefined
  var fatal: js.UndefOr[`true`] = js.undefined
  var fix: js.UndefOr[Fix] = js.undefined
  var line: Double
  var message: String
  var nodeType: String
  var ruleId: String | Null
  var severity: Severity
  var source: String | Null
}

object LintMessage {
  @scala.inline
  def apply(
    column: Double,
    line: Double,
    message: String,
    nodeType: String,
    severity: Severity,
    endColumn: Int | Double = null,
    endLine: Int | Double = null,
    fatal: `true` = null,
    fix: Fix = null,
    ruleId: String = null,
    source: String = null
  ): LintMessage = {
    val __obj = js.Dynamic.literal(column = column, line = line, message = message, nodeType = nodeType, severity = severity)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (fatal != null) __obj.updateDynamic("fatal")(fatal)
    if (fix != null) __obj.updateDynamic("fix")(fix)
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[LintMessage]
  }
}

