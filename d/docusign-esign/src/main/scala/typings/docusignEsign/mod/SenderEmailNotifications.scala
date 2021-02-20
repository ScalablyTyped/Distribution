package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SenderEmailNotifications extends StObject {
  
  /**
    * When set to **true**, the sender receives an email notification if the signer changes.
    */
  var changedSigner: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives only comments that mention their own user name.
    */
  var commentsOnlyPrivateAndMention: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives all comments.
    */
  var commentsReceiveAll: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender receives an email notification if envelope delivery fails.
    */
  var deliveryFailed: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification when the envelope has been completed.
    */
  var envelopeComplete: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification if offline signing failed.
    */
  var offlineSigningFailed: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification when a document purge occurs.
    */
  var purgeDocuments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender receives notification that a recipient viewed the envelope.
    */
  var recipientViewed: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender receives notification that the envelope was declined.
    */
  var senderEnvelopeDeclined: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification if consent is withdrawn.
    */
  var withdrawnConsent: js.UndefOr[String] = js.native
}
object SenderEmailNotifications {
  
  @scala.inline
  def apply(): SenderEmailNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SenderEmailNotifications]
  }
  
  @scala.inline
  implicit class SenderEmailNotificationsMutableBuilder[Self <: SenderEmailNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedSigner(value: String): Self = StObject.set(x, "changedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedSignerUndefined: Self = StObject.set(x, "changedSigner", js.undefined)
    
    @scala.inline
    def setCommentsOnlyPrivateAndMention(value: String): Self = StObject.set(x, "commentsOnlyPrivateAndMention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsOnlyPrivateAndMentionUndefined: Self = StObject.set(x, "commentsOnlyPrivateAndMention", js.undefined)
    
    @scala.inline
    def setCommentsReceiveAll(value: String): Self = StObject.set(x, "commentsReceiveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsReceiveAllUndefined: Self = StObject.set(x, "commentsReceiveAll", js.undefined)
    
    @scala.inline
    def setDeliveryFailed(value: String): Self = StObject.set(x, "deliveryFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryFailedUndefined: Self = StObject.set(x, "deliveryFailed", js.undefined)
    
    @scala.inline
    def setEnvelopeComplete(value: String): Self = StObject.set(x, "envelopeComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeCompleteUndefined: Self = StObject.set(x, "envelopeComplete", js.undefined)
    
    @scala.inline
    def setOfflineSigningFailed(value: String): Self = StObject.set(x, "offlineSigningFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineSigningFailedUndefined: Self = StObject.set(x, "offlineSigningFailed", js.undefined)
    
    @scala.inline
    def setPurgeDocuments(value: String): Self = StObject.set(x, "purgeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeDocumentsUndefined: Self = StObject.set(x, "purgeDocuments", js.undefined)
    
    @scala.inline
    def setRecipientViewed(value: String): Self = StObject.set(x, "recipientViewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientViewedUndefined: Self = StObject.set(x, "recipientViewed", js.undefined)
    
    @scala.inline
    def setSenderEnvelopeDeclined(value: String): Self = StObject.set(x, "senderEnvelopeDeclined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderEnvelopeDeclinedUndefined: Self = StObject.set(x, "senderEnvelopeDeclined", js.undefined)
    
    @scala.inline
    def setWithdrawnConsent(value: String): Self = StObject.set(x, "withdrawnConsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawnConsentUndefined: Self = StObject.set(x, "withdrawnConsent", js.undefined)
  }
}
