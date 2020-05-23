package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoForwarding extends js.Object {
  /** The state that a message should be left in after it has been forwarded. */
  var disposition: js.UndefOr[String] = js.undefined
  /** Email address to which all incoming messages are forwarded. This email address must be a verified member of the forwarding addresses. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /** Whether all incoming mail is automatically forwarded to another address. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AutoForwarding {
  @scala.inline
  def apply(
    disposition: String = null,
    emailAddress: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): AutoForwarding = {
    val __obj = js.Dynamic.literal()
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoForwarding]
  }
}

