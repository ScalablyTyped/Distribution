package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a cluster and its instances.
  */
@js.native
trait Schema$ClusterStatus extends js.Object {
  /**
    * Output only. Optional details of cluster&#39;s state.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * Output only. The cluster&#39;s state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
  /**
    * Output only. Additional state information that includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.native
}

object Schema$ClusterStatus {
  @scala.inline
  def apply(
    detail: String = null,
    state: String = null,
    stateStartTime: String = null,
    substate: String = null
  ): Schema$ClusterStatus = {
    val __obj = js.Dynamic.literal()
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime.asInstanceOf[js.Any])
    if (substate != null) __obj.updateDynamic("substate")(substate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClusterStatus]
  }
}

