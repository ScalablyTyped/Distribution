package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAs extends js.Object {
  /**
    * A name that appears in the "From:" header for mail sent using this alias. For custom "from" addresses, when this is empty, Gmail will populate the
    * "From:" header with the name that is used for the primary address associated with the account.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Whether this address is selected as the default "From:" address in situations such as composing a new message or sending a vacation auto-reply. Every
    * Gmail account has exactly one default send-as address, so the only legal value that clients may write to this field is true. Changing this from false
    * to true for an address will result in this field becoming false for the other previous default address.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * Whether this address is the primary address used to login to the account. Every Gmail account has exactly one primary address, and it cannot be deleted
    * from the collection of send-as aliases. This field is read-only.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  /**
    * An optional email address that is included in a "Reply-To:" header for mail sent using this alias. If this is empty, Gmail will not generate a
    * "Reply-To:" header.
    */
  var replyToAddress: js.UndefOr[String] = js.native
  /** The email address that appears in the "From:" header for mail sent using this alias. This is read-only for all operations except create. */
  var sendAsEmail: js.UndefOr[String] = js.native
  /** An optional HTML signature that is included in messages composed with this alias in the Gmail web UI. */
  var signature: js.UndefOr[String] = js.native
  /**
    * An optional SMTP service that will be used as an outbound relay for mail sent using this alias. If this is empty, outbound mail will be sent directly
    * from Gmail's servers to the destination SMTP service. This setting only applies to custom "from" aliases.
    */
  var smtpMsa: js.UndefOr[SmtpMsa] = js.native
  /** Whether Gmail should  treat this address as an alias for the user's primary email address. This setting only applies to custom "from" aliases. */
  var treatAsAlias: js.UndefOr[Boolean] = js.native
  /** Indicates whether this address has been verified for use as a send-as alias. Read-only. This setting only applies to custom "from" aliases. */
  var verificationStatus: js.UndefOr[String] = js.native
}

object SendAs {
  @scala.inline
  def apply(): SendAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAs]
  }
  @scala.inline
  implicit class SendAsOps[Self <: SendAs] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    @scala.inline
    def setReplyToAddress(value: String): Self = this.set("replyToAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToAddress: Self = this.set("replyToAddress", js.undefined)
    @scala.inline
    def setSendAsEmail(value: String): Self = this.set("sendAsEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendAsEmail: Self = this.set("sendAsEmail", js.undefined)
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setSmtpMsa(value: SmtpMsa): Self = this.set("smtpMsa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmtpMsa: Self = this.set("smtpMsa", js.undefined)
    @scala.inline
    def setTreatAsAlias(value: Boolean): Self = this.set("treatAsAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatAsAlias: Self = this.set("treatAsAlias", js.undefined)
    @scala.inline
    def setVerificationStatus(value: String): Self = this.set("verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationStatus: Self = this.set("verificationStatus", js.undefined)
  }
  
}

