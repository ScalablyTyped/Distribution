package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMasterRequest extends js.Object {
  /**
    * The Kubernetes version to change the master to. The only valid value is the
    * latest supported version. Use "-" to have the server automatically select
    * the latest version.
    */
  var masterVersion: js.UndefOr[String] = js.native
}

object UpdateMasterRequest {
  @scala.inline
  def apply(): UpdateMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMasterRequest]
  }
  @scala.inline
  implicit class UpdateMasterRequestOps[Self <: UpdateMasterRequest] (val x: Self) extends AnyVal {
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
    def setMasterVersion(value: String): Self = this.set("masterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterVersion: Self = this.set("masterVersion", js.undefined)
  }
  
}

