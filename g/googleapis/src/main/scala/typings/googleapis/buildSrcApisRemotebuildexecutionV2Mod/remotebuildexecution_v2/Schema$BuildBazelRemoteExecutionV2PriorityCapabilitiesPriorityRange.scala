package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported range of priorities, including boundaries.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends js.Object {
  var maxPriority: js.UndefOr[Double] = js.native
  var minPriority: js.UndefOr[Double] = js.native
}

object Schema$BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  @scala.inline
  def apply(maxPriority: Int | Double = null, minPriority: Int | Double = null): Schema$BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    if (maxPriority != null) __obj.updateDynamic("maxPriority")(maxPriority.asInstanceOf[js.Any])
    if (minPriority != null) __obj.updateDynamic("minPriority")(minPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
}

