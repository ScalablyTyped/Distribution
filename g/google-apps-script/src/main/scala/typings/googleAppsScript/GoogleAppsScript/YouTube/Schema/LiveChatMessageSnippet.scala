package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatMessageSnippet extends js.Object {
  
  var authorChannelId: js.UndefOr[String] = js.native
  
  var displayMessage: js.UndefOr[String] = js.native
  
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.native
  
  var hasDisplayContent: js.UndefOr[Boolean] = js.native
  
  var liveChatId: js.UndefOr[String] = js.native
  
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.native
  
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.native
  
  var pollClosedDetails: js.UndefOr[LiveChatPollClosedDetails] = js.native
  
  var pollEditedDetails: js.UndefOr[LiveChatPollEditedDetails] = js.native
  
  var pollOpenedDetails: js.UndefOr[LiveChatPollOpenedDetails] = js.native
  
  var pollVotedDetails: js.UndefOr[LiveChatPollVotedDetails] = js.native
  
  var publishedAt: js.UndefOr[String] = js.native
  
  var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.native
  
  var superStickerDetails: js.UndefOr[LiveChatSuperStickerDetails] = js.native
  
  var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var userBannedDetails: js.UndefOr[LiveChatUserBannedMessageDetails] = js.native
}
object LiveChatMessageSnippet {
  
  @scala.inline
  def apply(): LiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
  
  @scala.inline
  implicit class LiveChatMessageSnippetOps[Self <: LiveChatMessageSnippet] (val x: Self) extends AnyVal {
    
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
    def setAuthorChannelId(value: String): Self = this.set("authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorChannelId: Self = this.set("authorChannelId", js.undefined)
    
    @scala.inline
    def setDisplayMessage(value: String): Self = this.set("displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMessage: Self = this.set("displayMessage", js.undefined)
    
    @scala.inline
    def setFanFundingEventDetails(value: LiveChatFanFundingEventDetails): Self = this.set("fanFundingEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFanFundingEventDetails: Self = this.set("fanFundingEventDetails", js.undefined)
    
    @scala.inline
    def setHasDisplayContent(value: Boolean): Self = this.set("hasDisplayContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDisplayContent: Self = this.set("hasDisplayContent", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveChatId: Self = this.set("liveChatId", js.undefined)
    
    @scala.inline
    def setMessageDeletedDetails(value: LiveChatMessageDeletedDetails): Self = this.set("messageDeletedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDeletedDetails: Self = this.set("messageDeletedDetails", js.undefined)
    
    @scala.inline
    def setMessageRetractedDetails(value: LiveChatMessageRetractedDetails): Self = this.set("messageRetractedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageRetractedDetails: Self = this.set("messageRetractedDetails", js.undefined)
    
    @scala.inline
    def setPollClosedDetails(value: LiveChatPollClosedDetails): Self = this.set("pollClosedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollClosedDetails: Self = this.set("pollClosedDetails", js.undefined)
    
    @scala.inline
    def setPollEditedDetails(value: LiveChatPollEditedDetails): Self = this.set("pollEditedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollEditedDetails: Self = this.set("pollEditedDetails", js.undefined)
    
    @scala.inline
    def setPollOpenedDetails(value: LiveChatPollOpenedDetails): Self = this.set("pollOpenedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollOpenedDetails: Self = this.set("pollOpenedDetails", js.undefined)
    
    @scala.inline
    def setPollVotedDetails(value: LiveChatPollVotedDetails): Self = this.set("pollVotedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollVotedDetails: Self = this.set("pollVotedDetails", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setSuperChatDetails(value: LiveChatSuperChatDetails): Self = this.set("superChatDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperChatDetails: Self = this.set("superChatDetails", js.undefined)
    
    @scala.inline
    def setSuperStickerDetails(value: LiveChatSuperStickerDetails): Self = this.set("superStickerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperStickerDetails: Self = this.set("superStickerDetails", js.undefined)
    
    @scala.inline
    def setTextMessageDetails(value: LiveChatTextMessageDetails): Self = this.set("textMessageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMessageDetails: Self = this.set("textMessageDetails", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserBannedDetails(value: LiveChatUserBannedMessageDetails): Self = this.set("userBannedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserBannedDetails: Self = this.set("userBannedDetails", js.undefined)
  }
}
