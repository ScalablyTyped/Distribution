package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comments extends StObject {
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var hmac: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * An array of userIds that are mentioned directly in the body of a comment.
    */
  var mentions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates if the comment has been read by the target recipient of the comment.
    */
  var read: js.UndefOr[Boolean] = js.undefined
  
  var sentByEmail: js.UndefOr[String] = js.undefined
  
  var sentByFullName: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var sentByImageId: js.UndefOr[String] = js.undefined
  
  var sentByInitials: js.UndefOr[String] = js.undefined
  
  var sentByRecipientId: js.UndefOr[String] = js.undefined
  
  var sentByUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The ID of the [signing group](https://support.docusign.com/en/guides/ndse-user-guide-signing-groups).
    *
    * **Note**: When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature. For this reason,
    * we recommend that you do not include non-signer recipients (such as carbon copy recipients) in the same signing group as signer recipients.
    * However, you could create a second signing group for the non-signer recipients and change the default action of Needs to Sign to a
    * different value, such as Receives a Copy.
    */
  var signingGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of the signing group.
    *
    * Maximum Length: 100 characters.
    */
  var signingGroupName: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text that is shown in the dropdown list.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the comment thread.
    */
  var threadId: js.UndefOr[String] = js.undefined
  
  /**
    * The userId of the user who created the thread.
    */
  var threadOriginatorId: js.UndefOr[String] = js.undefined
  
  var timeStampFormatted: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[String] = js.undefined
  
  var visibleTo: js.UndefOr[js.Array[String]] = js.undefined
}
object Comments {
  
  inline def apply(): Comments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comments] (val x: Self) extends AnyVal {
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setHmac(value: String): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
    
    inline def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSentByEmail(value: String): Self = StObject.set(x, "sentByEmail", value.asInstanceOf[js.Any])
    
    inline def setSentByEmailUndefined: Self = StObject.set(x, "sentByEmail", js.undefined)
    
    inline def setSentByFullName(value: String): Self = StObject.set(x, "sentByFullName", value.asInstanceOf[js.Any])
    
    inline def setSentByFullNameUndefined: Self = StObject.set(x, "sentByFullName", js.undefined)
    
    inline def setSentByImageId(value: String): Self = StObject.set(x, "sentByImageId", value.asInstanceOf[js.Any])
    
    inline def setSentByImageIdUndefined: Self = StObject.set(x, "sentByImageId", js.undefined)
    
    inline def setSentByInitials(value: String): Self = StObject.set(x, "sentByInitials", value.asInstanceOf[js.Any])
    
    inline def setSentByInitialsUndefined: Self = StObject.set(x, "sentByInitials", js.undefined)
    
    inline def setSentByRecipientId(value: String): Self = StObject.set(x, "sentByRecipientId", value.asInstanceOf[js.Any])
    
    inline def setSentByRecipientIdUndefined: Self = StObject.set(x, "sentByRecipientId", js.undefined)
    
    inline def setSentByUserId(value: String): Self = StObject.set(x, "sentByUserId", value.asInstanceOf[js.Any])
    
    inline def setSentByUserIdUndefined: Self = StObject.set(x, "sentByUserId", js.undefined)
    
    inline def setSigningGroupId(value: String): Self = StObject.set(x, "signingGroupId", value.asInstanceOf[js.Any])
    
    inline def setSigningGroupIdUndefined: Self = StObject.set(x, "signingGroupId", js.undefined)
    
    inline def setSigningGroupName(value: String): Self = StObject.set(x, "signingGroupName", value.asInstanceOf[js.Any])
    
    inline def setSigningGroupNameUndefined: Self = StObject.set(x, "signingGroupName", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    inline def setThreadOriginatorId(value: String): Self = StObject.set(x, "threadOriginatorId", value.asInstanceOf[js.Any])
    
    inline def setThreadOriginatorIdUndefined: Self = StObject.set(x, "threadOriginatorId", js.undefined)
    
    inline def setTimeStampFormatted(value: String): Self = StObject.set(x, "timeStampFormatted", value.asInstanceOf[js.Any])
    
    inline def setTimeStampFormattedUndefined: Self = StObject.set(x, "timeStampFormatted", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVisibleTo(value: js.Array[String]): Self = StObject.set(x, "visibleTo", value.asInstanceOf[js.Any])
    
    inline def setVisibleToUndefined: Self = StObject.set(x, "visibleTo", js.undefined)
    
    inline def setVisibleToVarargs(value: String*): Self = StObject.set(x, "visibleTo", js.Array(value*))
  }
}
