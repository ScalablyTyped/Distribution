package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddress extends js.Object {
  /** An email address to which messages can be forwarded. */
  var forwardingEmail: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this address has been verified and is usable for forwarding. Read-only. */
  var verificationStatus: js.UndefOr[java.lang.String] = js.undefined
}

object ForwardingAddress {
  @scala.inline
  def apply(forwardingEmail: java.lang.String = null, verificationStatus: java.lang.String = null): ForwardingAddress = {
    val __obj = js.Dynamic.literal()
    if (forwardingEmail != null) __obj.updateDynamic("forwardingEmail")(forwardingEmail)
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus)
    __obj.asInstanceOf[ForwardingAddress]
  }
}

