package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListForwardingAddressesResponse extends js.Object {
  var forwardingAddresses: js.UndefOr[js.Array[ForwardingAddress]] = js.undefined
}

object ListForwardingAddressesResponse {
  @scala.inline
  def apply(forwardingAddresses: js.Array[ForwardingAddress] = null): ListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    if (forwardingAddresses != null) __obj.updateDynamic("forwardingAddresses")(forwardingAddresses)
    __obj.asInstanceOf[ListForwardingAddressesResponse]
  }
}

