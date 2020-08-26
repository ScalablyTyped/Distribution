package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionRevokedEvent extends js.Object {
  /**
    * The id of revoked exception, as reported in `exceptionThrown`.
    */
  var exceptionId: integer = js.native
  /**
    * Reason describing why exception was revoked.
    */
  var reason: String = js.native
}

object ExceptionRevokedEvent {
  @scala.inline
  def apply(exceptionId: integer, reason: String): ExceptionRevokedEvent = {
    val __obj = js.Dynamic.literal(exceptionId = exceptionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionRevokedEvent]
  }
  @scala.inline
  implicit class ExceptionRevokedEventOps[Self <: ExceptionRevokedEvent] (val x: Self) extends AnyVal {
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
    def setExceptionId(value: integer): Self = this.set("exceptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

