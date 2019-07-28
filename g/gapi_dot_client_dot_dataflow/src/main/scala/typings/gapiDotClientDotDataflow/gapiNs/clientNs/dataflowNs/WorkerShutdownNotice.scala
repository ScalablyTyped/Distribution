package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerShutdownNotice extends js.Object {
  /**
    * The reason for the worker shutdown.
    * Current possible values are:
    * "UNKNOWN": shutdown reason is unknown.
    * "PREEMPTION": shutdown reason is preemption.
    * Other possible reasons may be added in the future.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object WorkerShutdownNotice {
  @scala.inline
  def apply(reason: String = null): WorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[WorkerShutdownNotice]
  }
}

