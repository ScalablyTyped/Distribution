package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperChatEventSnippet extends js.Object {
  var amountMicros: js.UndefOr[String] = js.native
  var channelId: js.UndefOr[String] = js.native
  var commentText: js.UndefOr[String] = js.native
  var createdAt: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var displayString: js.UndefOr[String] = js.native
  var isSuperChatForGood: js.UndefOr[Boolean] = js.native
  var isSuperStickerEvent: js.UndefOr[Boolean] = js.native
  var messageType: js.UndefOr[Double] = js.native
  var nonprofit: js.UndefOr[Nonprofit] = js.native
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.native
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.native
}

object SuperChatEventSnippet {
  @scala.inline
  def apply(): SuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuperChatEventSnippet]
  }
  @scala.inline
  implicit class SuperChatEventSnippetOps[Self <: SuperChatEventSnippet] (val x: Self) extends AnyVal {
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
    def setAmountMicros(value: String): Self = this.set("amountMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountMicros: Self = this.set("amountMicros", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setCommentText(value: String): Self = this.set("commentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentText: Self = this.set("commentText", js.undefined)
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDisplayString(value: String): Self = this.set("displayString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayString: Self = this.set("displayString", js.undefined)
    @scala.inline
    def setIsSuperChatForGood(value: Boolean): Self = this.set("isSuperChatForGood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSuperChatForGood: Self = this.set("isSuperChatForGood", js.undefined)
    @scala.inline
    def setIsSuperStickerEvent(value: Boolean): Self = this.set("isSuperStickerEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSuperStickerEvent: Self = this.set("isSuperStickerEvent", js.undefined)
    @scala.inline
    def setMessageType(value: Double): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    @scala.inline
    def setNonprofit(value: Nonprofit): Self = this.set("nonprofit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonprofit: Self = this.set("nonprofit", js.undefined)
    @scala.inline
    def setSuperStickerMetadata(value: SuperStickerMetadata): Self = this.set("superStickerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperStickerMetadata: Self = this.set("superStickerMetadata", js.undefined)
    @scala.inline
    def setSupporterDetails(value: ChannelProfileDetails): Self = this.set("supporterDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupporterDetails: Self = this.set("supporterDetails", js.undefined)
  }
  
}

