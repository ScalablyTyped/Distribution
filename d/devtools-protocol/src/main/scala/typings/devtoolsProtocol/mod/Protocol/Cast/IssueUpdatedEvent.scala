package typings.devtoolsProtocol.mod.Protocol.Cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueUpdatedEvent extends js.Object {
  var issueMessage: String = js.native
}

object IssueUpdatedEvent {
  @scala.inline
  def apply(issueMessage: String): IssueUpdatedEvent = {
    val __obj = js.Dynamic.literal(issueMessage = issueMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueUpdatedEvent]
  }
  @scala.inline
  implicit class IssueUpdatedEventOps[Self <: IssueUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setIssueMessage(value: String): Self = this.set("issueMessage", value.asInstanceOf[js.Any])
  }
  
}

