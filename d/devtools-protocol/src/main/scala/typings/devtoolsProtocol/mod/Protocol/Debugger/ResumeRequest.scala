package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeRequest extends js.Object {
  /**
    * Set to true to terminate execution upon resuming execution. In contrast
    * to Runtime.terminateExecution, this will allows to execute further
    * JavaScript (i.e. via evaluation) until execution of the paused code
    * is actually resumed, at which point termination is triggered.
    * If execution is currently not paused, this parameter has no effect.
    */
  var terminateOnResume: js.UndefOr[Boolean] = js.native
}

object ResumeRequest {
  @scala.inline
  def apply(): ResumeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeRequest]
  }
  @scala.inline
  implicit class ResumeRequestOps[Self <: ResumeRequest] (val x: Self) extends AnyVal {
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
    def setTerminateOnResume(value: Boolean): Self = this.set("terminateOnResume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateOnResume: Self = this.set("terminateOnResume", js.undefined)
  }
  
}

