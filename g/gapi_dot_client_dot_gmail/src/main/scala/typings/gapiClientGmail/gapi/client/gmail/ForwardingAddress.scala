package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingAddress extends js.Object {
  /** An email address to which messages can be forwarded. */
  var forwardingEmail: js.UndefOr[String] = js.native
  /** Indicates whether this address has been verified and is usable for forwarding. Read-only. */
  var verificationStatus: js.UndefOr[String] = js.native
}

object ForwardingAddress {
  @scala.inline
  def apply(): ForwardingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingAddress]
  }
  @scala.inline
  implicit class ForwardingAddressOps[Self <: ForwardingAddress] (val x: Self) extends AnyVal {
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
    def setForwardingEmail(value: String): Self = this.set("forwardingEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingEmail: Self = this.set("forwardingEmail", js.undefined)
    @scala.inline
    def setVerificationStatus(value: String): Self = this.set("verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationStatus: Self = this.set("verificationStatus", js.undefined)
  }
  
}

