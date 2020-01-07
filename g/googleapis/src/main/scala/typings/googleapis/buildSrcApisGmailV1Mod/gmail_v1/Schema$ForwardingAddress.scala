package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a forwarding address.
  */
@js.native
trait Schema$ForwardingAddress extends js.Object {
  /**
    * An email address to which messages can be forwarded.
    */
  var forwardingEmail: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address has been verified and is usable for
    * forwarding. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}

object Schema$ForwardingAddress {
  @scala.inline
  def apply(forwardingEmail: String = null, verificationStatus: String = null): Schema$ForwardingAddress = {
    val __obj = js.Dynamic.literal()
    if (forwardingEmail != null) __obj.updateDynamic("forwardingEmail")(forwardingEmail.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ForwardingAddress]
  }
}

