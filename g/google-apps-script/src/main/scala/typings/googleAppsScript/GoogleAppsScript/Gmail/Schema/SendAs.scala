package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAs extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  var replyToAddress: js.UndefOr[String] = js.undefined
  var sendAsEmail: js.UndefOr[String] = js.undefined
  var signature: js.UndefOr[String] = js.undefined
  var smtpMsa: js.UndefOr[SmtpMsa] = js.undefined
  var treatAsAlias: js.UndefOr[Boolean] = js.undefined
  var verificationStatus: js.UndefOr[String] = js.undefined
}

object SendAs {
  @scala.inline
  def apply(
    displayName: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    replyToAddress: String = null,
    sendAsEmail: String = null,
    signature: String = null,
    smtpMsa: SmtpMsa = null,
    treatAsAlias: js.UndefOr[Boolean] = js.undefined,
    verificationStatus: String = null
  ): SendAs = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (replyToAddress != null) __obj.updateDynamic("replyToAddress")(replyToAddress.asInstanceOf[js.Any])
    if (sendAsEmail != null) __obj.updateDynamic("sendAsEmail")(sendAsEmail.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (smtpMsa != null) __obj.updateDynamic("smtpMsa")(smtpMsa.asInstanceOf[js.Any])
    if (!js.isUndefined(treatAsAlias)) __obj.updateDynamic("treatAsAlias")(treatAsAlias.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAs]
  }
}

