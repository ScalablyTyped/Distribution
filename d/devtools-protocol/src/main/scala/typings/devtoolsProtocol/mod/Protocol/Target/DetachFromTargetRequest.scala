package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachFromTargetRequest extends js.Object {
  /**
    * Session to detach.
    */
  var sessionId: js.UndefOr[SessionID] = js.native
  /**
    * Deprecated.
    */
  var targetId: js.UndefOr[TargetID] = js.native
}

object DetachFromTargetRequest {
  @scala.inline
  def apply(): DetachFromTargetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachFromTargetRequest]
  }
  @scala.inline
  implicit class DetachFromTargetRequestOps[Self <: DetachFromTargetRequest] (val x: Self) extends AnyVal {
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
    def setSessionId(value: SessionID): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

