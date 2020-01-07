package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Dataproc job status.
  */
@js.native
trait Schema$JobStatus extends js.Object {
  /**
    * Output only. Optional job state details, such as an error description if
    * the state is &lt;code&gt;ERROR&lt;/code&gt;.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * Output only. A state message specifying the overall job state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
  /**
    * Output only. Additional state information, which includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.native
}

object Schema$JobStatus {
  @scala.inline
  def apply(
    details: String = null,
    state: String = null,
    stateStartTime: String = null,
    substate: String = null
  ): Schema$JobStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime.asInstanceOf[js.Any])
    if (substate != null) __obj.updateDynamic("substate")(substate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobStatus]
  }
}

