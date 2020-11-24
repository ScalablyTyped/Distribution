package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationDefaultSettings extends js.Object {
  
  /**
    *
    * An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true,
    * the user will receive those types of email notifications from DocuSign.
    *
    * The user inherits the default account sender email notification settings when the user is created. The email notifications are:
    *
    * * envelopeComplete
    * * changedSigner
    * * senderEnvelopeDeclined
    * * withdrawnConsent
    * * recipientViewed
    * * deliveryFailed
    *
    */
  var senderEmailNotifications: js.UndefOr[
    /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
  ] = js.native
  
  /**
    * An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true, the user receives
    * those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
    */
  var signerEmailNotifications: js.UndefOr[
    /* An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is
    set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
    */ SignerEmailNotifications
  ] = js.native
}
object NotificationDefaultSettings {
  
  @scala.inline
  def apply(): NotificationDefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationDefaultSettings]
  }
  
  @scala.inline
  implicit class NotificationDefaultSettingsOps[Self <: NotificationDefaultSettings] (val x: Self) extends AnyVal {
    
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
    def setSenderEmailNotifications(
      value: /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
    ): Self = this.set("senderEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderEmailNotifications: Self = this.set("senderEmailNotifications", js.undefined)
    
    @scala.inline
    def setSignerEmailNotifications(
      value: /* An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is
      set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
      */ SignerEmailNotifications
    ): Self = this.set("signerEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerEmailNotifications: Self = this.set("signerEmailNotifications", js.undefined)
  }
}
