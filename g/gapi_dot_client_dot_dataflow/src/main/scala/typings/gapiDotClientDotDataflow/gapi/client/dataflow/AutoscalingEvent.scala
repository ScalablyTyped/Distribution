package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingEvent extends js.Object {
  /** The current number of workers the job has. */
  var currentNumWorkers: js.UndefOr[String] = js.undefined
  /**
    * A message describing why the system decided to adjust the current
    * number of workers, why it failed, or why the system decided to
    * not make any changes to the number of workers.
    */
  var description: js.UndefOr[StructuredMessage] = js.undefined
  /** The type of autoscaling event to report. */
  var eventType: js.UndefOr[String] = js.undefined
  /** The target number of workers the worker pool wants to resize to use. */
  var targetNumWorkers: js.UndefOr[String] = js.undefined
  /**
    * The time this event was emitted to indicate a new target or current
    * num_workers value.
    */
  var time: js.UndefOr[String] = js.undefined
}

object AutoscalingEvent {
  @scala.inline
  def apply(
    currentNumWorkers: String = null,
    description: StructuredMessage = null,
    eventType: String = null,
    targetNumWorkers: String = null,
    time: String = null
  ): AutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    if (currentNumWorkers != null) __obj.updateDynamic("currentNumWorkers")(currentNumWorkers.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (targetNumWorkers != null) __obj.updateDynamic("targetNumWorkers")(targetNumWorkers.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingEvent]
  }
}

