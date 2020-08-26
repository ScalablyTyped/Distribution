package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNavigatorOverridesRequest extends js.Object {
  /**
    * The platform navigator.platform should return.
    */
  var platform: String = js.native
}

object SetNavigatorOverridesRequest {
  @scala.inline
  def apply(platform: String): SetNavigatorOverridesRequest = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigatorOverridesRequest]
  }
  @scala.inline
  implicit class SetNavigatorOverridesRequestOps[Self <: SetNavigatorOverridesRequest] (val x: Self) extends AnyVal {
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
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

