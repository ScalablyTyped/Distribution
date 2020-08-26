package typings.eslint.mod.Linter

import typings.eslint.eslintBooleans.`true`
import typings.eslint.mod.Rule.Fix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintMessage extends js.Object {
  var column: Double = js.native
  var endColumn: js.UndefOr[Double] = js.native
  var endLine: js.UndefOr[Double] = js.native
  var fatal: js.UndefOr[`true`] = js.native
  var fix: js.UndefOr[Fix] = js.native
  var line: Double = js.native
  var message: String = js.native
  var messageId: js.UndefOr[String] = js.native
  var nodeType: js.UndefOr[String] = js.native
  var ruleId: String | Null = js.native
  var severity: Severity = js.native
  /** @deprecated Use `linter.getSourceCode()` */
  var source: js.UndefOr[String | Null] = js.native
  var suggestions: js.UndefOr[js.Array[LintSuggestion]] = js.native
}

object LintMessage {
  @scala.inline
  def apply(column: Double, line: Double, message: String, severity: Severity): LintMessage = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintMessage]
  }
  @scala.inline
  implicit class LintMessageOps[Self <: LintMessage] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: Severity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    @scala.inline
    def setFatal(value: `true`): Self = this.set("fatal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    @scala.inline
    def setFix(value: Fix): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleIdNull: Self = this.set("ruleId", null)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    @scala.inline
    def setSuggestionsVarargs(value: LintSuggestion*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[LintSuggestion]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
  }
  
}

