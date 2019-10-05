package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationConfig extends js.Object {
  /** Unique identifier for this computation. */
  var computationId: js.UndefOr[String] = js.undefined
  /** Instructions that comprise the computation. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.undefined
  /** Stage name of this computation. */
  var stageName: js.UndefOr[String] = js.undefined
  /** System defined name for this computation. */
  var systemName: js.UndefOr[String] = js.undefined
}

object StreamingComputationConfig {
  @scala.inline
  def apply(
    computationId: String = null,
    instructions: js.Array[ParallelInstruction] = null,
    stageName: String = null,
    systemName: String = null
  ): StreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId)
    if (instructions != null) __obj.updateDynamic("instructions")(instructions)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    if (systemName != null) __obj.updateDynamic("systemName")(systemName)
    __obj.asInstanceOf[StreamingComputationConfig]
  }
}

