package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends js.Object {
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var hmac: js.UndefOr[String] = js.native
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * An array of userIds that are mentioned directly in the body of a comment.
    */
  var mentions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates if the comment has been read by the target recipient of the comment.
    */
  var read: js.UndefOr[Boolean] = js.native
  
  var sentByEmail: js.UndefOr[String] = js.native
  
  var sentByFullName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var sentByImageId: js.UndefOr[String] = js.native
  
  var sentByInitials: js.UndefOr[String] = js.native
  
  var sentByRecipientId: js.UndefOr[String] = js.native
  
  var sentByUserId: js.UndefOr[String] = js.native
  
  /**
    * Optional. The ID of the [signing group](https://support.docusign.com/en/guides/ndse-user-guide-signing-groups).
    *
    * **Note**: When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature. For this reason,
    * we recommend that you do not include non-signer recipients (such as carbon copy recipients) in the same signing group as signer recipients.
    * However, you could create a second signing group for the non-signer recipients and change the default action of Needs to Sign to a
    * different value, such as Receives a Copy.
    */
  var signingGroupId: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the signing group.
    *
    * Maximum Length: 100 characters.
    */
  var signingGroupName: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the text that is shown in the dropdown list.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier for the comment thread.
    */
  var threadId: js.UndefOr[String] = js.native
  
  /**
    * The userId of the user who created the thread.
    */
  var threadOriginatorId: js.UndefOr[String] = js.native
  
  var timeStampFormatted: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[String] = js.native
  
  var visibleTo: js.UndefOr[js.Array[String]] = js.native
}
object Comments {
  
  @scala.inline
  def apply(): Comments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comments]
  }
  
  @scala.inline
  implicit class CommentsOps[Self <: Comments] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setHmac(value: String): Self = this.set("hmac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmac: Self = this.set("hmac", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: String*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[String]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setSentByEmail(value: String): Self = this.set("sentByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentByEmail: Self = this.set("sentByEmail", js.undefined)
    
    @scala.inline
    def setSentByFullName(value: String): Self = this.set("sentByFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentByFullName: Self = this.set("sentByFullName", js.undefined)
    
    @scala.inline
    def setSentByImageId(value: String): Self = this.set("sentByImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentByImageId: Self = this.set("sentByImageId", js.undefined)
    
    @scala.inline
    def setSentByInitials(value: String): Self = this.set("sentByInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentByInitials: Self = this.set("sentByInitials", js.undefined)
    
    @scala.inline
    def setSentByRecipientId(value: String): Self = this.set("sentByRecipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentByRecipientId: Self = this.set("sentByRecipientId", js.undefined)
    
    @scala.inline
    def setSentByUserId(value: String): Self = this.set("sentByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentByUserId: Self = this.set("sentByUserId", js.undefined)
    
    @scala.inline
    def setSigningGroupId(value: String): Self = this.set("signingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupId: Self = this.set("signingGroupId", js.undefined)
    
    @scala.inline
    def setSigningGroupName(value: String): Self = this.set("signingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupName: Self = this.set("signingGroupName", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTabId(value: String): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setThreadId(value: String): Self = this.set("threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
    
    @scala.inline
    def setThreadOriginatorId(value: String): Self = this.set("threadOriginatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadOriginatorId: Self = this.set("threadOriginatorId", js.undefined)
    
    @scala.inline
    def setTimeStampFormatted(value: String): Self = this.set("timeStampFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStampFormatted: Self = this.set("timeStampFormatted", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setVisibleToVarargs(value: String*): Self = this.set("visibleTo", js.Array(value :_*))
    
    @scala.inline
    def setVisibleTo(value: js.Array[String]): Self = this.set("visibleTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleTo: Self = this.set("visibleTo", js.undefined)
  }
}
