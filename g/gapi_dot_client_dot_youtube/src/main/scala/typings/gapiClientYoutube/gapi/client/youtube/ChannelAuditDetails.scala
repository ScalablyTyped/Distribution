package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelAuditDetails extends js.Object {
  /** Whether or not the channel respects the community guidelines. */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  /** Whether or not the channel has any unresolved claims. */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  /** Whether or not the channel has any copyright strikes. */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
  /**
    * Describes the general state of the channel. This field will always show if there are any issues whatsoever with the channel. Currently this field
    * represents the result of the logical and operation over the community guidelines good standing, the copyright strikes good standing and the content ID
    * claims good standing, but this may change in the future.
    */
  var overallGoodStanding: js.UndefOr[Boolean] = js.native
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
    @scala.inline
    def setOverallGoodStanding(value: Boolean): Self = this.set("overallGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverallGoodStanding: Self = this.set("overallGoodStanding", js.undefined)
  }
  
}

