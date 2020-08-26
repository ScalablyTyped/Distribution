package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDiscoverTargetsRequest extends js.Object {
  /**
    * Whether to discover available targets.
    */
  var discover: Boolean = js.native
}

object SetDiscoverTargetsRequest {
  @scala.inline
  def apply(discover: Boolean): SetDiscoverTargetsRequest = {
    val __obj = js.Dynamic.literal(discover = discover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDiscoverTargetsRequest]
  }
  @scala.inline
  implicit class SetDiscoverTargetsRequestOps[Self <: SetDiscoverTargetsRequest] (val x: Self) extends AnyVal {
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
    def setDiscover(value: Boolean): Self = this.set("discover", value.asInstanceOf[js.Any])
  }
  
}

