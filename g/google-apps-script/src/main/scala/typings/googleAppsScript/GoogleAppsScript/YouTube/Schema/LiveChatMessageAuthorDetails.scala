package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessageAuthorDetails extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  var channelUrl: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var isChatModerator: js.UndefOr[Boolean] = js.native
  var isChatOwner: js.UndefOr[Boolean] = js.native
  var isChatSponsor: js.UndefOr[Boolean] = js.native
  var isVerified: js.UndefOr[Boolean] = js.native
  var profileImageUrl: js.UndefOr[String] = js.native
}

object LiveChatMessageAuthorDetails {
  @scala.inline
  def apply(): LiveChatMessageAuthorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageAuthorDetails]
  }
  @scala.inline
  implicit class LiveChatMessageAuthorDetailsOps[Self <: LiveChatMessageAuthorDetails] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setChannelUrl(value: String): Self = this.set("channelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelUrl: Self = this.set("channelUrl", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIsChatModerator(value: Boolean): Self = this.set("isChatModerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChatModerator: Self = this.set("isChatModerator", js.undefined)
    @scala.inline
    def setIsChatOwner(value: Boolean): Self = this.set("isChatOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChatOwner: Self = this.set("isChatOwner", js.undefined)
    @scala.inline
    def setIsChatSponsor(value: Boolean): Self = this.set("isChatSponsor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChatSponsor: Self = this.set("isChatSponsor", js.undefined)
    @scala.inline
    def setIsVerified(value: Boolean): Self = this.set("isVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVerified: Self = this.set("isVerified", js.undefined)
    @scala.inline
    def setProfileImageUrl(value: String): Self = this.set("profileImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileImageUrl: Self = this.set("profileImageUrl", js.undefined)
  }
  
}

