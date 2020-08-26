package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAddonsConfigRequest extends js.Object {
  /**
    * The desired configurations for the various addons available to run in the
    * cluster.
    */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.native
}

object SetAddonsConfigRequest {
  @scala.inline
  def apply(): SetAddonsConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetAddonsConfigRequest]
  }
  @scala.inline
  implicit class SetAddonsConfigRequestOps[Self <: SetAddonsConfigRequest] (val x: Self) extends AnyVal {
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
    def setAddonsConfig(value: AddonsConfig): Self = this.set("addonsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonsConfig: Self = this.set("addonsConfig", js.undefined)
  }
  
}

