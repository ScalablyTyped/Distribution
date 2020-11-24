package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SenderEmailNotifications extends js.Object {
  
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
  implicit class SenderEmailNotificationsOps[Self <: SenderEmailNotifications] (val x: Self) extends AnyVal {
    
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
    def setChangedSigner(value: String): Self = this.set("changedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedSigner: Self = this.set("changedSigner", js.undefined)
    
    @scala.inline
    def setCommentsOnlyPrivateAndMention(value: String): Self = this.set("commentsOnlyPrivateAndMention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsOnlyPrivateAndMention: Self = this.set("commentsOnlyPrivateAndMention", js.undefined)
    
    @scala.inline
    def setCommentsReceiveAll(value: String): Self = this.set("commentsReceiveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsReceiveAll: Self = this.set("commentsReceiveAll", js.undefined)
    
    @scala.inline
    def setDeliveryFailed(value: String): Self = this.set("deliveryFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryFailed: Self = this.set("deliveryFailed", js.undefined)
    
    @scala.inline
    def setEnvelopeComplete(value: String): Self = this.set("envelopeComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeComplete: Self = this.set("envelopeComplete", js.undefined)
    
    @scala.inline
    def setOfflineSigningFailed(value: String): Self = this.set("offlineSigningFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineSigningFailed: Self = this.set("offlineSigningFailed", js.undefined)
    
    @scala.inline
    def setPurgeDocuments(value: String): Self = this.set("purgeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeDocuments: Self = this.set("purgeDocuments", js.undefined)
    
    @scala.inline
    def setRecipientViewed(value: String): Self = this.set("recipientViewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientViewed: Self = this.set("recipientViewed", js.undefined)
    
    @scala.inline
    def setSenderEnvelopeDeclined(value: String): Self = this.set("senderEnvelopeDeclined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderEnvelopeDeclined: Self = this.set("senderEnvelopeDeclined", js.undefined)
    
    @scala.inline
    def setWithdrawnConsent(value: String): Self = this.set("withdrawnConsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawnConsent: Self = this.set("withdrawnConsent", js.undefined)
  }
}
