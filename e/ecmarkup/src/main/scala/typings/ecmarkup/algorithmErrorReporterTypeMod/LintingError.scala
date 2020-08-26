package typings.ecmarkup.algorithmErrorReporterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintingError extends js.Object {
  var column: Double = js.native
  var line: Double = js.native
  var message: String = js.native
  var nodeType: String = js.native
  var ruleId: String = js.native
}

object LintingError {
  @scala.inline
  def apply(column: Double, line: Double, message: String, nodeType: String, ruleId: String): LintingError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintingError]
  }
  @scala.inline
  implicit class LintingErrorOps[Self <: LintingError] (val x: Self) extends AnyVal {
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
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
  }
  
}

