package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed values for priority in ResultsCachePolicy Used for querying both
  * cache and execution valid priority ranges.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2PriorityCapabilities extends js.Object {
  var priorities: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2PriorityCapabilities {
  @scala.inline
  def apply(priorities: js.Array[Schema$BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange] = null): Schema$BuildBazelRemoteExecutionV2PriorityCapabilities = {
    val __obj = js.Dynamic.literal()
    if (priorities != null) __obj.updateDynamic("priorities")(priorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2PriorityCapabilities]
  }
}

