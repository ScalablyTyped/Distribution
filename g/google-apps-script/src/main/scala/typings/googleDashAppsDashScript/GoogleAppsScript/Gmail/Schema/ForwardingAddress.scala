package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddress extends js.Object {
  var forwardingEmail: js.UndefOr[String] = js.undefined
  var verificationStatus: js.UndefOr[String] = js.undefined
}

object ForwardingAddress {
  @scala.inline
  def apply(forwardingEmail: String = null, verificationStatus: String = null): ForwardingAddress = {
    val __obj = js.Dynamic.literal()
    if (forwardingEmail != null) __obj.updateDynamic("forwardingEmail")(forwardingEmail)
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus)
    __obj.asInstanceOf[ForwardingAddress]
  }
}

