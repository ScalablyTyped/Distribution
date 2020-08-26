package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueAddedEvent extends js.Object {
  var issue: InspectorIssue = js.native
}

object IssueAddedEvent {
  @scala.inline
  def apply(issue: InspectorIssue): IssueAddedEvent = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueAddedEvent]
  }
  @scala.inline
  implicit class IssueAddedEventOps[Self <: IssueAddedEvent] (val x: Self) extends AnyVal {
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
    def setIssue(value: InspectorIssue): Self = this.set("issue", value.asInstanceOf[js.Any])
  }
  
}

