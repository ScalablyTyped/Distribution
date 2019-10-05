package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationEvent extends js.Object {
  /** Required description of event. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Optional time of when event finished. An event can have a start time and no
    * finish time. If an event has a finish time, there must be a start time.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** Optional time of when event started. */
  var startTime: js.UndefOr[String] = js.undefined
}

object OperationEvent {
  @scala.inline
  def apply(description: String = null, endTime: String = null, startTime: String = null): OperationEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[OperationEvent]
  }
}

