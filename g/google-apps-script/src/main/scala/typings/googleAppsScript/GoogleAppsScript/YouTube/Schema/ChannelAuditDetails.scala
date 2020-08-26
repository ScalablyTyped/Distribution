package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelAuditDetails extends js.Object {
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
}

object ChannelAuditDetails {
  @scala.inline
  def apply(): ChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelAuditDetails]
  }
  @scala.inline
  implicit class ChannelAuditDetailsOps[Self <: ChannelAuditDetails] (val x: Self) extends AnyVal {
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
    def setCommunityGuidelinesGoodStanding(value: Boolean): Self = this.set("communityGuidelinesGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommunityGuidelinesGoodStanding: Self = this.set("communityGuidelinesGoodStanding", js.undefined)
    @scala.inline
    def setContentIdClaimsGoodStanding(value: Boolean): Self = this.set("contentIdClaimsGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentIdClaimsGoodStanding: Self = this.set("contentIdClaimsGoodStanding", js.undefined)
    @scala.inline
    def setCopyrightStrikesGoodStanding(value: Boolean): Self = this.set("copyrightStrikesGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyrightStrikesGoodStanding: Self = this.set("copyrightStrikesGoodStanding", js.undefined)
  }
  
}

