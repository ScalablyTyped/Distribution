package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterStatus extends js.Object {
  /** Output-only. Optional details of cluster's state. */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. The cluster's state. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Time when this state was entered. */
  var stateStartTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Additional state information that includes status reported by the agent. */
  var substate: js.UndefOr[java.lang.String] = js.undefined
}

object ClusterStatus {
  @scala.inline
  def apply(
    detail: java.lang.String = null,
    state: java.lang.String = null,
    stateStartTime: java.lang.String = null,
    substate: java.lang.String = null
  ): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime)
    if (substate != null) __obj.updateDynamic("substate")(substate)
    __obj.asInstanceOf[ClusterStatus]
  }
}

