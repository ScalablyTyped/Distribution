package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionStageState extends js.Object {
  /** The time at which the stage transitioned to this state. */
  var currentStateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the execution stage. */
  var executionStageName: js.UndefOr[java.lang.String] = js.undefined
  /** Executions stage states allow the same set of values as JobState. */
  var executionStageState: js.UndefOr[java.lang.String] = js.undefined
}

object ExecutionStageState {
  @scala.inline
  def apply(
    currentStateTime: java.lang.String = null,
    executionStageName: java.lang.String = null,
    executionStageState: java.lang.String = null
  ): ExecutionStageState = {
    val __obj = js.Dynamic.literal()
    if (currentStateTime != null) __obj.updateDynamic("currentStateTime")(currentStateTime)
    if (executionStageName != null) __obj.updateDynamic("executionStageName")(executionStageName)
    if (executionStageState != null) __obj.updateDynamic("executionStageState")(executionStageState)
    __obj.asInstanceOf[ExecutionStageState]
  }
}

