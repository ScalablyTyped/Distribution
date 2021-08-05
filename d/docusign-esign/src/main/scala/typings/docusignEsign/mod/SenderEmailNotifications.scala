package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderEmailNotifications extends StObject {
  
  /**
    * When set to **true**, the sender receives an email notification if the signer changes.
    */
  var changedSigner: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives only comments that mention their own user name.
    */
  var commentsOnlyPrivateAndMention: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives all comments.
    */
  var commentsReceiveAll: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender receives an email notification if envelope delivery fails.
    */
  var deliveryFailed: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification when the envelope has been completed.
    */
  var envelopeComplete: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification if offline signing failed.
    */
  var offlineSigningFailed: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification when a document purge occurs.
    */
  var purgeDocuments: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender receives notification that a recipient viewed the envelope.
    */
  var recipientViewed: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender receives notification that the envelope was declined.
    */
  var senderEnvelopeDeclined: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification if consent is withdrawn.
    */
  var withdrawnConsent: js.UndefOr[String] = js.undefined
}
object SenderEmailNotifications {
  
  inline def apply(): SenderEmailNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SenderEmailNotifications]
  }
  
  extension [Self <: SenderEmailNotifications](x: Self) {
    
    inline def setChangedSigner(value: String): Self = StObject.set(x, "changedSigner", value.asInstanceOf[js.Any])
    
    inline def setChangedSignerUndefined: Self = StObject.set(x, "changedSigner", js.undefined)
    
    inline def setCommentsOnlyPrivateAndMention(value: String): Self = StObject.set(x, "commentsOnlyPrivateAndMention", value.asInstanceOf[js.Any])
    
    inline def setCommentsOnlyPrivateAndMentionUndefined: Self = StObject.set(x, "commentsOnlyPrivateAndMention", js.undefined)
    
    inline def setCommentsReceiveAll(value: String): Self = StObject.set(x, "commentsReceiveAll", value.asInstanceOf[js.Any])
    
    inline def setCommentsReceiveAllUndefined: Self = StObject.set(x, "commentsReceiveAll", js.undefined)
    
    inline def setDeliveryFailed(value: String): Self = StObject.set(x, "deliveryFailed", value.asInstanceOf[js.Any])
    
    inline def setDeliveryFailedUndefined: Self = StObject.set(x, "deliveryFailed", js.undefined)
    
    inline def setEnvelopeComplete(value: String): Self = StObject.set(x, "envelopeComplete", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeCompleteUndefined: Self = StObject.set(x, "envelopeComplete", js.undefined)
    
    inline def setOfflineSigningFailed(value: String): Self = StObject.set(x, "offlineSigningFailed", value.asInstanceOf[js.Any])
    
    inline def setOfflineSigningFailedUndefined: Self = StObject.set(x, "offlineSigningFailed", js.undefined)
    
    inline def setPurgeDocuments(value: String): Self = StObject.set(x, "purgeDocuments", value.asInstanceOf[js.Any])
    
    inline def setPurgeDocumentsUndefined: Self = StObject.set(x, "purgeDocuments", js.undefined)
    
    inline def setRecipientViewed(value: String): Self = StObject.set(x, "recipientViewed", value.asInstanceOf[js.Any])
    
    inline def setRecipientViewedUndefined: Self = StObject.set(x, "recipientViewed", js.undefined)
    
    inline def setSenderEnvelopeDeclined(value: String): Self = StObject.set(x, "senderEnvelopeDeclined", value.asInstanceOf[js.Any])
    
    inline def setSenderEnvelopeDeclinedUndefined: Self = StObject.set(x, "senderEnvelopeDeclined", js.undefined)
    
    inline def setWithdrawnConsent(value: String): Self = StObject.set(x, "withdrawnConsent", value.asInstanceOf[js.Any])
    
    inline def setWithdrawnConsentUndefined: Self = StObject.set(x, "withdrawnConsent", js.undefined)
  }
}
