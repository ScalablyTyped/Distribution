package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

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
    if (forwardingAddresses != null) __obj.updateDynamic("forwardingAddresses")(forwardingAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListForwardingAddressesResponse]
  }
}

