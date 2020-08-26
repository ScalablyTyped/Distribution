package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerShutdownNotice extends js.Object {
  /**
    * The reason for the worker shutdown.
    * Current possible values are:
    * "UNKNOWN": shutdown reason is unknown.
    * "PREEMPTION": shutdown reason is preemption.
    * Other possible reasons may be added in the future.
    */
  var reason: js.UndefOr[String] = js.native
}

object WorkerShutdownNotice {
  @scala.inline
  def apply(): WorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerShutdownNotice]
  }
  @scala.inline
  implicit class WorkerShutdownNoticeOps[Self <: WorkerShutdownNotice] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

