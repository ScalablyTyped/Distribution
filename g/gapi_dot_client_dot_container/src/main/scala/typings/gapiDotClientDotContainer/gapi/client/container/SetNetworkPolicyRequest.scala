package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNetworkPolicyRequest extends js.Object {
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.undefined
}

object SetNetworkPolicyRequest {
  @scala.inline
  def apply(networkPolicy: NetworkPolicy = null): SetNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (networkPolicy != null) __obj.updateDynamic("networkPolicy")(networkPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNetworkPolicyRequest]
  }
}

