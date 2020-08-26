package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetCrashedEvent extends js.Object {
  /**
    * Termination error code.
    */
  var errorCode: integer = js.native
  /**
    * Termination status type.
    */
  var status: String = js.native
  var targetId: TargetID = js.native
}

object TargetCrashedEvent {
  @scala.inline
  def apply(errorCode: integer, status: String, targetId: TargetID): TargetCrashedEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCrashedEvent]
  }
  @scala.inline
  implicit class TargetCrashedEventOps[Self <: TargetCrashedEvent] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: integer): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

