package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterStatus extends js.Object {
  /** Output-only. Optional details of cluster's state. */
  var detail: js.UndefOr[String] = js.undefined
  /** Output-only. The cluster's state. */
  var state: js.UndefOr[String] = js.undefined
  /** Output-only. Time when this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.undefined
  /** Output-only. Additional state information that includes status reported by the agent. */
  var substate: js.UndefOr[String] = js.undefined
}

object ClusterStatus {
  @scala.inline
  def apply(
    detail: String = null,
    state: String = null,
    stateStartTime: String = null,
    substate: String = null
  ): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime)
    if (substate != null) __obj.updateDynamic("substate")(substate)
    __obj.asInstanceOf[ClusterStatus]
  }
}

