package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorIssueDetails extends js.Object {
  var blockedByResponseIssueDetails: js.UndefOr[BlockedByResponseIssueDetails] = js.native
  var heavyAdIssueDetails: js.UndefOr[HeavyAdIssueDetails] = js.native
  var mixedContentIssueDetails: js.UndefOr[MixedContentIssueDetails] = js.native
  var sameSiteCookieIssueDetails: js.UndefOr[SameSiteCookieIssueDetails] = js.native
}

object InspectorIssueDetails {
  @scala.inline
  def apply(): InspectorIssueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorIssueDetails]
  }
  @scala.inline
  implicit class InspectorIssueDetailsOps[Self <: InspectorIssueDetails] (val x: Self) extends AnyVal {
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
    def setBlockedByResponseIssueDetails(value: BlockedByResponseIssueDetails): Self = this.set("blockedByResponseIssueDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockedByResponseIssueDetails: Self = this.set("blockedByResponseIssueDetails", js.undefined)
    @scala.inline
    def setHeavyAdIssueDetails(value: HeavyAdIssueDetails): Self = this.set("heavyAdIssueDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeavyAdIssueDetails: Self = this.set("heavyAdIssueDetails", js.undefined)
    @scala.inline
    def setMixedContentIssueDetails(value: MixedContentIssueDetails): Self = this.set("mixedContentIssueDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixedContentIssueDetails: Self = this.set("mixedContentIssueDetails", js.undefined)
    @scala.inline
    def setSameSiteCookieIssueDetails(value: SameSiteCookieIssueDetails): Self = this.set("sameSiteCookieIssueDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSiteCookieIssueDetails: Self = this.set("sameSiteCookieIssueDetails", js.undefined)
  }
  
}

