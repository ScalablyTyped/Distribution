package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAs extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var isDefault: js.UndefOr[Boolean] = js.native
  var isPrimary: js.UndefOr[Boolean] = js.native
  var replyToAddress: js.UndefOr[String] = js.native
  var sendAsEmail: js.UndefOr[String] = js.native
  var signature: js.UndefOr[String] = js.native
  var smtpMsa: js.UndefOr[SmtpMsa] = js.native
  var treatAsAlias: js.UndefOr[Boolean] = js.native
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

