package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseWorkItemResponse extends js.Object {
  /** A list of the leased WorkItems. */
  var workItems: js.UndefOr[js.Array[WorkItem]] = js.undefined
}

object LeaseWorkItemResponse {
  @scala.inline
  def apply(workItems: js.Array[WorkItem] = null): LeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    if (workItems != null) __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[LeaseWorkItemResponse]
  }
}

