package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.Target.TargetID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWindowForTargetRequest extends js.Object {
  /**
    * Devtools agent host id. If called as a part of the session, associated targetId is used.
    */
  var targetId: js.UndefOr[TargetID] = js.native
}

object GetWindowForTargetRequest {
  @scala.inline
  def apply(): GetWindowForTargetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWindowForTargetRequest]
  }
  @scala.inline
  implicit class GetWindowForTargetRequestOps[Self <: GetWindowForTargetRequest] (val x: Self) extends AnyVal {
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
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

