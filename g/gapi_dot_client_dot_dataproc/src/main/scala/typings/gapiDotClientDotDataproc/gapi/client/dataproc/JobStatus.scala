package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatus extends js.Object {
  /** Output-only. Optional job state details, such as an error description if the state is <code>ERROR</code>. */
  var details: js.UndefOr[String] = js.undefined
  /** Output-only. A state message specifying the overall job state. */
  var state: js.UndefOr[String] = js.undefined
  /** Output-only. The time when this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.undefined
  /** Output-only. Additional state information, which includes status reported by the agent. */
  var substate: js.UndefOr[String] = js.undefined
}

object JobStatus {
  @scala.inline
  def apply(
    details: String = null,
    state: String = null,
    stateStartTime: String = null,
    substate: String = null
  ): JobStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime)
    if (substate != null) __obj.updateDynamic("substate")(substate)
    __obj.asInstanceOf[JobStatus]
  }
}

