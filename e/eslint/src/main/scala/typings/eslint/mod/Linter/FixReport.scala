package typings.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixReport extends js.Object {
  var fixed: Boolean = js.native
  var messages: js.Array[LintMessage] = js.native
  var output: String = js.native
}

object FixReport {
  @scala.inline
  def apply(fixed: Boolean, messages: js.Array[LintMessage], output: String): FixReport = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixReport]
  }
  @scala.inline
  implicit class FixReportOps[Self <: FixReport] (val x: Self) extends AnyVal {
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
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: LintMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[LintMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

