package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNetworkPolicyRequest extends js.Object {
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.native
}

object SetNetworkPolicyRequest {
  @scala.inline
  def apply(): SetNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNetworkPolicyRequest]
  }
  @scala.inline
  implicit class SetNetworkPolicyRequestOps[Self <: SetNetworkPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetworkPolicy(value: NetworkPolicy): Self = this.set("networkPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPolicy: Self = this.set("networkPolicy", js.undefined)
  }
  
}

