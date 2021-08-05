package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignerEmailNotifications extends StObject {
  
  /**
    * When set to **true**, the user receives agent notification emails.
    */
  var agentNotification: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notifications of carbon copy deliveries.
    */
  var carbonCopyNotification: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notifications of certified deliveries.
    */
  var certifiedDeliveryNotification: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives only comments that mention their own user name.
    */
  var commentsOnlyPrivateAndMention: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives all comments.
    */
  var commentsReceiveAll: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that document markup has been activated.
    */
  var documentMarkupActivation: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that the envelope has been activated.
    */
  var envelopeActivation: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification when the envelope has been completed.
    */
  var envelopeComplete: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that the envelope has been corrected.
    */
  var envelopeCorrected: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that the envelope has been declined.
    */
  var envelopeDeclined: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that the envelope has been voided.
    */
  var envelopeVoided: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var faxReceived: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification if offline signing failed.
    */
  var offlineSigningFailed: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives an email notification when a document purge occurs.
    */
  var purgeDocuments: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that the envelope has been reassigned.
    */
  var reassignedSigner: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user receives notification that he or she is a member of the signing group.
    */
  var whenSigningGroupMember: js.UndefOr[String] = js.undefined
}
object SignerEmailNotifications {
  
  inline def apply(): SignerEmailNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignerEmailNotifications]
  }
  
  extension [Self <: SignerEmailNotifications](x: Self) {
    
    inline def setAgentNotification(value: String): Self = StObject.set(x, "agentNotification", value.asInstanceOf[js.Any])
    
    inline def setAgentNotificationUndefined: Self = StObject.set(x, "agentNotification", js.undefined)
    
    inline def setCarbonCopyNotification(value: String): Self = StObject.set(x, "carbonCopyNotification", value.asInstanceOf[js.Any])
    
    inline def setCarbonCopyNotificationUndefined: Self = StObject.set(x, "carbonCopyNotification", js.undefined)
    
    inline def setCertifiedDeliveryNotification(value: String): Self = StObject.set(x, "certifiedDeliveryNotification", value.asInstanceOf[js.Any])
    
    inline def setCertifiedDeliveryNotificationUndefined: Self = StObject.set(x, "certifiedDeliveryNotification", js.undefined)
    
    inline def setCommentsOnlyPrivateAndMention(value: String): Self = StObject.set(x, "commentsOnlyPrivateAndMention", value.asInstanceOf[js.Any])
    
    inline def setCommentsOnlyPrivateAndMentionUndefined: Self = StObject.set(x, "commentsOnlyPrivateAndMention", js.undefined)
    
    inline def setCommentsReceiveAll(value: String): Self = StObject.set(x, "commentsReceiveAll", value.asInstanceOf[js.Any])
    
    inline def setCommentsReceiveAllUndefined: Self = StObject.set(x, "commentsReceiveAll", js.undefined)
    
    inline def setDocumentMarkupActivation(value: String): Self = StObject.set(x, "documentMarkupActivation", value.asInstanceOf[js.Any])
    
    inline def setDocumentMarkupActivationUndefined: Self = StObject.set(x, "documentMarkupActivation", js.undefined)
    
    inline def setEnvelopeActivation(value: String): Self = StObject.set(x, "envelopeActivation", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeActivationUndefined: Self = StObject.set(x, "envelopeActivation", js.undefined)
    
    inline def setEnvelopeComplete(value: String): Self = StObject.set(x, "envelopeComplete", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeCompleteUndefined: Self = StObject.set(x, "envelopeComplete", js.undefined)
    
    inline def setEnvelopeCorrected(value: String): Self = StObject.set(x, "envelopeCorrected", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeCorrectedUndefined: Self = StObject.set(x, "envelopeCorrected", js.undefined)
    
    inline def setEnvelopeDeclined(value: String): Self = StObject.set(x, "envelopeDeclined", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeDeclinedUndefined: Self = StObject.set(x, "envelopeDeclined", js.undefined)
    
    inline def setEnvelopeVoided(value: String): Self = StObject.set(x, "envelopeVoided", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeVoidedUndefined: Self = StObject.set(x, "envelopeVoided", js.undefined)
    
    inline def setFaxReceived(value: String): Self = StObject.set(x, "faxReceived", value.asInstanceOf[js.Any])
    
    inline def setFaxReceivedUndefined: Self = StObject.set(x, "faxReceived", js.undefined)
    
    inline def setOfflineSigningFailed(value: String): Self = StObject.set(x, "offlineSigningFailed", value.asInstanceOf[js.Any])
    
    inline def setOfflineSigningFailedUndefined: Self = StObject.set(x, "offlineSigningFailed", js.undefined)
    
    inline def setPurgeDocuments(value: String): Self = StObject.set(x, "purgeDocuments", value.asInstanceOf[js.Any])
    
    inline def setPurgeDocumentsUndefined: Self = StObject.set(x, "purgeDocuments", js.undefined)
    
    inline def setReassignedSigner(value: String): Self = StObject.set(x, "reassignedSigner", value.asInstanceOf[js.Any])
    
    inline def setReassignedSignerUndefined: Self = StObject.set(x, "reassignedSigner", js.undefined)
    
    inline def setWhenSigningGroupMember(value: String): Self = StObject.set(x, "whenSigningGroupMember", value.asInstanceOf[js.Any])
    
    inline def setWhenSigningGroupMemberUndefined: Self = StObject.set(x, "whenSigningGroupMember", js.undefined)
  }
}
