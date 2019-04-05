package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAs extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var replyToAddress: js.UndefOr[java.lang.String] = js.undefined
  var sendAsEmail: js.UndefOr[java.lang.String] = js.undefined
  var signature: js.UndefOr[java.lang.String] = js.undefined
  var smtpMsa: js.UndefOr[SmtpMsa] = js.undefined
  var treatAsAlias: js.UndefOr[scala.Boolean] = js.undefined
  var verificationStatus: js.UndefOr[java.lang.String] = js.undefined
}

object SendAs {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    isPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    replyToAddress: java.lang.String = null,
    sendAsEmail: java.lang.String = null,
    signature: java.lang.String = null,
    smtpMsa: SmtpMsa = null,
    treatAsAlias: js.UndefOr[scala.Boolean] = js.undefined,
    verificationStatus: java.lang.String = null
  ): SendAs = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
    if (replyToAddress != null) __obj.updateDynamic("replyToAddress")(replyToAddress)
    if (sendAsEmail != null) __obj.updateDynamic("sendAsEmail")(sendAsEmail)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (smtpMsa != null) __obj.updateDynamic("smtpMsa")(smtpMsa)
    if (!js.isUndefined(treatAsAlias)) __obj.updateDynamic("treatAsAlias")(treatAsAlias)
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus)
    __obj.asInstanceOf[SendAs]
  }
}

