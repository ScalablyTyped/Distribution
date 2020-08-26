package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachToTargetRequest extends js.Object {
  /**
    * Enables "flat" access to the session via specifying sessionId attribute in the commands.
    * We plan to make this the default, deprecate non-flattened mode,
    * and eventually retire it. See crbug.com/991325.
    */
  var flatten: js.UndefOr[Boolean] = js.native
  var targetId: TargetID = js.native
}

object AttachToTargetRequest {
  @scala.inline
  def apply(targetId: TargetID): AttachToTargetRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToTargetRequest]
  }
  @scala.inline
  implicit class AttachToTargetRequestOps[Self <: AttachToTargetRequest] (val x: Self) extends AnyVal {
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
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
  }
  
}

