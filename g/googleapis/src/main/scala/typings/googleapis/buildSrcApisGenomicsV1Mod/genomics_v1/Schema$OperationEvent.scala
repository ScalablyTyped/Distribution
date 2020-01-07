package typings.googleapis.buildSrcApisGenomicsV1Mod.genomics_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event that occurred during an Operation.
  */
@js.native
trait Schema$OperationEvent extends js.Object {
  /**
    * Required description of event.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional time of when event finished. An event can have a start time and
    * no finish time. If an event has a finish time, there must be a start
    * time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Optional time of when event started.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$OperationEvent {
  @scala.inline
  def apply(description: String = null, endTime: String = null, startTime: String = null): Schema$OperationEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationEvent]
  }
}

