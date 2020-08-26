package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetShowHingeRequest extends js.Object {
  /**
    * hinge data, null means hideHinge
    */
  var hingeConfig: js.UndefOr[HingeConfig] = js.native
}

object SetShowHingeRequest {
  @scala.inline
  def apply(): SetShowHingeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetShowHingeRequest]
  }
  @scala.inline
  implicit class SetShowHingeRequestOps[Self <: SetShowHingeRequest] (val x: Self) extends AnyVal {
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
    def setHingeConfig(value: HingeConfig): Self = this.set("hingeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHingeConfig: Self = this.set("hingeConfig", js.undefined)
  }
  
}

