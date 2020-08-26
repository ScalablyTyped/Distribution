package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeavyAdIssueDetails extends js.Object {
  /**
    * The frame that was blocked.
    */
  var frame: AffectedFrame = js.native
  /**
    * The reason the ad was blocked, total network or cpu or peak cpu.
    */
  var reason: HeavyAdReason = js.native
  /**
    * The resolution status, either blocking the content or warning.
    */
  var resolution: HeavyAdResolutionStatus = js.native
}

object HeavyAdIssueDetails {
  @scala.inline
  def apply(frame: AffectedFrame, reason: HeavyAdReason, resolution: HeavyAdResolutionStatus): HeavyAdIssueDetails = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeavyAdIssueDetails]
  }
  @scala.inline
  implicit class HeavyAdIssueDetailsOps[Self <: HeavyAdIssueDetails] (val x: Self) extends AnyVal {
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
    def setFrame(value: AffectedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: HeavyAdReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: HeavyAdResolutionStatus): Self = this.set("resolution", value.asInstanceOf[js.Any])
  }
  
}

