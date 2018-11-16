package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AddMatterPermissionsRequest extends js.Object {
  /**
               * Only relevant if send_emails is true.
               * True to CC requestor in the email message.
               * False to not CC requestor.
               */
  var ccMe: js.UndefOr[scala.Boolean] = js.undefined
  /** The MatterPermission to add. */
  var matterPermission: js.UndefOr[MatterPermission] = js.undefined
  /**
               * True to send notification email to the added account.
               * False to not send notification email.
               */
  var sendEmails: js.UndefOr[scala.Boolean] = js.undefined
}

