package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListForwardingAddresses method.
  */
@js.native
trait Schema$ListForwardingAddressesResponse extends js.Object {
  /**
    * List of addresses that may be used for forwarding.
    */
  var forwardingAddresses: js.UndefOr[js.Array[Schema$ForwardingAddress]] = js.native
}

object Schema$ListForwardingAddressesResponse {
  @scala.inline
  def apply(forwardingAddresses: js.Array[Schema$ForwardingAddress] = null): Schema$ListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    if (forwardingAddresses != null) __obj.updateDynamic("forwardingAddresses")(forwardingAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListForwardingAddressesResponse]
  }
}

