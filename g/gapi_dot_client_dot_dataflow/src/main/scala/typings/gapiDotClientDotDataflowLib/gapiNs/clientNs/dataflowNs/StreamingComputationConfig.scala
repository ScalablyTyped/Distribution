package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationConfig extends js.Object {
  /** Unique identifier for this computation. */
  var computationId: js.UndefOr[java.lang.String] = js.undefined
  /** Instructions that comprise the computation. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.undefined
  /** Stage name of this computation. */
  var stageName: js.UndefOr[java.lang.String] = js.undefined
  /** System defined name for this computation. */
  var systemName: js.UndefOr[java.lang.String] = js.undefined
}

object StreamingComputationConfig {
  @scala.inline
  def apply(
    computationId: java.lang.String = null,
    instructions: js.Array[ParallelInstruction] = null,
    stageName: java.lang.String = null,
    systemName: java.lang.String = null
  ): StreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId)
    if (instructions != null) __obj.updateDynamic("instructions")(instructions)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    if (systemName != null) __obj.updateDynamic("systemName")(systemName)
    __obj.asInstanceOf[StreamingComputationConfig]
  }
}

