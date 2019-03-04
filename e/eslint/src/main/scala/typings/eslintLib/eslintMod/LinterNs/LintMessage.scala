package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintMessage extends js.Object {
  var column: scala.Double
  var endColumn: js.UndefOr[scala.Double] = js.undefined
  var endLine: js.UndefOr[scala.Double] = js.undefined
  var fatal: js.UndefOr[eslintLib.eslintLibNumbers.`true`] = js.undefined
  var fix: js.UndefOr[eslintLib.eslintMod.RuleNs.Fix] = js.undefined
  var line: scala.Double
  var message: java.lang.String
  var nodeType: java.lang.String
  var ruleId: java.lang.String | scala.Null
  var severity: Severity
  var source: java.lang.String | scala.Null
}

object LintMessage {
  @scala.inline
  def apply(
    column: scala.Double,
    line: scala.Double,
    message: java.lang.String,
    nodeType: java.lang.String,
    severity: Severity,
    endColumn: scala.Int | scala.Double = null,
    endLine: scala.Int | scala.Double = null,
    fatal: eslintLib.eslintLibNumbers.`true` = null,
    fix: eslintLib.eslintMod.RuleNs.Fix = null,
    ruleId: java.lang.String = null,
    source: java.lang.String = null
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

