package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationRanges extends js.Object {
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.undefined
  /** Data disk assignments for ranges from this computation. */
  var rangeAssignments: js.UndefOr[js.Array[KeyRangeDataDiskAssignment]] = js.undefined
}

object StreamingComputationRanges {
  @scala.inline
  def apply(computationId: String = null, rangeAssignments: js.Array[KeyRangeDataDiskAssignment] = null): StreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId.asInstanceOf[js.Any])
    if (rangeAssignments != null) __obj.updateDynamic("rangeAssignments")(rangeAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingComputationRanges]
  }
}

