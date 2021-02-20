package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends StObject {
  
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
  implicit class CommentsMutableBuilder[Self <: Comments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setHmac(value: String): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setSentByEmail(value: String): Self = StObject.set(x, "sentByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentByEmailUndefined: Self = StObject.set(x, "sentByEmail", js.undefined)
    
    @scala.inline
    def setSentByFullName(value: String): Self = StObject.set(x, "sentByFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentByFullNameUndefined: Self = StObject.set(x, "sentByFullName", js.undefined)
    
    @scala.inline
    def setSentByImageId(value: String): Self = StObject.set(x, "sentByImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentByImageIdUndefined: Self = StObject.set(x, "sentByImageId", js.undefined)
    
    @scala.inline
    def setSentByInitials(value: String): Self = StObject.set(x, "sentByInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentByInitialsUndefined: Self = StObject.set(x, "sentByInitials", js.undefined)
    
    @scala.inline
    def setSentByRecipientId(value: String): Self = StObject.set(x, "sentByRecipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentByRecipientIdUndefined: Self = StObject.set(x, "sentByRecipientId", js.undefined)
    
    @scala.inline
    def setSentByUserId(value: String): Self = StObject.set(x, "sentByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentByUserIdUndefined: Self = StObject.set(x, "sentByUserId", js.undefined)
    
    @scala.inline
    def setSigningGroupId(value: String): Self = StObject.set(x, "signingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupIdUndefined: Self = StObject.set(x, "signingGroupId", js.undefined)
    
    @scala.inline
    def setSigningGroupName(value: String): Self = StObject.set(x, "signingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupNameUndefined: Self = StObject.set(x, "signingGroupName", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    @scala.inline
    def setThreadOriginatorId(value: String): Self = StObject.set(x, "threadOriginatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadOriginatorIdUndefined: Self = StObject.set(x, "threadOriginatorId", js.undefined)
    
    @scala.inline
    def setTimeStampFormatted(value: String): Self = StObject.set(x, "timeStampFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStampFormattedUndefined: Self = StObject.set(x, "timeStampFormatted", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setVisibleTo(value: js.Array[String]): Self = StObject.set(x, "visibleTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToUndefined: Self = StObject.set(x, "visibleTo", js.undefined)
    
    @scala.inline
    def setVisibleToVarargs(value: String*): Self = StObject.set(x, "visibleTo", js.Array(value :_*))
  }
}
