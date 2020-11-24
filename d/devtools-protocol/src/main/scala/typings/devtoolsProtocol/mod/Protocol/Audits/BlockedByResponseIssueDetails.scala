package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockedByResponseIssueDetails extends js.Object {
  
  var blockedFrame: js.UndefOr[AffectedFrame] = js.native
  
  var parentFrame: js.UndefOr[AffectedFrame] = js.native
  
  var reason: BlockedByResponseReason = js.native
  
  var request: AffectedRequest = js.native
}
object BlockedByResponseIssueDetails {
  
  @scala.inline
  def apply(reason: BlockedByResponseReason, request: AffectedRequest): BlockedByResponseIssueDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedByResponseIssueDetails]
  }
  
  @scala.inline
  implicit class BlockedByResponseIssueDetailsOps[Self <: BlockedByResponseIssueDetails] (val x: Self) extends AnyVal {
    
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
    def setReason(value: BlockedByResponseReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AffectedRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedFrame(value: AffectedFrame): Self = this.set("blockedFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedFrame: Self = this.set("blockedFrame", js.undefined)
    
    @scala.inline
    def setParentFrame(value: AffectedFrame): Self = this.set("parentFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFrame: Self = this.set("parentFrame", js.undefined)
  }
}
