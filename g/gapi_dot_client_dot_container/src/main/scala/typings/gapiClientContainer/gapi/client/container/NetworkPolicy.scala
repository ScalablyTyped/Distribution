package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkPolicy extends js.Object {
  /** Whether network policy is enabled on the cluster. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** The selected network policy provider. */
  var provider: js.UndefOr[String] = js.native
}

object NetworkPolicy {
  @scala.inline
  def apply(): NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicy]
  }
  @scala.inline
  implicit class NetworkPolicyOps[Self <: NetworkPolicy] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

