package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttemptStatus extends js.Object {
  /**
               * Output only.
               *
               * The time that this attempt was dispatched.
               *
               * `dispatch_time` will be truncated to the nearest microsecond.
               */
  var dispatchTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only.
               *
               * The response from the target for this attempt.
               *
               * If the task has not been attempted or the task is currently running
               * then the response status is google.rpc.Code.UNKNOWN.
               */
  var responseStatus: js.UndefOr[Status] = js.undefined
  /**
               * Output only.
               *
               * The time that this attempt response was received.
               *
               * `response_time` will be truncated to the nearest microsecond.
               */
  var responseTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only.
               *
               * The time that this attempt was scheduled.
               *
               * `schedule_time` will be truncated to the nearest microsecond.
               */
  var scheduleTime: js.UndefOr[java.lang.String] = js.undefined
}

