package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerEmailNotifications extends js.Object {
  
  /**
    * When set to **true**, the user receives agent notification emails.
    */
  var agentNotification: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notifications of carbon copy deliveries.
    */
  var carbonCopyNotification: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notifications of certified deliveries.
    */
  var certifiedDeliveryNotification: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives only comments that mention their own user name.
    */
  var commentsOnlyPrivateAndMention: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives all comments.
    */
  var commentsReceiveAll: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that document markup has been activated.
    */
  var documentMarkupActivation: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been activated.
    */
  var envelopeActivation: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification when the envelope has been completed.
    */
  var envelopeComplete: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been corrected.
    */
  var envelopeCorrected: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been declined.
    */
  var envelopeDeclined: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been voided.
    */
  var envelopeVoided: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxReceived: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification if offline signing failed.
    */
  var offlineSigningFailed: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification when a document purge occurs.
    */
  var purgeDocuments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been reassigned.
    */
  var reassignedSigner: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that he or she is a member of the signing group.
    */
  var whenSigningGroupMember: js.UndefOr[String] = js.native
}
object SignerEmailNotifications {
  
  @scala.inline
  def apply(): SignerEmailNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignerEmailNotifications]
  }
  
  @scala.inline
  implicit class SignerEmailNotificationsOps[Self <: SignerEmailNotifications] (val x: Self) extends AnyVal {
    
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
    def setAgentNotification(value: String): Self = this.set("agentNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentNotification: Self = this.set("agentNotification", js.undefined)
    
    @scala.inline
    def setCarbonCopyNotification(value: String): Self = this.set("carbonCopyNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarbonCopyNotification: Self = this.set("carbonCopyNotification", js.undefined)
    
    @scala.inline
    def setCertifiedDeliveryNotification(value: String): Self = this.set("certifiedDeliveryNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertifiedDeliveryNotification: Self = this.set("certifiedDeliveryNotification", js.undefined)
    
    @scala.inline
    def setCommentsOnlyPrivateAndMention(value: String): Self = this.set("commentsOnlyPrivateAndMention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsOnlyPrivateAndMention: Self = this.set("commentsOnlyPrivateAndMention", js.undefined)
    
    @scala.inline
    def setCommentsReceiveAll(value: String): Self = this.set("commentsReceiveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsReceiveAll: Self = this.set("commentsReceiveAll", js.undefined)
    
    @scala.inline
    def setDocumentMarkupActivation(value: String): Self = this.set("documentMarkupActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentMarkupActivation: Self = this.set("documentMarkupActivation", js.undefined)
    
    @scala.inline
    def setEnvelopeActivation(value: String): Self = this.set("envelopeActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeActivation: Self = this.set("envelopeActivation", js.undefined)
    
    @scala.inline
    def setEnvelopeComplete(value: String): Self = this.set("envelopeComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeComplete: Self = this.set("envelopeComplete", js.undefined)
    
    @scala.inline
    def setEnvelopeCorrected(value: String): Self = this.set("envelopeCorrected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeCorrected: Self = this.set("envelopeCorrected", js.undefined)
    
    @scala.inline
    def setEnvelopeDeclined(value: String): Self = this.set("envelopeDeclined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeDeclined: Self = this.set("envelopeDeclined", js.undefined)
    
    @scala.inline
    def setEnvelopeVoided(value: String): Self = this.set("envelopeVoided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeVoided: Self = this.set("envelopeVoided", js.undefined)
    
    @scala.inline
    def setFaxReceived(value: String): Self = this.set("faxReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxReceived: Self = this.set("faxReceived", js.undefined)
    
    @scala.inline
    def setOfflineSigningFailed(value: String): Self = this.set("offlineSigningFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineSigningFailed: Self = this.set("offlineSigningFailed", js.undefined)
    
    @scala.inline
    def setPurgeDocuments(value: String): Self = this.set("purgeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeDocuments: Self = this.set("purgeDocuments", js.undefined)
    
    @scala.inline
    def setReassignedSigner(value: String): Self = this.set("reassignedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReassignedSigner: Self = this.set("reassignedSigner", js.undefined)
    
    @scala.inline
    def setWhenSigningGroupMember(value: String): Self = this.set("whenSigningGroupMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenSigningGroupMember: Self = this.set("whenSigningGroupMember", js.undefined)
  }
}
