package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingEvent extends js.Object {
  /** The current number of workers the job has. */
  var currentNumWorkers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A message describing why the system decided to adjust the current
    * number of workers, why it failed, or why the system decided to
    * not make any changes to the number of workers.
    */
  var description: js.UndefOr[StructuredMessage] = js.undefined
  /** The type of autoscaling event to report. */
  var eventType: js.UndefOr[java.lang.String] = js.undefined
  /** The target number of workers the worker pool wants to resize to use. */
  var targetNumWorkers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time this event was emitted to indicate a new target or current
    * num_workers value.
    */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

