package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorIssue extends js.Object {
  var code: InspectorIssueCode = js.native
  var details: InspectorIssueDetails = js.native
}

object InspectorIssue {
  @scala.inline
  def apply(code: InspectorIssueCode, details: InspectorIssueDetails): InspectorIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorIssue]
  }
  @scala.inline
  implicit class InspectorIssueOps[Self <: InspectorIssue] (val x: Self) extends AnyVal {
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
    def setCode(value: InspectorIssueCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: InspectorIssueDetails): Self = this.set("details", value.asInstanceOf[js.Any])
  }
  
}

