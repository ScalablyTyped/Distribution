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

