package typings.gapiDotClientDotVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMatterPermissionsRequest extends js.Object {
  /**
    * Only relevant if send_emails is true.
    * True to CC requestor in the email message.
    * False to not CC requestor.
    */
  var ccMe: js.UndefOr[Boolean] = js.undefined
  /** The MatterPermission to add. */
  var matterPermission: js.UndefOr[MatterPermission] = js.undefined
  /**
    * True to send notification email to the added account.
    * False to not send notification email.
    */
  var sendEmails: js.UndefOr[Boolean] = js.undefined
}

object AddMatterPermissionsRequest {
  @scala.inline
  def apply(
    ccMe: js.UndefOr[Boolean] = js.undefined,
    matterPermission: MatterPermission = null,
    sendEmails: js.UndefOr[Boolean] = js.undefined
  ): AddMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ccMe)) __obj.updateDynamic("ccMe")(ccMe)
    if (matterPermission != null) __obj.updateDynamic("matterPermission")(matterPermission)
    if (!js.isUndefined(sendEmails)) __obj.updateDynamic("sendEmails")(sendEmails)
    __obj.asInstanceOf[AddMatterPermissionsRequest]
  }
}

